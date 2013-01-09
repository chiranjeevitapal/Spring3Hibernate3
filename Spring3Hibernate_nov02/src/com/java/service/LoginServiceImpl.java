package com.java.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import com.java.dao.LoginDao;
import com.java.model.Login;

@Service("loginService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class LoginServiceImpl implements LoginService{
	
	@Autowired
	  private LoginDao loginDao;
	  
	  public List<Login> checkLogin(Login login) {
		  return loginDao.checkLogin(login);
	  }
}
