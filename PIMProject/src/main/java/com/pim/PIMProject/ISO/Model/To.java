package com.pim.PIMProject.ISO.Model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class To {
	@JacksonXmlProperty(localName = "FIId")
	private FIId fiId;

	public To() {
		super();
		// TODO Auto-generated constructor stub
	}

	public To(FIId fiId) {
		super();
		this.fiId = fiId;
	}

	public FIId getFiId() {
		return fiId;
	}

	public void setFiId(FIId fiId) {
		this.fiId = fiId;
	}
}
