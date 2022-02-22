package com.pim.PIMProject.Model.ISO.CAMT00300105;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class NewCrit {
	@JacksonXmlProperty(localName = "SchCrit")
	private SchCrit schCrit;

	public NewCrit() {
		super();
		// TODO Auto-generated constructor stub
	}

	public NewCrit(SchCrit schCrit) {
		super();
		this.schCrit = schCrit;
	}

	public SchCrit getSchCrit() {
		return schCrit;
	}

	public void setSchCrit(SchCrit schCrit) {
		this.schCrit = schCrit;
	}
	
}
