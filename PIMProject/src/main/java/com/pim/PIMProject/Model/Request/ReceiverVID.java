package com.pim.PIMProject.Model.Request;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class ReceiverVID {
	@JacksonXmlProperty(isAttribute = true)
	private String value;

	public ReceiverVID() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ReceiverVID(String value) {
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

