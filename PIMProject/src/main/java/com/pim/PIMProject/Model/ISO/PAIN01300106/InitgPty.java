package com.pim.PIMProject.Model.ISO.PAIN01300106;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.pim.PIMProject.Model.ISO.PACS00800106.Id;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class InitgPty {
	@JacksonXmlProperty(localName = "Id")
	private Id id;
	@JacksonXmlProperty(localName = "Nm")
	private String nm;

	public InitgPty() {
		super();
		// TODO Auto-generated constructor stub
	}

	public InitgPty(Id id, String nm) {
		super();
		this.id = id;
		this.nm = nm;
	}

	public Id getId() {
		return id;
	}

	public void setId(Id id) {
		this.id = id;
	}

	public String getNm() {
		return nm;
	}

	public void setNm(String nm) {
		this.nm = nm;
	}

	
}
