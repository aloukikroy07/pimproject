package com.pim.PIMProject.Response.Model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class NotifyIDTPAccountChangeResponse {
	@JacksonXmlProperty(localName = "Code")
	private String code;
	@JacksonXmlProperty(localName = "Message")
	private String message;
	public NotifyIDTPAccountChangeResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	public NotifyIDTPAccountChangeResponse(String code, String message) {
		super();
		this.code = code;
		this.message = message;
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
	
}
