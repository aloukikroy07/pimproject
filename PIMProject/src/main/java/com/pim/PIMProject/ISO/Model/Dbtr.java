package com.pim.PIMProject.ISO.Model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class Dbtr {
	@JacksonXmlProperty(localName = "Nm")
	private String nm;

	public Dbtr() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Dbtr(String nm) {
		super();
		this.nm = nm;
	}

	public String getNm() {
		return nm;
	}

	public void setNm(String nm) {
		this.nm = nm;
	}
	
}
