package com.pim.PIMProject.JWT.Models;

import javax.persistence.Column;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sun.istack.NotNull;

@XmlRootElement
public class User {
	@NotNull
	@Column(name="name")
	private String username;
	@Column(name="email")
	private String emailaddress;
	@NotNull
	private String password;
	private String token;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(String username, String emailaddress, String password, String token) {
		super();
		this.username = username;
		this.emailaddress = emailaddress;
		this.password = password;
		this.token = token;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmailaddress() {
		return emailaddress;
	}
	public void setEmailaddress(String emailaddress) {
		this.emailaddress = emailaddress;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	
}
