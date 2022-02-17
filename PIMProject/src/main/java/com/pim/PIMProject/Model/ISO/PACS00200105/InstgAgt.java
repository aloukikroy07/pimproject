package com.pim.PIMProject.Model.ISO.PACS00200105;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.pim.PIMProject.Model.ISO.PACS00800106.FinInstnId;

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
