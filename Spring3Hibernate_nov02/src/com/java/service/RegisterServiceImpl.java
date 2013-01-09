package com.java.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.java.dao.RegisterDao;
import com.java.model.Login;

@Service("registerService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class RegisterServiceImpl implements RegisterService{

	@Autowired
	RegisterDao registerDao;
	public void register(Login login) {
		registerDao.register(login);
	}

}
