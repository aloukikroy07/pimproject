package com.pim.PIMProject.ISO.Model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class DbtrAcct {
	@JacksonXmlProperty(localName = "Id")
	private Id id;

	public DbtrAcct() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DbtrAcct(Id id) {
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
