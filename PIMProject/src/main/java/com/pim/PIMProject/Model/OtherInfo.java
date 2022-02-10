package com.pim.PIMProject.Model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

//@XmlRootElement
public class OtherInfo {
	@JacksonXmlProperty(localName = "Call_From")
	private String callFrom;

	public OtherInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public OtherInfo(String callFrom) {
		super();
		this.callFrom = callFrom;
	}

	public String getCallFrom() {
		return callFrom;
	}

	public void setCallFrom(String callFrom) {
		this.callFrom = callFrom;
	}
	
}
