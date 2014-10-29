package com.blackswan.fake.ServiceImpl;

import java.util.List;

import com.blackswan.fake.Bean.Customer;

public class CustomerManager extends BaseServiceImpl<Customer, Integer> {

	public List<Customer> listByAddress(String address)
	{
		
		String hql = "from Customer c where c.CAddress like '"+address+"%'";
		return getBaseDao().findAllByHQL(hql,null);
	}
}
