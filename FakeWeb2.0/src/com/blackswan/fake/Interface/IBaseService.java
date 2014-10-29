package com.blackswan.fake.Interface;

import java.io.Serializable;
import java.util.List;

public interface IBaseService<T extends Serializable,PK extends Serializable>
{
	//����������м�¼
	List<T> browseAll(Class<T> entityClass);
	//���ĳһҳ�����¼
	List<T> browseAll(Class<T> entityClass,int pageNo,int pageSize);
	//ͳ�ƶ�������
	int countAll(Class<T> entityClass);
	//װ��ָ������
	T loadEntity(Class<T> entityClass,PK id);
	//ɾ��ָ������
	boolean delEntity(Class<T> entityClass,PK id);
	//�������޸�ĳһ����
	boolean saveOrUpdateEntity(T entity);	
	public List<T> findAllByProperty(Class<T> entityClass, String propertyName,
			Object propertyValue);
}
