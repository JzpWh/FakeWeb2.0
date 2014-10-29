package com.blackswan.fake.Dao;

import java.io.Serializable;
import java.sql.SQLException;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Example;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import com.blackswan.fake.Interface.IBaseDao;

@SuppressWarnings("unchecked")
/**
 * T extends Serializable T��ʵ����һ��ռλ��, ��Ҳ���Ի���������ĸ,����Ϊ���� ��������Ҫһ������ʱ,���Ƕ�T��ռλ,��ʾType ,
 * �����extends Serializable ��ʾ��ʵ��Ӧ�ù�����,�滻T�����ͱ���ʵ��Serializable�ӿ�. PK => Primary
 * Key
 */
@Repository
public  class BaseDaoImpl<T extends Serializable, PK extends Serializable> extends HibernateDaoSupport implements IBaseDao<T, PK>{

 
 /* (non-Javadoc)
 * @see com.blackswan.fake.Dao.BaseDao#save(T)
 */
 @Override
public Serializable save(T entity) {
  return super.getHibernateTemplate().save(entity);
 }
 

 /* (non-Javadoc)
 * @see com.blackswan.fake.Dao.BaseDao#update(T)
 */
 @Override
public void update(T t) {
  super.getHibernateTemplate().update(t);
 }

 /* (non-Javadoc)
 * @see com.blackswan.fake.Dao.BaseDao#update(java.lang.String, java.lang.Object[])
 */
@SuppressWarnings("rawtypes")
@Override
public void update(final String hql, final Object[] params) {
  // ʹ�ûص��ӿ���ɲ���
  super.getHibernateTemplate().executeWithNativeSession(
    new HibernateCallback() { 
     public Object doInHibernate(Session session) throws HibernateException, SQLException {
      Query query = session.createQuery(hql);
      System.out.println(hql);
      for (int i = 0; i < params.length; i++) {
       query.setParameter(i, params[i]);
      }
      query.executeUpdate();
      return null;
     }
    });
 }
 
 /* (non-Javadoc)
 * @see com.blackswan.fake.Dao.BaseDao#update(java.lang.Class, java.lang.String, java.lang.Object, java.lang.String, java.lang.Object)
 */
@Override
public void update(Class<T> entityClass,String pkName,Object pkValue,String propName,Object propValue){
  this.update(entityClass, pkName, pkValue, new String[]{propName}, new Object[]{propValue});
 }
 
 /* (non-Javadoc)
 * @see com.blackswan.fake.Dao.BaseDao#update(java.lang.Class, java.lang.String, java.lang.Object, java.lang.String[], java.lang.Object[])
 */
@Override
public void update(Class<T> entityClass,String pkName,Object pkValue,String[] propNames,Object[] propValues){
  if (!(propNames!=null&&propValues!=null&&propNames.length==propValues.length&&propNames.length>0)) {
   throw new RuntimeException("��ȷ���ṩ�Ĳ�������ȷ��!�������Ƶĸ���������ֵ�ĸ�������һ��!�����ṩ����һ����������!");
  }
  String entityName = entityClass.getName();
  if (entityName.lastIndexOf(".")!=-1) {
   entityName = entityName.substring(entityName.lastIndexOf(".")+1);
  }
  String hql = "update "+entityName+" obj set ";
  for (int i = 0; i < propValues.length; i++) {
   hql += "obj."+propNames[i]+" =? and ";
  }
  if (hql.lastIndexOf("and")!=-1) {
   hql = hql .substring(0,hql.lastIndexOf("and"));
  }
  hql += " where obj."+pkName+" = ?";
  Object[] ps = new Object[propValues.length+1];
  for (int i = 0; i < propValues.length; i++) {
   ps[i] = propValues[i];
  }
  ps[ps.length-1] = pkValue;
  this.update(hql,ps);
 }

