package com.pim.PIMProject.ISO.Model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class Othr {
	@JacksonXmlProperty(localName = "Id")
	private String id;

	public Othr() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Othr(String id) {
		super();
		this.id = id;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
}
