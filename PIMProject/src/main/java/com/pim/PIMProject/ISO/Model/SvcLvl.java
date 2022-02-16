package com.pim.PIMProject.ISO.Model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class SvcLvl {
	@JacksonXmlProperty(localName = "Prtry")
	private String prtry;

	public SvcLvl() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SvcLvl(String prtry) {
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
