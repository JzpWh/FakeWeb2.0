package com.blackswan.fake.Action;

import java.util.List;

import org.apache.struts2.ServletActionContext;

import com.blackswan.fake.Bean.Administrator;
import com.blackswan.fake.Bean.Barber;
import com.blackswan.fake.ServiceImpl.BarberManager;
import com.blackswan.fake.Util.Tools;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ModelDriven;

public class BarberAction extends BaseAction implements ModelDriven<Barber> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3252806285217993501L;
	private BarberManager barberManager;
	private Barber barber = new Barber();
	// ´æ·ÅbarberÁÐ±í
	List<Barber> barberList;

	@Override
	public Barber getModel() {
		return barber;
	}

	public void setBarberManager(BarberManager barberManager) {
		this.barberManager = barberManager;
	}

	public String browseBarber() {
		Administrator tempAdmin = (Administrator) ServletActionContext
				.getRequest().getSession().getAttribute("admin");
		if (tempAdmin != null) {
			barberList = barberManager.listByAddressPage(tempAdmin
					.getAdministratorAddress());
			ActionContext.getContext().put("barberList", barberList);
			// System.out.print(barberList.size());
			return "browseBarber";
		} else { // ÌáÊ¾ÉÐÎ´µÇÂ¼»òµÇÂ¼Ê§Ð§
			Tools.hint("ÇëÏÈµÇÂ¼");

			return "login";
		}

	}

	public String deleteBarber() {
		Administrator tempAdmin = (Administrator) ServletActionContext
				.getRequest().getSession().getAttribute("admin");
		if (tempAdmin != null) {
			if (barber != null) {
				if (barberManager.delEntity(Barber.class, barber.getBId())) {
					Tools.hint("É¾³ý³É¹¦");
				} else {
					Tools.hint("É¾³ýÊ§°Ü");
				}
			} else {
				Tools.hint("É¾³ýÊ§°Ü,ID can't find");
			}
			// System.out.print(barberList.size());
			return browseBarber();
		} else { // ÌáÊ¾ÉÐÎ´µÇÂ¼»òµÇÂ¼Ê§
			Tools.hint("ÇëÏÈµÇÂ¼");
			return "login";
		}
	}
}
