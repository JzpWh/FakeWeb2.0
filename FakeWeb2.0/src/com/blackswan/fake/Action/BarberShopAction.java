package com.blackswan.fake.Action;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.blackswan.fake.Bean.Barbershop;
import com.blackswan.fake.ServiceImpl.BarberShopManager;
import com.blackswan.fake.Util.MD5;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ModelDriven;

/**
 * 
 * @author dingxinxin
 *
 */
public class BarberShopAction extends BaseAction implements ModelDriven<Barbershop>{

	private Integer barberShopId;
	
	private Barbershop model = new Barbershop();
	
	private BarberShopManager barberShopManager;
	
	public Integer getBarberShopId() {
		return barberShopId;
	}

	public void setBarberShopId(Integer barberShopId) {
		this.barberShopId = barberShopId;
	}

	public BarberShopManager getBarberShopManager() {
		return barberShopManager;
	}

	public void setBarberShopManager(BarberShopManager barberShopManager) {
		this.barberShopManager = barberShopManager;
	}
	/**
	 * 浏览理发店
	 * @return
	 */
	public String browseBarberShop() {
		List<Barbershop> barberShopList = barberShopManager.browseAll(Barbershop.class);
		ActionContext.getContext().put("barberShopList", barberShopList);
		return "browseBarberShop";
	}
	/**
	 * 删除理发店
	 * @return
	 */
	public String deleteBarberShop(){
		System.out.println("aaa");
		barberShopManager.delEntity(Barbershop.class, model.getSId());
		return "deleteBarberShop";
	}
	/**
	 * 添加理发店
	 * @return
	 */
	public String addBarberShop(){
		Date now = new Date();
		model.setSCreatetime(new Timestamp(now.getTime()));
		model.setSInfotime(new Timestamp(now.getTime()));
		model.setSShopmanager("陈松松");
		model.setSAudited(false);
		String pwdMD5 = MD5.MD5Encode("88888888");
		model.setSPwd(pwdMD5);
		barberShopManager.saveOrUpdateEntity(model);
		return "addBarberShop";
	}
	/**
	 *保存或修改理发店信息
	 * @return
	 */
	public String saveOrUpdateBarberShop(){
		barberShopManager.saveOrUpdateEntity(model);
		return "saveOrUpdateBarberShop";
	}
	/**
	 * 审核理发店
	 * @return
	 */
	public String auditBarberShop(){
		System.out.println("dfdf");
		List<Barbershop> barbershoplist = barberShopManager.findAllByProperty(Barbershop.class, "SAudited", false);
		System.out.println(barbershoplist.isEmpty()+"df");
		ActionContext.getContext().put("barbershoplist", barbershoplist);
		return "auditBarberShop";
	}
	@Override
	public Barbershop getModel() {
		// TODO Auto-generated method stub
		return model;
	}

}
