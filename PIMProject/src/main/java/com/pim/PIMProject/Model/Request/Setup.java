package com.pim.PIMProject.Model.Request;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class Setup {
	@JacksonXmlProperty(localName = "CommURL")
	private String commURL;
	@JacksonXmlProperty(localName = "ECommKey")
	private String eCommKey;
	
	public Setup() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Setup(String commURL, String eCommKey) {
		super();
		this.commURL = commURL;
		this.eCommKey = eCommKey;
	}

	public String getCommURL() {
		return commURL;
	}

	public void setCommURL(String commURL) {
		this.commURL = commURL;
	}

	public String geteCommKey() {
		return eCommKey;
	}

	public void seteCommKey(String eCommKey) {
		this.eCommKey = eCommKey;
	}
	
}