 /* (non-Javadoc)
 * @see com.blackswan.fake.Dao.BaseDao#saveorupdate(T)
 */
@Override
public void saveorupdate(T entity) {
  super.getHibernateTemplate().saveOrUpdate(entity);
 }

 /* (non-Javadoc)
 * @see com.blackswan.fake.Dao.BaseDao#delete(T)
 */
 @Override
public void delete(T entity) {
  super.getHibernateTemplate().delete(entity);
 }
 /* (non-Javadoc)
 * @see com.blackswan.fake.Dao.BaseDao#deleteById(java.lang.Class, PK)
 */
@Override
public void deleteById(Class<T> entityClass, PK id) {
  super.getHibernateTemplate().delete(this.findEnityById(entityClass, id));
 }
 /* (non-Javadoc)
 * @see com.blackswan.fake.Dao.BaseDao#deleteByProperty(java.lang.Class, java.lang.String, java.lang.Object)
 */
@Override
public void deleteByProperty(final Class<T> entityClass,final String propName,final Object propValue){
  this.deleteByProperty(entityClass,  new String[]{propName}, new Object[]{propValue});
 }
 
 /* (non-Javadoc)
 * @see com.blackswan.fake.Dao.BaseDao#deleteByProperty(java.lang.Class, java.lang.String[], java.lang.Object[])
 */
@Override
public void deleteByProperty(final Class<T> entityClass,final String[] propNames,final Object[] propValues){
  if (!(propNames!=null&&propValues!=null&&propNames.length==propValues.length&&propNames.length>0)) {
   throw new RuntimeException("��ȷ���ṩ�Ĳ�������ȷ��!�������Ƶĸ���������ֵ�ĸ�������һ��!�����ṩ����һ����������!");
  }
  String entityName = entityClass.getName();
  if (entityName.lastIndexOf(".")!=-1) {
   entityName = entityName.substring(entityName.lastIndexOf(".")+1);
  }
  String hql = "delete from "+entityName+" obj where ";
  for (int i = 0; i < propNames.length; i++) {
   hql += " obj."+propNames[i]+" = ? and ";
  }
  if (hql.lastIndexOf("and")!=-1) {
   hql = hql .substring(0,hql.lastIndexOf("and"));
  }
  this.update(hql, propValues);
 }
 
 /* (non-Javadoc)
 * @see com.blackswan.fake.Dao.BaseDao#findEnityById(java.lang.Class, PK)
 */
 @Override
public T findEnityById(Class<T> entityClass, PK id) {
  return (T) super.getHibernateTemplate().get(entityClass, id);
 }

/* (non-Javadoc)
 * @see com.blackswan.fake.Dao.BaseDao#findAll(java.lang.Class)
 */
@Override
public List<T> findAll(Class<T> entityClass) {
  return super.getHibernateTemplate().loadAll(entityClass);
 }
 
 /* (non-Javadoc)
 * @see com.blackswan.fake.Dao.BaseDao#findAllAsc(java.lang.Class, java.lang.String)
 */
@Override
public List<T> findAllAsc(Class<T> entityClass,String orderProperty) {
  return this.findAll_order(entityClass, orderProperty, "asc");
 }
 
 /* (non-Javadoc)
 * @see com.blackswan.fake.Dao.BaseDao#findAllDesc(java.lang.Class, java.lang.String)
 */
@Override
public List<T> findAllDesc(Class<T> entityClass,String orderProperty) {
  return this.findAll_order(entityClass, orderProperty, "desc");
 }
 /* (non-Javadoc)
 * @see com.blackswan.fake.Dao.BaseDao#findAll_order(java.lang.Class, java.lang.String, java.lang.String)
 */
@Override
public List<T> findAll_order(Class<T> entityClass,String orderProperty,String orderType) {
  String hql = "from "+entityClass.getName()+" obj order by obj."+orderProperty+" "+orderType;
  return this.findAllByHQL(hql);
 }
 
