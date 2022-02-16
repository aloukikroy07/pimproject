package com.pim.PIMProject.Model.Response.ISO;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class Rsn {
	@JacksonXmlProperty(localName = "Prtry")
	private String prtry;

	public Rsn() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Rsn(String prtry) {
		super();
		this.prtry = prtry;
	}

	public String getPrtry() {
		return prtry;
	}

	public void setPrtry(String prtry) {
		this.prtry = prtry;
	}
	
}
