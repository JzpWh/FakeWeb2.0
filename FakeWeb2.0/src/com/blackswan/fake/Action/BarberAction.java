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
	// ���barber�б�
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
		} else { // ��ʾ��δ��¼���¼ʧЧ
			Tools.hint("���ȵ�¼");

			return "login";
		}

	}

	public String deleteBarber() {
		Administrator tempAdmin = (Administrator) ServletActionContext
				.getRequest().getSession().getAttribute("admin");
		if (tempAdmin != null) {
			if (barber != null) {
				if (barberManager.delEntity(Barber.class, barber.getBId())) {
					Tools.hint("ɾ���ɹ�");
				} else {
					Tools.hint("ɾ��ʧ��");
				}
			} else {
				Tools.hint("ɾ��ʧ��,ID can't find");
			}
			// System.out.print(barberList.size());
			return browseBarber();
		} else { // ��ʾ��δ��¼���¼ʧ
			Tools.hint("���ȵ�¼");
			return "login";
		}
	}
}
