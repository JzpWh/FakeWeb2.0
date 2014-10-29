package com.blackswan.fake.Interface;

import java.io.Serializable;
import java.util.List;

import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projection;

public interface IBaseDao<T extends Serializable, PK extends Serializable>
{
	/***************************************************************************
	 * ����
	 **************************************************************************/
	public abstract Serializable save(T entity);
	/***************************************************************************
	 * ����
	 **************************************************************************/
	public abstract void update(T t);
	public abstract void update(String hql, Object[] params);
	public abstract void update(Class<T> entityClass, String pkName, Object pkValue,
			String propName, Object propValue);
	public abstract void update(Class<T> entityClass, String pkName, Object pkValue,
			String[] propNames, Object[] propValues);
	public abstract void saveorupdate(T entity);
	public abstract T get(Class<T> entityClass,PK id);
	public abstract T load(Class<T> entityClass,PK id);

	/***************************************************************************
	 * ɾ��
	 **************************************************************************/
	public abstract void delete(T entity);
	public abstract void deleteById(Class<T> entityClass, PK id);
	public abstract void deleteByProperty(Class<T> entityClass, String propName, Object propValue);
	public abstract void deleteByProperty(Class<T> entityClass, String[] propNames,
			Object[] propValues);

	/***************************************************************************
	 * ��ѯ
	 **************************************************************************/
	public abstract T findEnityById(Class<T> entityClass, PK id);
	public abstract List<T> findAll(Class<T> entityClass);
	public abstract List<T> findAllAsc(Class<T> entityClass, String orderProperty);
	public abstract List<T> findAllDesc(Class<T> entityClass, String orderProperty);
	public abstract List<T> findAll_order(Class<T> entityClass, String orderProperty,
			String orderType);

	/*
	 * �Զ������� ��ѯ����ʵ�弯��
	 * 
	 * @param entityClass
	 *            ʵ��������Ϣ
	 * @return ��ѯ����ʵ����󼯺�
	 */
	public abstract List<T> findAll_order(Class<T> entityClass, String orderDesc);
	public abstract List<T> findAllByProperty(Class<T> entityClass, String propertyName,
			Object propertyValue);
	public abstract List<T> findAllByProperty_order(Class<T> entityClass, String propertyName,
			Object propertyValue, String orderDesc);
	public abstract List<T> findAllByProperties(Class<T> entityClass, String[] propertyNames,
			Object[] propertyValues);
	public abstract List<T> findAllByProperties_order(Class<T> entityClass, String[] propertyNames,
			Object[] propertyValues, String orderDesc);
	public abstract List<T> findAllByLikeProperty(Class<T> entityClass, String propertyName,
			String propertyValue);
	public abstract List<T> findAllByLikeProperty_order(Class<T> entityClass, String propertyName,
			String propertyValue, String orderDesc);
	public abstract List<T> findAllByHQL(String hql);
	public abstract List<T> findAllByHQL(String hql, Object[] params);
	public abstract List<T> findAllByPage(Class<T> entityClass, int start, int limit);
	public abstract List<T> findAllByPage_order(Class<T> entityClass, String orderDesc, int start,
			int limit);
	public abstract List<T> findAllByPropertyPage(Class<T> entityClass, String propertyName,
			Object propertyValue, int start, int limit);
	public abstract List<T> findAllByPropertyPage_order(Class<T> entityClass, String propertyName,
			Object propertyValue, String orderDesc, int start, int limit);
	public abstract List<T> findAllByPropertiesPage(Class<T> entityClass, String[] propertyNames,
			Object[] propertyValues, int start, int limit);
	public abstract List<T> findAllByPropertiesPage_order(Class<T> entityClass,
			String[] propertyNames, Object[] propertyValues, String orderDesc, int start, int limit);
	public abstract List<T> findAllByLikePropertyPage(Class<T> entityClass, String propertyName,
			String propertyValue, int start, int limit);
	public abstract List<T> findAllByLikePropertyPage_order(Class<T> entityClass,
			String propertyName, String propertyValue, String orderDesc, int start, int limit);
	public abstract List<T> findAllByHQLPage(String hql, Object[] params, int start, int limit);
	public abstract int getTotalCount(Class<T> entityClass);
	public abstract int getTotalCountByHQL(String hql, Object[] params);
	public abstract int getTotalCountByHQL(String hql);

	/***************************************************************************
	 * ���²�����QBE��ѯ
	 **************************************************************************/
	public abstract List<T> findAllByQBE(Class<T> entityClass, T example);
	public abstract List<T> findAllByQBEPage(Class<T> entityClass, T example, int start, int limit);
	public abstract List<T> findAllByQBEPage(Class<T> entityClass, T example, int start, int limit,
			Order[] orders);
	public abstract Object getStatisticalValueByQBE(Class<T> entityClass, T example,
			Projection projection);
	public abstract Integer getTotalCountByExample(Class<T> entityClass, T example);

	/***************************************************************************
	 * ������QBC��ѯ
	 **************************************************************************/
	public abstract Object findAllByQBCPage(Class<T> entityClass, int start, int limit,
			Criterion[] criterions, Order[] orders, Projection[] projs, boolean isUniqueResult);
	public abstract List<T> findAllByQBCPage(Class<T> entityClass, int start, int limit,
			Criterion[] criterions, Order[] orders);
	public abstract List<T> findAllByQBCPage(Class<T> entityClass, int start, int limit,
			Criterion[] criterions);
	public abstract List<T> findAllByQBCPage(Class<T> entityClass, Criterion[] criterions);
	public abstract Integer getTotalCountByQBC(Class<T> entityClass, Criterion[] criterions);

}