 /*
  * �Զ������� ��ѯ����ʵ�弯��
  * 
  * @param entityClass
  *            ʵ��������Ϣ
  * @return ��ѯ����ʵ����󼯺�
  */
 /* (non-Javadoc)
 * @see com.blackswan.fake.Dao.BaseDao#findAll_order(java.lang.Class, java.lang.String)
 */
@Override
public List<T> findAll_order(Class<T> entityClass,String orderDesc) {
  String hql = "from "+entityClass.getName()+" obj order by "+orderDesc;
  return this.findAllByHQL(hql);
 }
 /* (non-Javadoc)
 * @see com.blackswan.fake.Dao.BaseDao#findAllByProperty(java.lang.Class, java.lang.String, java.lang.Object)
 */
@Override
public List<T> findAllByProperty(Class<T> entityClass, String propertyName,
   Object propertyValue) {
  String queryString = "from " + entityClass.getName()
    + " as model where model." + propertyName + "=?";
  return super.getHibernateTemplate().find(queryString, propertyValue);
 }

 /* (non-Javadoc)
 * @see com.blackswan.fake.Dao.BaseDao#findAllByProperty_order(java.lang.Class, java.lang.String, java.lang.Object, java.lang.String)
 */
@Override
public List<T> findAllByProperty_order(Class<T> entityClass, String propertyName,
   Object propertyValue,String orderDesc) {
  String queryString = "from " + entityClass.getName()
    + " as model where model." + propertyName + "=? order by "+orderDesc;
  return super.getHibernateTemplate().find(queryString, propertyValue);
 }

 /* (non-Javadoc)
 * @see com.blackswan.fake.Dao.BaseDao#findAllByProperties(java.lang.Class, java.lang.String[], java.lang.Object[])
 */
@Override
public List<T> findAllByProperties(Class<T> entityClass, String[] propertyNames,
   Object[] propertyValues) {
  if (!(propertyNames!=null&&propertyValues!=null&&propertyValues.length==propertyNames.length)) {
   throw new RuntimeException("���ṩ��ȷ�Ĳ���ֵ��propertyNames��propertyValues����һһ��Ӧ!");
  }
  String queryString = "from " + entityClass.getName()
    + " as model where " ;
  for (int i = 0; i < propertyValues.length; i++) {
   queryString += " model."+propertyNames[i]+" = ? ";
   if(i != propertyValues.length-1){
    queryString += " and ";
   }
  }
  return this.findAllByHQL(queryString, propertyValues);
 }
 
 /* (non-Javadoc)
 * @see com.blackswan.fake.Dao.BaseDao#findAllByProperties_order(java.lang.Class, java.lang.String[], java.lang.Object[], java.lang.String)
 */
@Override
public List<T> findAllByProperties_order(Class<T> entityClass, String[] propertyNames,
   Object[] propertyValues,String orderDesc) {
  if (!(propertyNames!=null&&propertyValues!=null&&propertyValues.length==propertyNames.length)) {
   throw new RuntimeException("���ṩ��ȷ�Ĳ���ֵ��propertyNames��propertyValues����һһ��Ӧ!");
  }
  String queryString = "from " + entityClass.getName()
    + " as model where " ;
  for (int i = 0; i < propertyValues.length; i++) {
   queryString += " model."+propertyNames[i]+" = ? ";
   if(i != propertyValues.length-1){
    queryString += " and ";
   }
  }
  queryString += " order by "+orderDesc;
  return this.findAllByHQL(queryString, propertyValues);
 }
 /* (non-Javadoc)
 * @see com.blackswan.fake.Dao.BaseDao#findAllByLikeProperty(java.lang.Class, java.lang.String, java.lang.String)
 */
@Override
public List<T> findAllByLikeProperty(Class<T> entityClass, String propertyName,
   String propertyValue) {
  String queryString = "from " + entityClass.getName()
    + " as model where model." + propertyName + " like '%"+propertyValue+"%'";
  return super.getHibernateTemplate().find(queryString);
 }

