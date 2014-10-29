package com.blackswan.fake.ServiceImpl;

import java.util.List;

import com.blackswan.fake.Bean.Administrator;
import com.blackswan.fake.Interface.IAdministratorManager;

public class AdministratorManager extends BaseServiceImpl<Administrator, Integer> implements IAdministratorManager { 
    
    /* (non-Javadoc)
     * @see com.blackswan.fake.ServiceImpl.IAdminstratorManager#loginByName(java.lang.String, java.lang.String)
     */
    @Override
    public List<Administrator> loginByName(String name,String pwd) {
	String hqlString = "from Administrator a where a.administratorName='"+name+"'and a.administratorPwd='"+pwd+"'";
	List<Administrator> administrator= getBaseDao().findAllByHQL(hqlString);
	return administrator; 
    }
    
    /* (non-Javadoc)
     * @see com.blackswan.fake.ServiceImpl.IAdminstratorManager#loginByPhone(java.lang.String, java.lang.String)
     */
    @Override
    public List<Administrator> loginByPhone(String phone,String pwd) {
	String hqlString = "from Administrator a where a.administratorTelephone = '"+phone+"'and a.administratorPwd ="+pwd+"'";
	List<Administrator> administrator= getBaseDao().findAllByHQL(hqlString);
	return administrator; 
    }
    
    /* (non-Javadoc)
     * @see com.blackswan.fake.ServiceImpl.IAdminstratorManager#findByFAdministrator(com.blackswan.fake.Bean.Administrator, int, int)
     */
    @Override
    public List<Administrator> findByFAdministrator(Administrator administrator) {
	System.out.println(administrator.getAdministratorId());
	String hqlString = "from Administrator a where a.administrator.administratorId ='"+administrator.getAdministratorId()+"'";
	
	List<Administrator> administrators = getBaseDao().findAllByHQL(hqlString);   
	System.out.println(administrators.size());
	return administrators;
	}
    
    /* (non-Javadoc)
     * @see com.blackswan.fake.ServiceImpl.IAdminstratorManager#findByAddress(java.lang.String, int, int)
     */
    @Override
    public List<Administrator> findByAddress(String administratorAddress)
	{
		String hqlString = "from Administrator a where a.administratorAddress like '%"+administratorAddress+"%'";
		return (List<Administrator>)getBaseDao().findAllByHQL(hqlString);
	}
	
	/* (non-Javadoc)
	 * @see com.blackswan.fake.ServiceImpl.IAdminstratorManager#findByRight(java.lang.String)
	 */
	@Override
	public List<Administrator> findByRight(String right)
	{
		String hqlString = "from Administrator a where a.administratorRight like '%"+right+"%'";
		return getBaseDao().findAllByHQL(hqlString);
	}
	

	/* (non-Javadoc)
	 * @see com.blackswan.fake.ServiceImpl.IAdminstratorManager#findByAddressRight(java.lang.String, java.lang.String)
	 */
	@Override
	public List<Administrator> findByAddressRight(String address,String right)
	{
		String hqlString = "from Administrator a where a.administratorAddress like '"+address+"%' and a.administratorRight like '"+right+"%'";
		return getBaseDao().findAllByHQL(hqlString);
	}

	/* (non-Javadoc)
	 * @see com.blackswan.fake.ServiceImpl.IAdminstratorManager#findByName(java.lang.String)
	 */
	@Override
	public List<Administrator> findByName(String name)
	{
		String hqlString="from Administrator ad where ad.administratorName like '%"+name+"%'";
		return getBaseDao().findAllByHQL(hqlString);
	}

	/* (non-Javadoc)
	 * @see com.blackswan.fake.ServiceImpl.IAdminstratorManager#isUnique(java.lang.String, java.lang.String, java.lang.String)
	 */
	@Override
	public boolean isUnique(String administratorName, String administratorAddress,
			String administratorRight)
	{
	    	System.out.println("进入判断是否唯一");
		String hqlString = "from Administrator a where a.administratorName ='"+administratorName+"' and a.administratorAddress = '"+administratorAddress+"' and a.administratorRight = '"+administratorRight+"'";	
		List<Administrator> list = getBaseDao().findAllByHQL(hqlString);
		System.out.println(list.size());
		if(list.size()== 0){
			return false;
		}
		return true;
	}

	/* (non-Javadoc)
	 * @see com.blackswan.fake.ServiceImpl.IAdminstratorManager#countByAddressRight(java.lang.String, java.lang.String)
	 */
	@Override
	public int countByAddressRight(String address, String right)
	{
		String hqlString = "from Administrator a where a.administratorAddress like '"+address+"%' and a.administratorRight like '"+right+"%'";
		return getBaseDao().getTotalCountByHQL(hqlString);
	}

	/* (non-Javadoc)
	 * @see com.blackswan.fake.ServiceImpl.IAdminstratorManager#countByAddress(java.lang.String)
	 */
	@Override
	public int countByAddress(String address)
	{
		String hqlString = "from Administrator a where a.administratorAddress like '"+address+"%'";
		return getBaseDao().getTotalCountByHQL(hqlString);
	}
	/* (non-Javadoc)
	 * @see com.blackswan.fake.ServiceImpl.IAdminstratorManager#countByRight(java.lang.String)
	 */
	@Override
	public int countByRight(String right)
	{
		String hqlString = "from Administrator a where a.administratorRight like '"+right+"%'";
		return getBaseDao().getTotalCountByHQL(hqlString);
	}
	/* (non-Javadoc)
	 * @see com.blackswan.fake.ServiceImpl.IAdminstratorManager#listAllByAddressRightPage(java.lang.String, java.lang.String, int, int)
	 */
	@Override
	public List<Administrator> listAllByAddressRightPage(String address,String right,int pageNo,int pageSize)
	{
		String[] propertyNames = {"administratorAddress","administratorRight"};
		String[] propertyValues = {address,right};
		return getBaseDao().findAllByPropertiesPage(Administrator.class, propertyNames, propertyValues, pageNo, pageSize);
	}

}
