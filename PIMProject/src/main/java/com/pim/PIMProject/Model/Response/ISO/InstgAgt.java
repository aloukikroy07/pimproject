package com.pim.PIMProject.Model.Response.ISO;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.pim.PIMProject.ISO.Model.FinInstnId;

public class InstgAgt {
	@JacksonXmlProperty(localName = "FinInstnId")
	private FinInstnId finInstnId;

	public InstgAgt() {
		super();
		// TODO Auto-generated constructor stub
	}

	public InstgAgt(FinInstnId finInstnId) {
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