 /* (non-Javadoc)
 * @see com.blackswan.fake.Dao.BaseDao#findAllByLikeProperty_order(java.lang.Class, java.lang.String, java.lang.String, java.lang.String)
 */
@Override
public List<T> findAllByLikeProperty_order(Class<T> entityClass, String propertyName,
   String propertyValue,String orderDesc) {
  String queryString = "from " + entityClass.getName()
    + " as model where model." + propertyName + " like '%"+propertyValue+"%'";
  return super.getHibernateTemplate().find(queryString);
 }
 
 /* (non-Javadoc)
 * @see com.blackswan.fake.Dao.BaseDao#findAllByHQL(java.lang.String)
 */
@Override
public List<T> findAllByHQL(final String hql) {
  return this.findAllByHQLPage(hql, null, -1, -1);
 }
 /* (non-Javadoc)
 * @see com.blackswan.fake.Dao.BaseDao#findAllByHQL(java.lang.String, java.lang.Object[])
 */
@Override
public List<T> findAllByHQL(final String hql, final Object[] params) {
  return this.findAllByHQLPage(hql, params, -1, -1);
 }
 
 /* (non-Javadoc)
 * @see com.blackswan.fake.Dao.BaseDao#findAllByPage(java.lang.Class, int, int)
 */
@Override
public List<T> findAllByPage(Class<T> entityClass, int start, int limit) {
  String hql = "from " + entityClass.getName() + "  model";
  return this.findAllByHQLPage(hql, null, start, limit);
 }
 /* (non-Javadoc)
 * @see com.blackswan.fake.Dao.BaseDao#findAllByPage_order(java.lang.Class, java.lang.String, int, int)
 */
@Override
public List<T> findAllByPage_order(Class<T> entityClass,String orderDesc, int start, int limit) {
  String hql = "from " + entityClass.getName() + "  model order by "+orderDesc;
  return this.findAllByHQLPage(hql, null, start, limit);
 }
 /* (non-Javadoc)
 * @see com.blackswan.fake.Dao.BaseDao#findAllByPropertyPage(java.lang.Class, java.lang.String, java.lang.Object, int, int)
 */
@Override
public List<T> findAllByPropertyPage(Class<T> entityClass, String propertyName,
   Object propertyValue,int start,int limit) {
  String queryString = "from " + entityClass.getName()
    + " as model where model." + propertyName + "= ? ";
  return this.findAllByHQLPage(queryString, new Object[]{propertyValue}, start, limit);
 }
 /* (non-Javadoc)
 * @see com.blackswan.fake.Dao.BaseDao#findAllByPropertyPage_order(java.lang.Class, java.lang.String, java.lang.Object, java.lang.String, int, int)
 */
@Override
public List<T> findAllByPropertyPage_order(Class<T> entityClass, String propertyName,
   Object propertyValue,String orderDesc,int start,int limit) {
  String queryString = "from " + entityClass.getName()
    + " as model where model." + propertyName + "=? order by "+orderDesc;
  return this.findAllByHQLPage(queryString, new Object[]{propertyValue}, start, limit);
 }
 
