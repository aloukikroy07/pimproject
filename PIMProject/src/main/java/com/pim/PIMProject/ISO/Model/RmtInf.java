package com.pim.PIMProject.ISO.Model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class RmtInf {
	@JacksonXmlProperty(localName = "Ustrd")
	private String ustrd;

	public RmtInf() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RmtInf(String ustrd) {
		super();
		this.ustrd = ustrd;
	}

	public String getUstrd() {
		return ustrd;
	}

	public void setUstrd(String ustrd) {
		this.ustrd = ustrd;
	}
	
	
}
