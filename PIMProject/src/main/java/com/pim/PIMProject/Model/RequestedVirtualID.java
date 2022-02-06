package com.pim.PIMProject.Model;

import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@XmlRootElement
public class RequestedVirtualID {
	
	@JacksonXmlProperty(isAttribute = true)
	private String value;
	
	public RequestedVirtualID() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public RequestedVirtualID(String value) {
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