 /* (non-Javadoc)
 * @see com.blackswan.fake.Dao.BaseDao#findAllByPropertiesPage(java.lang.Class, java.lang.String[], java.lang.Object[], int, int)
 */
@Override
public List<T> findAllByPropertiesPage(Class<T> entityClass, String[] propertyNames,
   Object[] propertyValues,int start,int limit) {
  if (!(propertyNames!=null&&propertyValues!=null&&propertyValues.length==propertyNames.length)) {
   throw new RuntimeException("���ṩ��ȷ�Ĳ���ֵ��propertyNames��propertyValues����һһ��Ӧ!");
  }
  String queryString = "from " + entityClass.getName()
    + " as model where " ;
  for (int i = 0; i < propertyValues.length; i++) {
   queryString += " model."+propertyNames[i]+" = ? ";
   if(i != propertyValues.length-1){
    queryString += " and ";
   }
  }
  return this.findAllByHQLPage(queryString,propertyValues,start,limit);
 }
 /* (non-Javadoc)
 * @see com.blackswan.fake.Dao.BaseDao#findAllByPropertiesPage_order(java.lang.Class, java.lang.String[], java.lang.Object[], java.lang.String, int, int)
 */
@Override
public List<T> findAllByPropertiesPage_order(Class<T> entityClass, String[] propertyNames,
   Object[] propertyValues,String orderDesc,int start,int limit) {
  if (!(propertyNames!=null&&propertyValues!=null&&propertyValues.length==propertyNames.length)) {
   throw new RuntimeException("���ṩ��ȷ�Ĳ���ֵ��propertyNames��propertyValues����һһ��Ӧ!");
  }
  String queryString = "from " + entityClass.getName()
    + " as model where " ;
  for (int i = 0; i < propertyValues.length; i++) {
   queryString += " model."+propertyNames[i]+" = ? ";
   if(i != propertyValues.length-1){
    queryString += " and ";
   }
  }
  queryString += " order by "+orderDesc;
  return this.findAllByHQLPage(queryString,propertyValues,start,limit);
 }
 
 /* (non-Javadoc)
 * @see com.blackswan.fake.Dao.BaseDao#findAllByLikePropertyPage(java.lang.Class, java.lang.String, java.lang.String, int, int)
 */
@Override
public List<T> findAllByLikePropertyPage(Class<T> entityClass, String propertyName,
   String propertyValue,int start,int limit) {
  String queryString = "from " + entityClass.getName()
    + " as model where model." + propertyName + " like '%"+propertyValue+"%'";
  return this.findAllByHQLPage(queryString, null, start, limit);
 }
 /* (non-Javadoc)
 * @see com.blackswan.fake.Dao.BaseDao#findAllByLikePropertyPage_order(java.lang.Class, java.lang.String, java.lang.String, java.lang.String, int, int)
 */
@Override
public List<T> findAllByLikePropertyPage_order(Class<T> entityClass, String propertyName,
   String propertyValue,String orderDesc,int start,int limit) {
  String queryString = "from " + entityClass.getName()
    + " as model where model." + propertyName + " like '%"+propertyValue+"%'";
  queryString += " order by "+orderDesc;
  return this.findAllByHQLPage(queryString, null, start, limit);
 }
 /* (non-Javadoc)
 * @see com.blackswan.fake.Dao.BaseDao#findAllByHQLPage(java.lang.String, java.lang.Object[], int, int)
 */
@SuppressWarnings("rawtypes")
@Override
public List<T> findAllByHQLPage(final String hql, final Object[] params,
   final int start, final int limit) {
  return (List<T>) super.getHibernateTemplate().executeWithNativeSession(
    new HibernateCallback() {
     
     public Object doInHibernate(Session session)
       throws HibernateException, SQLException {
      Query query = session.createQuery(hql);
      if (params != null && params.length > 0) {
       for (int i = 0; i < params.length; i++) {
        query.setParameter(i, params[i]);
       }
      }
      // ��ʾ�Ƿ�ҳ��ѯ
      if (start != -1 && limit != -1) {
       query.setFirstResult(start);
       query.setMaxResults(limit);
      }
      return query.list();
     }
    });
 } 

