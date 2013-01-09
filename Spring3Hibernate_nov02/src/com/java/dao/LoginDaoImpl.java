package com.java.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.java.model.Login;

@Repository("loginDao")
public class LoginDaoImpl implements LoginDao{

	 @Autowired
	  private SessionFactory sessionFactory;
	 
	@SuppressWarnings("unchecked")
	@Transactional(readOnly = true)
	public List<Login> checkLogin(Login login) {
		return sessionFactory.getCurrentSession().createQuery(("from Login where loginid=? and password=? "))
		.setParameter(0, login.getLoginid())
		.setParameter(1, login.getPassword()).list();
	  }
}
