package com.pim.PIMProject.Model.ISO.CAMT00300105;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.pim.PIMProject.Model.ISO.PACS00800106.Id;

public class AcctId {
	@JacksonXmlProperty(localName = "EQ")
	private Id id;

	public AcctId() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AcctId(Id id) {
		super();
		this.id = id;
	}

	public Id getId() {
		return id;
	}

	public void setId(Id id) {
		this.id = id;
	}
	

}
