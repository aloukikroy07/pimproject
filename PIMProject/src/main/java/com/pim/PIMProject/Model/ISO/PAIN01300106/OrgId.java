package com.pim.PIMProject.Model.ISO.PAIN01300106;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.pim.PIMProject.Model.ISO.PACS00800106.Othr;

public class OrgId {
	@JacksonXmlProperty(localName = "Othr")
	private Othr othr;

	public OrgId() {
		super();
		// TODO Auto-generated constructor stub
	}

	public OrgId(Othr othr) {
		super();
		this.othr = othr;
	}

	public Othr getOthr() {
		return othr;
	}

	public void setOthr(Othr othr) {
		this.othr = othr;
	}
}
