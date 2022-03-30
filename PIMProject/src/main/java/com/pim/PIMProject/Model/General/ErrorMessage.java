package com.pim.PIMProject.Model.General;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ErrorMessage {
	private String message;

	public ErrorMessage() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ErrorMessage(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
}
