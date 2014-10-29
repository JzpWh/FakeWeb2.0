package com.blackswan.fake.ServiceImpl;

import java.util.List;






import com.blackswan.fake.Bean.Administrator;
import com.blackswan.fake.Bean.Barber;
import com.blackswan.fake.Interface.IBarberManager;

public class BarberManager extends BaseServiceImpl<Barber, Integer>  {
	/* (non-Javadoc)
	 * @see com.blackswan.fake.ServiceImpl.BarberService#listAllByAddressRightPage(java.lang.String, java.lang.String, int, int)
	 */
	
	public List<Barber> listByAddressPage(String address)
	{
		// String hql = "select b from Barber b left join b.BarberShop bs where bs.SAddress like '"+address+"%' ";
		String hql = "from Barber b where b.barbershop.SAddress like '"+address+"%'";
		return getBaseDao().findAllByHQL(hql,null);
	}


	public int countByAddress(String address) {
		//String hqlString = "from Barber b where b.barbershop.SAddress like '?%'";
		String hql = "from Barber b where b.barbershop.SAddress like '"+address+"%'";
		return getBaseDao().getTotalCountByHQL(hql);
		//return getBaseDao().getTotalCountByHQL(hql,new Object[]{address});
	}


	

}
