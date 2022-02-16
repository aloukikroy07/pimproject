package com.pim.PIMProject.ISO.Model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class FinInstnId {
	@JacksonXmlProperty(localName = "BICFI")
	private String bicfi;

	public FinInstnId() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FinInstnId(String bicfi) {
		super();
		this.bicfi = bicfi;
	}

	public String getBicfi() {
		return bicfi;
	}

	public void setBicfi(String bicfi) {
		this.bicfi = bicfi;
	}
}
