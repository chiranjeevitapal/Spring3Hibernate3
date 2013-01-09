package com.java.dao;

import java.util.List;

import com.java.model.Login;

public interface LoginDao {
	  public List<Login> checkLogin(Login login);
}
