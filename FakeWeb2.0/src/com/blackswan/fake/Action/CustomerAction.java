package com.blackswan.fake.Action;

import java.util.List;

import org.apache.struts2.ServletActionContext;

import com.blackswan.fake.Bean.Administrator;
import com.blackswan.fake.Bean.Customer;
import com.blackswan.fake.ServiceImpl.CustomerManager;
import com.blackswan.fake.Util.Tools;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ModelDriven;

@SuppressWarnings("serial")
public class CustomerAction extends BaseAction implements ModelDriven<Customer>{
	/**
	 * 
	 */
	private CustomerManager CustomerManager;
	private Customer Customer = new Customer();
	// ´æ·ÅCustomerÁÐ±í
	List<Customer> CustomerList;

	@Override
	public Customer getModel() {
		return Customer;
	}

	public void setCustomerManager(CustomerManager CustomerManager) {
		this.CustomerManager = CustomerManager;
	}

	public String browseCustomer() {
		Administrator tempAdmin = (Administrator) ServletActionContext
				.getRequest().getSession().getAttribute("admin");
		if (tempAdmin != null) {
			CustomerList = CustomerManager.listByAddress(tempAdmin
					.getAdministratorAddress());
			ActionContext.getContext().put("CustomerList", CustomerList);
			// System.out.print(CustomerList.size());
			return "browseCustomer";
		} else { // ÌáÊ¾ÉÐÎ´µÇÂ¼»òµÇÂ¼Ê§Ð§
			Tools.hint("ÇëÏÈµÇÂ¼");

			return "login";
		}

	}

	public String deleteCustomer() {
		Administrator tempAdmin = (Administrator) ServletActionContext
				.getRequest().getSession().getAttribute("admin");
		if (tempAdmin != null) {
			if (Customer != null) {
				if (CustomerManager.delEntity(Customer.class, Customer.getCId())) {
					Tools.hint("É¾³ý³É¹¦");
				} else {
					Tools.hint("É¾³ýÊ§°Ü");
				}
			} else {
				Tools.hint("É¾³ýÊ§°Ü,ID can't find");
			}
			// System.out.print(CustomerList.size());
			return browseCustomer();
		} else { // ÌáÊ¾ÉÐÎ´µÇÂ¼»òµÇÂ¼Ê§
			Tools.hint("ÇëÏÈµÇÂ¼");
			return "login";
		}
	}
}
