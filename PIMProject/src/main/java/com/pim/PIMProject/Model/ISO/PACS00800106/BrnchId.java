package com.pim.PIMProject.Model.ISO.PACS00800106;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class BrnchId {
	@JacksonXmlProperty(localName = "Id")
	private String id;

	public BrnchId() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BrnchId(String id) {
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
