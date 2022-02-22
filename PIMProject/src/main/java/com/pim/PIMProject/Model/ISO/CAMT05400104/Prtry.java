package com.pim.PIMProject.Model.ISO.CAMT05400104;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class Prtry {
	@JacksonXmlProperty(localName = "Cd")
	private String cd;

	public Prtry() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Prtry(String cd) {
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
