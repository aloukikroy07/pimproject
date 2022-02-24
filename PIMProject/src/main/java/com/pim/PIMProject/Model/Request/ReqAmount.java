package com.pim.PIMProject.Model.Request;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class ReqAmount {
	@JacksonXmlProperty(isAttribute = true)
	private String value;

	public ReqAmount() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ReqAmount(String value) {
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
