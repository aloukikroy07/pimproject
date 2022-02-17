package com.pim.PIMProject.Model.ISO.PACS00800106;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.pim.PIMProject.Model.ISO.PAIN01300106.ClrSysMmbId;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class FinInstnId {
	@JacksonXmlProperty(localName = "BICFI")
	private String bicfi;
	@JacksonXmlProperty(localName = "ClrSysMmbId")
	private ClrSysMmbId clrSysMmbId;

	public FinInstnId() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FinInstnId(String bicfi, ClrSysMmbId clrSysMmbId) {
		super();
		this.bicfi = bicfi;
		this.clrSysMmbId = clrSysMmbId;
	}

	public String getBicfi() {
		return bicfi;
	}

	public void setBicfi(String bicfi) {
		this.bicfi = bicfi;
	}

	public ClrSysMmbId getClrSysMmbId() {
		return clrSysMmbId;
	}

	public void setClrSysMmbId(ClrSysMmbId clrSysMmbId) {
		this.clrSysMmbId = clrSysMmbId;
	}

	
}
