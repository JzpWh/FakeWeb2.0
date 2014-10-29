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
    // ����ģ���������½�model���ڷ�װ����Ա��
    private Administrator administrator = new Administrator();
    // ��Ź���Ա�б�
    List<Administrator> adminList;
    // ���action֮�����ʾ��Ϣ
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

    // �������Ա��¼����
    public String login() throws IOException {
	List<Administrator> list = (List<Administrator>)administratorManager.browseAll(Administrator.class);
	Administrator administrator = new Administrator();
	Iterator<Administrator> iterator = list.iterator();
	while (iterator.hasNext())
	{
	    administrator = (Administrator) iterator.next();
	    String ph = "^[1][3578]\\d{9}$";
	    if (loginName.matches(ph)) // �ֻ��ŵ�¼
	    {
		if (loginName.trim().equals(
			administrator.getAdministratorTelephone())
			&& MD5.MD5Encode(loginPwd.trim()).equals(
				administrator.getAdministratorPwd())) {
		    ServletActionContext.getRequest().getSession()
			    .setAttribute("admin", administrator);
		    return "index";
		}
	    } else { // �˻�����¼
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
	hint("�˻������ֻ��ţ����������");
		return "login";		
	
}
    // �������Աע���˳�����
    public String logout() throws Exception {
	ServletActionContext.getRequest().getSession().removeAttribute("admin");
	//����loginҳ��
	hint("ע���ɹ���");
	return "login";
    }

    // �����������Ա����
    @SuppressWarnings("unused")
    public String browseAdmin() throws Exception{
	Administrator tempAdmin = (Administrator) ServletActionContext
		.getRequest().getSession().getAttribute("admin");
	System.out.println("�������Ա"+tempAdmin.getAdministratorAddress());
	if (tempAdmin != null) {
	    List<Administrator> administrators = administratorManager.findByFAdministrator(tempAdmin);
	    if (administrators != null) {
			ActionContext.getContext().put("administratorList", administrators);
			return "tobrowseAdmin";
	    	}else {
	    	    hint("�㻹δ��ӹ���������Ա��");
	    	    return "index";
	    	    
	    	}
	    
	    }else {
		hint("���ĵ�¼��Ϣ��ʧЧ�������µ�¼��");
		return logout();
	    }

    }

    // ������������Ա����
    public String addAdmin() throws Exception {
	System.out.println(administrator.getAdministratorName());
	Administrator tempAdmin = (Administrator) ServletActionContext
		.getRequest().getSession().getAttribute("admin");
	boolean unique = administratorManager.isUnique(
		administrator.getAdministratorName(), administrator.getAdministratorAddress(),
		administrator.getAdministratorRight());// �ж��û����Ƿ����
	System.out.println(unique);
	if (!unique) { // ����û�������
	    String address;
	    if (prov.equals("ʡ��")) {
		address = country;
	    }else {
		address = country+prov+city;
	    }
	    administrator.setAdministratorAddress(address);
	    administrator.setAdministrator(tempAdmin);
	    System.out.println("shit"+administrator.getAdprivileges());
	    administrator.setAdministratorPwd(MD5.MD5Encode("111111"));
	    if (administratorManager.saveOrUpdateEntity(administrator)) {
		// ����ҵ���߼�������������Ĺ���Ա
		hint("��ӹ���Ա�ɹ���");
	    } else {
		hint("��ӹ���Աʧ�ܣ����Ժ����ԣ�");
	    }
	} else {
	    //��ʾ�ù���Ա�Ѵ��ڣ������ظ����
	    hint("�ù���Ա����ӣ��벻Ҫ�ظ����!");
	}
	return browseAdmin();
    }
    
    //�鿴���û���ϸ��Ϣ������
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
    // ����鿴ϵͳ�û�����
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

    // �����޸Ĺ���Ա��Ϣ
    public String updateAdmin() {
	administrator.setAdministratorPwd(MD5.MD5Encode(administrator.getAdministratorPwd()));
	if (administratorManager.saveOrUpdateEntity(administrator)) {
	    addActionMessage(getText("admin_edit_succ"));
	} else {
	    addActionMessage(getText("admin_edit_fail"));
	}
	return INPUT;
    }

    // ����ɾ������Ա����
    public String delAdmin() throws Exception {
	if (administrator.getAdministratorId() != null) {
	    if (administratorManager.delEntity(Administrator.class,
		    administrator.getAdministratorId())) {
		hint("ɾ���ɹ���");
	    } else {
		hint("ɾ��ʧ�ܣ����Ժ����ԣ�");
	    }

	} else {
	    hint("ɾ��ʧ�ܣ�");
	}
	return browseAdmin();
    }

    // �����޸����������
    public String alterPwd() throws IOException {
	// ����ҵ���߼����װ��ָ���Ĺ���Ա
	Administrator tempadmin = (Administrator) ServletActionContext
		.getRequest().getSession().getAttribute("admin");
	if (oldpwd.equals(loginPwd)) {
	    hint("�����벻�ܺ;�������ͬ��");
	    return "alterfail";
	}else{
	if (MD5.MD5Encode(oldpwd.trim()).equals(tempadmin.getAdministratorPwd().trim())) {
	    // ��������
	    tempadmin.setAdministratorPwd(MD5.MD5Encode(loginPwd.trim()));
	    if (administratorManager.saveOrUpdateEntity(tempadmin)) {
		    // ����ҵ���߼��������ָ���Ĺ���Ա
		    hint("��ϲ���������޸ĳɹ���");
		    // ����ù���Ա�Ѿ���¼,ͬ���޸�session�еĻ�Ա��Ϣ
		    ServletActionContext.getRequest().getSession()
				    .setAttribute("admin", tempadmin);
		} else {
		    hint("�����޸Ĳ��ɹ������Ժ����ԣ�");
		    return "alterfail";
		}
	    return "index";
	}else {
	    hint("������ľ�����������˶Ժ������룡");
	    return "alterfail";
	    	}
	}
    }
    
    //�������������޸����������
//    public String  alterForgotPwd() {
//	
//    }
    
    public String researchAdmin() throws IOException {
	
	if (optionvalue.equals("1")) {
	    if (researchByName(researchkey)) {
	    }else {
		hint("���ݿ�û������"+researchkey+"�Ĺ���Ա��");
	    }
	}
	if (optionvalue.equals("2")) {
	    if (researchByPart(researchkey)) {
	    }else {
		hint("���ݿ⻹û��"+researchkey+"���ŵĹ���Ա��");
	    }
	}
	if (optionvalue.equals("3")) {
	    if (researchByCity(researchkey)) {
	    }else {
		hint("���ݿ�û��"+researchkey+"��������Ĺ���Ա��");
	    }
	}
	return "toresearch";
    }
    //�����˻������ҹ���Ա����
    public boolean researchByName(String name) throws IOException {
	List<Administrator> tempAdmin1=administratorManager.findByName(name);
	if (tempAdmin1.size()!=0) {
	    ActionContext.getContext().put("researchList", tempAdmin1);
	    return true;
	}else {
	    return false;
	}
    }
    
    //�������в��ҹ���Ա����
    public  boolean  researchByCity(String city) throws IOException {
	List<Administrator> tempAdmin = administratorManager.findByAddress(city);
	if (tempAdmin.size()!=0) {
	    ActionContext.getContext().put("researchList", tempAdmin);
	    return true;
	}else {	    
	    return false;
	}
    }
    
    //�������Ų��ҹ���Ա����
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
	// ����ҵ���߼����װ��ָ���Ĺ���Ա
	Administrator tempadmin = (Administrator) ServletActionContext
			.getRequest().getSession().getAttribute("admin");
	if (newtelephone.equals(tempadmin.getAdministratorTelephone())) {
	    hint("������Ϣû�иĶ���");
	}else {
	    tempadmin.setAdministratorTelephone(newtelephone);
		if (administratorManager.saveOrUpdateEntity(tempadmin)) {
			    	// ����ҵ���߼��������ָ���Ĺ���Ա
			        hint("�ֻ����޸ĳɹ���");
			} else {
			    	hint("�ֻ������޸�ʧ�ܣ�");
			}
			// ����ù���Ա�Ѿ���¼,ͬ���޸�session�еĻ�Ա��Ϣ
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
