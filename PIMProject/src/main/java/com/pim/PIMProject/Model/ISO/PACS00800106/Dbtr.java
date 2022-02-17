package com.pim.PIMProject.Model.ISO.PACS00800106;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class Dbtr {
	@JacksonXmlProperty(localName = "Nm")
	private String nm;
	@JacksonXmlProperty(localName = "Id")
	private Id id;
	@JacksonXmlProperty(localName = "CtryOfRes")
	private String ctryOfRes;
	
	public Dbtr() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Dbtr(String nm, Id id, String ctryOfRes) {
		super();
		this.nm = nm;
		this.id = id;
		this.ctryOfRes = ctryOfRes;
	}

	public String getNm() {
		return nm;
	}

	public void setNm(String nm) {
		this.nm = nm;
	}

	public Id getId() {
		return id;
	}

	public void setId(Id id) {
		this.id = id;
	}

	public String getCtryOfRes() {
		return ctryOfRes;
	}

	public void setCtryOfRes(String ctryOfRes) {
		this.ctryOfRes = ctryOfRes;
	}

	
}
