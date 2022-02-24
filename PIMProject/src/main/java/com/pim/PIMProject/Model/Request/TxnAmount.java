package com.pim.PIMProject.Model.Request;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class TxnAmount {
	@JacksonXmlProperty(isAttribute = true)
	private String value;

	public TxnAmount() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TxnAmount(String value) {
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
