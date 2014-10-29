package com.blackswan.fake.Interface;

import java.util.List;

import com.blackswan.fake.Bean.Barber;

public interface IBarberManager {

	/* (non-Javadoc)
	 * @see com.blackswan.fake.ServiceImpl.BarberService#listAllByAddressRightPage(java.lang.String, java.lang.String, int, int)
	 */
	List<Barber> listByAddressPage(String address, int pageNo, int pageSize);
	int countByAddress(String address);
}