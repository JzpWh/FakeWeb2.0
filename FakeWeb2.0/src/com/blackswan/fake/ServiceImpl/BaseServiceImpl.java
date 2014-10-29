package com.blackswan.fake.ServiceImpl;

import java.io.Serializable;
import java.util.List;

import com.blackswan.fake.Interface.IBaseDao;
import com.blackswan.fake.Interface.IBaseService;


public class BaseServiceImpl<T extends Serializable, PK extends Serializable> implements IBaseService<T, PK>
{
	private IBaseDao<T, PK> baseDao;
	
	public IBaseDao<T, PK> getBaseDao()
	{
		return baseDao;
	}

	public void setBaseDao(IBaseDao<T, PK> baseDao)
	{
		this.baseDao = baseDao;
	}

	@Override
	public List<T> browseAll(Class<T> entityClass)
	{
	    System.out.println("logincurrent");
		return baseDao.findAll(entityClass);
	}

	@Override
	public List<T> browseAll(Class<T> entityClass, int pageNo, int pageSize)
	{
		return baseDao.findAllByPage(entityClass, pageNo, pageSize);
	}

	@Override
	public int countAll(Class<T> entityClass)
	{
		return baseDao.getTotalCount(entityClass);
	}

	@Override
	public T loadEntity(Class<T> entityClass, PK id)
	{
		return baseDao.load(entityClass, id);
	}

	@Override
	public boolean delEntity(Class<T> entityClass, PK id)
	{
		boolean status = false;
		try
		{
			 baseDao.deleteById(entityClass, id);
			 status = true;
		} catch (Exception e)
		{
			e.printStackTrace();
		}
		return status;
		
	}

	@Override
	public boolean saveOrUpdateEntity(T entity)
	{
		boolean status = false;
		try
		{
			baseDao.saveorupdate(entity);
			status = true; 
		} catch (Exception e)
		{
			e.printStackTrace();
		}
		return status;
	}

	@Override
	public List<T> findAllByProperty(Class<T> entityClass, String propertyName,
			Object propertyValue) {
		return	baseDao.findAllByProperty(entityClass, propertyName, propertyValue);
	}
	

}
