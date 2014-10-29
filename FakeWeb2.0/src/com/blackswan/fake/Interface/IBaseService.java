package com.blackswan.fake.Interface;

import java.io.Serializable;
import java.util.List;

public interface IBaseService<T extends Serializable,PK extends Serializable>
{
	//浏览对象所有记录
	List<T> browseAll(Class<T> entityClass);
	//浏览某一页对象记录
	List<T> browseAll(Class<T> entityClass,int pageNo,int pageSize);
	//统计对象总数
	int countAll(Class<T> entityClass);
	//装载指定对象
	T loadEntity(Class<T> entityClass,PK id);
	//删除指定对象
	boolean delEntity(Class<T> entityClass,PK id);
	//新增或修改某一对象
	boolean saveOrUpdateEntity(T entity);	
	public List<T> findAllByProperty(Class<T> entityClass, String propertyName,
			Object propertyValue);
}
