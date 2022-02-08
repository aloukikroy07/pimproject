package com.pim.PIMProject.Model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class SenderVID {
	@JacksonXmlProperty(isAttribute = true)
	private String value;

	public SenderVID() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SenderVID(String value) {
		super();
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
}