 /* (non-Javadoc)
 * @see com.blackswan.fake.Dao.BaseDao#getTotalCount(java.lang.Class)
 */
@SuppressWarnings("rawtypes")
@Override
public int getTotalCount(final Class<T> entityClass) {
  return (Integer) super.getHibernateTemplate().executeWithNativeSession(
    new HibernateCallback() {
     
     public Object doInHibernate(Session session)
       throws HibernateException, SQLException {
      String hql = "select count(o) from "
        + entityClass.getName() + " o";
      Query query = session.createQuery(hql);
      Object obj = query.list().size()-1;
      return obj;
     }
    });
 }
 /* (non-Javadoc)
 * @see com.blackswan.fake.Dao.BaseDao#getTotalCountByHQL(java.lang.String, java.lang.Object[])
 */
@SuppressWarnings("rawtypes")
@Override
public int getTotalCountByHQL(final String hql, final Object[] params) {
  return (Integer) super.getHibernateTemplate().executeWithNativeSession(
    new HibernateCallback() {
     
     public Object doInHibernate(Session session)
       throws HibernateException, SQLException {
      Query query = session.createQuery(hql);
      if (params != null && params.length > 0) {
       for (int i = 0; i < params.length; i++) {
        query.setParameter(i, params[i]);
       }
      }
      return query.list().size()-1;
     }
    });
 }
 /* (non-Javadoc)
 * @see com.blackswan.fake.Dao.BaseDao#getTotalCountByHQL(java.lang.String)
 */
@Override
public int getTotalCountByHQL(final String hql) {
  return this.getTotalCountByHQL(hql, null);
 }
 /* (non-Javadoc)
  * @see org.books.Dao.BaseDao#findAllByQBE(java.lang.Class, T)
  */
 @Override
public List<T> findAllByQBE(final Class<T> entityClass, final T example) {
  return this.findAllByQBEPage(entityClass, example, -1, -1);
 }
 /* (non-Javadoc)
 * @see com.blackswan.fake.Dao.BaseDao#findAllByQBEPage(java.lang.Class, T, int, int)
 */
@Override
public List<T> findAllByQBEPage(final Class<T> entityClass,
   final T example, final int start, final int limit) {
  return this.findAllByQBEPage(entityClass, example, start, limit, null);
 }
 /* (non-Javadoc)
 * @see com.blackswan.fake.Dao.BaseDao#findAllByQBEPage(java.lang.Class, T, int, int, org.hibernate.criterion.Order[])
 */
@SuppressWarnings("rawtypes")
@Override
public List<T> findAllByQBEPage(final Class<T> entityClass,
   final T example, final int start, final int limit,
   final Order[] orders) {
  return (List<T>) super.getHibernateTemplate().executeWithNativeSession(
    new HibernateCallback() {
    
     public Object doInHibernate(Session session)
       throws HibernateException, SQLException {
      Criteria criteria = session.createCriteria(entityClass);
      criteria.add(Example.create(example));
      // ��������
      if (orders != null && orders.length > 0) {
       for (int i = 0; i < orders.length; i++) {
        criteria.addOrder(orders[i]);
       }
      }
      if (start != -1 && limit != -1) {
       criteria.setFirstResult(start);
       criteria.setMaxResults(limit);
      }
      return criteria.list();
     }
    });
 }
 /* (non-Javadoc)
 * @see com.blackswan.fake.Dao.BaseDao#getStatisticalValueByQBE(java.lang.Class, T, org.hibernate.criterion.Projection)
 */
@SuppressWarnings("rawtypes")
@Override
public Object getStatisticalValueByQBE(final Class<T> entityClass,
   final T example, final Projection projection) {
  return super.getHibernateTemplate().executeWithNativeSession(
    new HibernateCallback() {
    
     public Object doInHibernate(Session session)
       throws HibernateException, SQLException {
      Criteria criteria = session.createCriteria(entityClass);
      criteria.add(Example.create(example));
      criteria.setProjection(projection);
      return criteria.uniqueResult();
     }
    });
 }
 /* (non-Javadoc)
 * @see com.blackswan.fake.Dao.BaseDao#getTotalCountByExample(java.lang.Class, T)
 */
@SuppressWarnings("rawtypes")
@Override
public Integer getTotalCountByExample(final Class<T> entityClass, final T example) {
  return (Integer) super.getHibernateTemplate().executeWithNativeSession(
    new HibernateCallback() {
     
     public Object doInHibernate(Session session)
       throws HibernateException, SQLException {
      Criteria criteria = session.createCriteria(entityClass);
      criteria.add(Example.create(example));
      criteria.setProjection(Projections.rowCount());// ������
      return (Integer)criteria.uniqueResult();
     }

    });
 }

 
 
