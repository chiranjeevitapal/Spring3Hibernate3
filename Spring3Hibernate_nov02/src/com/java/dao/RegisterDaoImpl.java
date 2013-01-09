package com.java.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.java.model.Login;

@Repository("registerDao")
public class RegisterDaoImpl implements RegisterDao{
	
	@Autowired
	  private SessionFactory sessionFactory;
	 
	public void register(Login login) {
		sessionFactory.getCurrentSession().saveOrUpdate(login);
	  }
}
