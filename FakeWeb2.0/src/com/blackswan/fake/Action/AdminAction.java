package com.blackswan.fake.Action;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import com.blackswan.fake.Bean.Administrator;
import com.blackswan.fake.ServiceImpl.AdministratorManager;
import com.blackswan.fake.Util.MD5;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ModelDriven;

public class AdminAction extends BaseAction implements
	ModelDriven<Administrator> {

    private static final long serialVersionUID = -7411374355200162204L;
    AdministratorManager administratorManager;
    // 采用模型驱动，新建model用于封装管理员类
    private Administrator administrator = new Administrator();
    // 存放管理员列表
    List<Administrator> adminList;
    // 存放action之间的提示信息
    String actionMsg;
    private String newtelephone;
    private String oldpwd;
    private String country;
    private String prov;
    private String city;
    private String optionvalue;
    private String researchkey;
    public String getOptionvalue() {
        return optionvalue;
    }

    public void setOptionvalue(String optionvalue) {
        this.optionvalue = optionvalue;
    }

    public String getResearchkey() {
        return researchkey;
    }

    public void setResearchkey(String researchkey) {
        this.researchkey = researchkey;
    }

    private String loginName;
    private String loginPwd;

    
    @Override
    public Administrator getModel() {
	       return administrator;
    }

    public String getOldpwd() {
	return oldpwd;
    }

    public void setOldpwd(String oldpwd) {
	this.oldpwd = oldpwd;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getProv() {
        return prov;
    }

    public void setProv(String prov) {
        this.prov = prov;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getNewtelephone() {
        return newtelephone;
    }

    public void setNewtelephone(String newtelephone) {
        this.newtelephone = newtelephone;
    }
    
    public String getLoginName() {
	return loginName;
    }

    public void setLoginName(String loginName) {
	this.loginName = loginName;
    }

    public String getLoginPwd() {
	return loginPwd;
    }

    public void setLoginPwd(String loginPwd) {
	this.loginPwd = loginPwd;
    }

    public void setAdministratorManager(
	    AdministratorManager administratorManager) {
	this.administratorManager = administratorManager;
    }

    // 处理管理员登录请求
    public String login() throws IOException {
	List<Administrator> list = (List<Administrator>)administratorManager.browseAll(Administrator.class);
	Administrator administrator = new Administrator();
	Iterator<Administrator> iterator = list.iterator();
	while (iterator.hasNext())
	{
	    administrator = (Administrator) iterator.next();
	    String ph = "^[1][3578]\\d{9}$";
	    if (loginName.matches(ph)) // 手机号登录
	    {
		if (loginName.trim().equals(
			administrator.getAdministratorTelephone())
			&& MD5.MD5Encode(loginPwd.trim()).equals(
				administrator.getAdministratorPwd())) {
		    ServletActionContext.getRequest().getSession()
			    .setAttribute("admin", administrator);
		    return "index";
		}
	    } else { // 账户名登录
		if (loginName.trim().equals(
			administrator.getAdministratorName())
			&&MD5.MD5Encode(loginPwd.trim()).equals(
				administrator.getAdministratorPwd())) {
		    System.out.println(administrator.getAdministratorAddress());
		    
		    ServletActionContext.getRequest().getSession()
			    .setAttribute("admin", administrator);
		    return "index";
		}
	    }
	}
	hint("账户名（手机号）或密码错误！");
		return "login";		
	
}
    // 处理管理员注销退出请求
    public String logout() throws Exception {
	ServletActionContext.getRequest().getSession().removeAttribute("admin");
	//返回login页面
	hint("注销成功！");
	return "login";
    }

    // 处理浏览管理员请求
    @SuppressWarnings("unused")
    public String browseAdmin() throws Exception{
	Administrator tempAdmin = (Administrator) ServletActionContext
		.getRequest().getSession().getAttribute("admin");
	System.out.println("浏览管理员"+tempAdmin.getAdministratorAddress());
	if (tempAdmin != null) {
	    List<Administrator> administrators = administratorManager.findByFAdministrator(tempAdmin);
	    if (administrators != null) {
			ActionContext.getContext().put("administratorList", administrators);
			return "tobrowseAdmin";
	    	}else {
	    	    hint("你还未添加过其他管理员！");
	    	    return "index";
	    	    
	    	}
	    
	    }else {
		hint("您的登录信息已失效，请重新登录！");
		return logout();
	    }

    }

    // 处理新增管理员请求
    public String addAdmin() throws Exception {
	System.out.println(administrator.getAdministratorName());
	Administrator tempAdmin = (Administrator) ServletActionContext
		.getRequest().getSession().getAttribute("admin");
	boolean unique = administratorManager.isUnique(
		administrator.getAdministratorName(), administrator.getAdministratorAddress(),
		administrator.getAdministratorRight());// 判断用户名是否可用
	System.out.println(unique);
	if (!unique) { // 如果用户名可用
	    String address;
	    if (prov.equals("省份")) {
		address = country;
	    }else {
		address = country+prov+city;
	    }
	    administrator.setAdministratorAddress(address);
	    administrator.setAdministrator(tempAdmin);
	    System.out.println("shit"+administrator.getAdprivileges());
	    administrator.setAdministratorPwd(MD5.MD5Encode("111111"));
	    if (administratorManager.saveOrUpdateEntity(administrator)) {
		// 调用业务逻辑组件保存新增的管理员
		hint("添加管理员成功！");
	    } else {
		hint("添加管理员失败，请稍后重试！");
	    }
	} else {
	    //提示该管理员已存在，请勿重复添加
	    hint("该管理员已添加，请不要重复添加!");
	}
	return browseAdmin();
    }
    
    //查看本用户详细信息的请求
    public String viewInfo() {
	Administrator tempAdmin = (Administrator) ServletActionContext
		.getRequest().getSession().getAttribute("admin");
	if (tempAdmin != null) {
	    return "viewInfo";
	}else {
	    addActionMessage(getText("admin_loginout"));
	    return "login";
	}
    }
    // 处理查看系统用户请求
    @SuppressWarnings("deprecation")
    public String viewAdmin() {
	if (administrator.getAdministratorId() != null) {
	    Administrator tempAdmin = administratorManager.loadEntity(
		    Administrator.class, administrator.getAdministratorId());
	    if (tempAdmin != null) {
		administrator.setAdministrator(tempAdmin);
		return SUCCESS;
	    } else {
		actionMsg = getText("admin_view_fail");
		actionMsg = java.net.URLEncoder.encode(actionMsg);
		return "toBrowseAdmin";
	    }
	} else {
	    actionMsg = getText("admin_view_fail");
	    actionMsg = java.net.URLEncoder.encode(actionMsg);
	    return "toBrowseAdmin";
	}
    }

    // 处理修改管理员信息
    public String updateAdmin() {
	administrator.setAdministratorPwd(MD5.MD5Encode(administrator.getAdministratorPwd()));
	if (administratorManager.saveOrUpdateEntity(administrator)) {
	    addActionMessage(getText("admin_edit_succ"));
	} else {
	    addActionMessage(getText("admin_edit_fail"));
	}
	return INPUT;
    }

    // 处理删除管理员请求
    public String delAdmin() throws Exception {
	if (administrator.getAdministratorId() != null) {
	    if (administratorManager.delEntity(Administrator.class,
		    administrator.getAdministratorId())) {
		hint("删除成功！");
	    } else {
		hint("删除失败，请稍后重试！");
	    }

	} else {
	    hint("删除失败！");
	}
	return browseAdmin();
    }

    // 处理修改密码的请求
    public String alterPwd() throws IOException {
	// 调用业务逻辑组件装载指定的管理员
	Administrator tempadmin = (Administrator) ServletActionContext
		.getRequest().getSession().getAttribute("admin");
	if (oldpwd.equals(loginPwd)) {
	    hint("新密码不能和旧密码相同！");
	    return "alterfail";
	}else{
	if (MD5.MD5Encode(oldpwd.trim()).equals(tempadmin.getAdministratorPwd().trim())) {
	    // 更新密码
	    tempadmin.setAdministratorPwd(MD5.MD5Encode(loginPwd.trim()));
	    if (administratorManager.saveOrUpdateEntity(tempadmin)) {
		    // 调用业务逻辑组件更新指定的管理员
		    hint("恭喜您，密码修改成功！");
		    // 如果该管理员已经登录,同步修改session中的会员信息
		    ServletActionContext.getRequest().getSession()
				    .setAttribute("admin", tempadmin);
		} else {
		    hint("密码修改不成功，请稍后再试！");
		    return "alterfail";
		}
	    return "index";
	}else {
	    hint("您输入的旧密码有误，请核对后再输入！");
	    return "alterfail";
	    	}
	}
    }
    
    //处理忘记密码修改密码的请求
//    public String  alterForgotPwd() {
//	
//    }
    
    public String researchAdmin() throws IOException {
	
	if (optionvalue.equals("1")) {
	    if (researchByName(researchkey)) {
	    }else {
		hint("数据库没有名叫"+researchkey+"的管理员！");
	    }
	}
	if (optionvalue.equals("2")) {
	    if (researchByPart(researchkey)) {
	    }else {
		hint("数据库还没有"+researchkey+"部门的管理员！");
	    }
	}
	if (optionvalue.equals("3")) {
	    if (researchByCity(researchkey)) {
	    }else {
		hint("数据库没有"+researchkey+"这个地区的管理员！");
	    }
	}
	return "toresearch";
    }
    //处理按账户名查找管理员请求
    public boolean researchByName(String name) throws IOException {
	List<Administrator> tempAdmin1=administratorManager.findByName(name);
	if (tempAdmin1.size()!=0) {
	    ActionContext.getContext().put("researchList", tempAdmin1);
	    return true;
	}else {
	    return false;
	}
    }
    
    //处理按城市查找管理员请求
    public  boolean  researchByCity(String city) throws IOException {
	List<Administrator> tempAdmin = administratorManager.findByAddress(city);
	if (tempAdmin.size()!=0) {
	    ActionContext.getContext().put("researchList", tempAdmin);
	    return true;
	}else {	    
	    return false;
	}
    }
    
    //处理按部门查找管理员请求
    public boolean researchByPart(String right) throws IOException {
	List<Administrator> tempAdmin = administratorManager.findByRight(right);
	if (tempAdmin.size()!=0) {
	    ActionContext.getContext().put("researchList", tempAdmin);
	    return true;
	}else {
	    
	    return false;
	}
    }
    
    public String alterTelephone() throws IOException {
	// 调用业务逻辑组件装载指定的管理员
	Administrator tempadmin = (Administrator) ServletActionContext
			.getRequest().getSession().getAttribute("admin");
	if (newtelephone.equals(tempadmin.getAdministratorTelephone())) {
	    hint("您的信息没有改动！");
	}else {
	    tempadmin.setAdministratorTelephone(newtelephone);
		if (administratorManager.saveOrUpdateEntity(tempadmin)) {
			    	// 调用业务逻辑组件更新指定的管理员
			        hint("手机号修改成功！");
			} else {
			    	hint("手机号码修改失败！");
			}
			// 如果该管理员已经登录,同步修改session中的会员信息
			if (ServletActionContext.getRequest().getSession()
				.getAttribute("admin") != null) {
			    ServletActionContext.getRequest().getSession()
				    .setAttribute("admin", tempadmin);
			}
	}
		    
		return "index";
    }

    public void hint(String hintstring) throws IOException {
	HttpServletResponse response = ServletActionContext.getResponse();
	response.setContentType("text/html; charset=UTF-8");
	PrintWriter out = response.getWriter();
	out.flush();
	out.println("<script>");
	out.println("alert('"+hintstring+"');");
	out.println("</script>");
    }
}
