package com.pim.PIMProject.Model.ISO.CAMT00400105;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class Tp {
	@JacksonXmlProperty(localName = "Cd")
	private String cd;

	public Tp() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Tp(String cd) {
		super();
		this.cd = cd;
	}

	public String getCd() {
		return cd;
	}

	public void setCd(String cd) {
		this.cd = cd;
	}
	
}