 /* (non-Javadoc)
 * @see com.blackswan.fake.Dao.BaseDao#findAllByQBCPage(java.lang.Class, int, int, org.hibernate.criterion.Criterion[], org.hibernate.criterion.Order[], org.hibernate.criterion.Projection[], boolean)
 */
 @SuppressWarnings("rawtypes")
@Override
public Object findAllByQBCPage(final Class<T> entityClass, final int start,
   final int limit,final Criterion[] criterions,final Order[] orders,
   final Projection[] projs, final boolean isUniqueResult) {
   return super.getHibernateTemplate().executeWithNativeSession(
    new HibernateCallback() {
     
     public Object doInHibernate(Session session)
       throws HibernateException, SQLException {
      Criteria criteria = session.createCriteria(entityClass);
      //�������
      if(criterions!=null&&criterions.length>0){
       for (int i = 0; i < criterions.length; i++) {
        criteria.add(criterions[i]);
       }
      }
      //�������
      if(orders!=null&&orders.length>0){
       for (int i = 0; i < orders.length; i++) {
        criteria.addOrder(orders[i]);
       }
      }
      //��ӷ���ͳ��
      if(projs!=null&&projs.length>0){
       for (int i = 0; i < projs.length; i++) {
        criteria.setProjection(projs[i]);
       }
      }
      //�鿴�Ƿ�Ҫ��ҳ
      if(start!=-1&&limit!=-1){
       criteria.setFirstResult(start);
       criteria.setMaxResults(limit);
      }
         
      if(isUniqueResult){
       return criteria.uniqueResult();
      }else{
       return criteria.list();
      }
     }
  });
 }
 /* (non-Javadoc)
 * @see com.blackswan.fake.Dao.BaseDao#findAllByQBCPage(java.lang.Class, int, int, org.hibernate.criterion.Criterion[], org.hibernate.criterion.Order[])
 */
@Override
public List<T>  findAllByQBCPage(final Class<T> entityClass, final int start,
   final int limit,final Criterion[] criterions,final Order[] orders) {
  return (List<T>) this.findAllByQBCPage(entityClass, start, limit, criterions, orders, null, false);
 }

 /* (non-Javadoc)
 * @see com.blackswan.fake.Dao.BaseDao#findAllByQBCPage(java.lang.Class, int, int, org.hibernate.criterion.Criterion[])
 */
@Override
public List<T>  findAllByQBCPage(final Class<T> entityClass, final int start,
   final int limit,final Criterion[] criterions) {
  return (List<T>) this.findAllByQBCPage(entityClass, start, limit, criterions, null, null, false);
 }
 /* (non-Javadoc)
 * @see com.blackswan.fake.Dao.BaseDao#findAllByQBCPage(java.lang.Class, org.hibernate.criterion.Criterion[])
 */
@Override
public List<T> findAllByQBCPage(final Class<T> entityClass,final Criterion[] criterions) {
  return (List<T>) this.findAllByQBCPage(entityClass, -1, -1, criterions, null, null, false);
 }

 /* (non-Javadoc)
 * @see com.blackswan.fake.Dao.BaseDao#getTotalCountByQBC(java.lang.Class, org.hibernate.criterion.Criterion[])
 */
@Override
public Integer getTotalCountByQBC(final Class<T> entityClass,final Criterion[] criterions){
  return (Integer)this.findAllByQBCPage(entityClass, -1, -1, criterions, null,new Projection[]{Projections.rowCount()}, true);
 }


@Override
public T get(Class<T> entityClass,PK id)
{
	return (T) getHibernateTemplate().get(entityClass, id);
}


@Override
public T load(Class<T> entityClass,PK id)
{
	return (T)getHibernateTemplate().load(entityClass, id);
}
}
