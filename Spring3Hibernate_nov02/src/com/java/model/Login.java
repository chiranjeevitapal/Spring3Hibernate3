package com.java.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "login")
public class Login {
	  @Id
	  @GeneratedValue
	  @Column(name = "id")
	  private Long id;

	  @Column(name = "loginid", nullable = false, length=20)
	  private String loginid;

	  @Column(name = "password", nullable = false)
	  private String password;
	  
	  @Column(name = "email")
	  private String email;
	  
	  @Column(name = "address")
	  private String address;
	  
	  @Column(name = "phone")
	  private String phone;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLoginid() {
		return loginid;
	}

	public void setLoginid(String loginid) {
		this.loginid = loginid;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
}
