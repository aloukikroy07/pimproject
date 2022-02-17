package com.pim.PIMProject.Model.ISO.PAIN01300106;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class SchmeNm {
	@JacksonXmlProperty(localName = "Cd")
	private String cd;

	public SchmeNm() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SchmeNm(String cd) {
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
