package com.pim.PIMProject.ISO.Model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class Fr {
	@JacksonXmlProperty(localName = "FIId")
	private FIId fiId;

	public Fr() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Fr(FIId fiId) {
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
