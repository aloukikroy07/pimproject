package com.pim.PIMProject.ISO.Model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class Id {
	@JacksonXmlProperty(localName = "Othr")
	private Othr othr;

	public Id() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Id(Othr othr) {
		super();
		this.othr = othr;
	}

	public Othr getOthr() {
		return othr;
	}

	public void setOthr(Othr othr) {
		this.othr = othr;
	}
	
}
