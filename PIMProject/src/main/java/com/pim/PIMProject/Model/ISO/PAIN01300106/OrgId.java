package com.pim.PIMProject.Model.ISO.PAIN01300106;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.pim.PIMProject.Model.ISO.PACS00800106.Othr;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class OrgId {
	@JacksonXmlProperty(localName = "Othr")
	private Othr othr;
	@JacksonXmlProperty(localName = "AnyBIC")
	private String anyBIC;

	public OrgId() {
		super();
		// TODO Auto-generated constructor stub
	}

	public OrgId(Othr othr, String anyBIC) {
		super();
		this.othr = othr;
		this.anyBIC = anyBIC;
	}

	public Othr getOthr() {
		return othr;
	}

	public void setOthr(Othr othr) {
		this.othr = othr;
	}

	public String getAnyBIC() {
		return anyBIC;
	}

	public void setAnyBIC(String anyBIC) {
		this.anyBIC = anyBIC;
	}

	
}
