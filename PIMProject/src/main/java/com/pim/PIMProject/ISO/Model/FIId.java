package com.pim.PIMProject.ISO.Model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class FIId {
	@JacksonXmlProperty(localName = "FinInstnId")
	private FinInstnId finInstnId;

	public FIId() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FIId(FinInstnId finInstnId) {
		super();
		this.finInstnId = finInstnId;
	}

	public FinInstnId getFinInstnId() {
		return finInstnId;
	}

	public void setFinInstnId(FinInstnId finInstnId) {
		this.finInstnId = finInstnId;
	}
}
