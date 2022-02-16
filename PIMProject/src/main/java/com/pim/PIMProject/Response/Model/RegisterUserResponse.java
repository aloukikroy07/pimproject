package com.pim.PIMProject.Response.Model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class RegisterUserResponse {
	@JacksonXmlProperty(localName = "Code")
	private String code;
	@JacksonXmlProperty(localName = "Message")
	private String message;
	@JacksonXmlProperty(localName = "UserInfo")
	private UserInfo userInfo;
	public RegisterUserResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	public RegisterUserResponse(String code, String message, UserInfo userInfo) {
		super();
		this.code = code;
		this.message = message;
		this.userInfo = userInfo;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public UserInfo getUserInfo() {
		return userInfo;
	}
	public void setUserInfo(UserInfo userInfo) {
		this.userInfo = userInfo;
	}
}
