package com.pim.PIMProject.Model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class ReferenceNo {
	@JacksonXmlProperty(isAttribute = true)
	private String value;

	public ReferenceNo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ReferenceNo(String value) {
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
