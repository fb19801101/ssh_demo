package com.ssh.action;

import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import java.util.List;

public class MyHibernateUtil extends HibernateDaoSupport {
	@Autowired
	private HibernateTemplate hibernateTemplate;

	@Autowired
	private SessionFactory sessionFactory;

	public boolean insertOrUpdate(Object obj) {
		hibernateTemplate.saveOrUpdate(obj);
		return true;
	}

	public List queryObject(String sql) {
		sessionFactory.openSession();
		return hibernateTemplate.find(sql);
	}

	public Object getObject(Class obj, int id) {
		return hibernateTemplate.get(obj, Integer.valueOf(id));
	}

	public boolean deleteObject(Object obj) {
		try {
			hibernateTemplate.delete(obj);
			return true;
		} catch(Exception e) {
			return false;
		}

	}

	public boolean deleteObject(String obj) {
		List objects = hibernateTemplate.find(obj);
		try {
			for (int i = 0; i < objects.size(); i++) {
				Object object = (Object) objects.get(i);
				//System.out.println(i + "  ffdsfs  "  + object.getClass().getName());
				hibernateTemplate.delete(object);
			}
			return true;
		} catch (DataAccessException e) {
			// TODO 自动生成 catch 块
			return false;
		}
	}

	public List queryObjectFromSql(String sql,String name,Object obj){
		SQLQuery query = getSession().createSQLQuery(sql);
		query.addEntity(name, obj.getClass());
		return query.list();
	}

	public List queryObjectFromSql(String sql) {
		Query query = getSession().createSQLQuery(sql);
		return query.list();
	}

	public void out(Object obj) {
		System.out.println(hibernateTemplate.save(obj));
	}
}