package com.pim.PIMProject.Model.ISO.CAMT05400104;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class Refs {
	@JacksonXmlProperty(localName = "InstrId")
	private String instrId;
	@JacksonXmlProperty(localName = "EndToEndId")
	private String endToEndId;
	public Refs() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Refs(String instrId, String endToEndId) {
		super();
		this.instrId = instrId;
		this.endToEndId = endToEndId;
	}
	public String getInstrId() {
		return instrId;
	}
	public void setInstrId(String instrId) {
		this.instrId = instrId;
	}
	public String getEndToEndId() {
		return endToEndId;
	}
	public void setEndToEndId(String endToEndId) {
		this.endToEndId = endToEndId;
	}
	
}
