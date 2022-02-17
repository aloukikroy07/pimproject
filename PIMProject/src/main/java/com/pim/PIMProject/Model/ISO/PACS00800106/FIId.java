package com.pim.PIMProject.Model.ISO.PACS00800106;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class FIId {
	@JacksonXmlProperty(localName = "FinInstnId")
	private FinInstnId finInstnId;
	@JacksonXmlProperty(localName = "BrnchId")
	private BrnchId brnchId;
	public FIId() {
		super();
		// TODO Auto-generated constructor stub
	}
	public FIId(FinInstnId finInstnId, BrnchId brnchId) {
		super();
		this.finInstnId = finInstnId;
		this.brnchId = brnchId;
	}
	public FinInstnId getFinInstnId() {
		return finInstnId;
	}
	public void setFinInstnId(FinInstnId finInstnId) {
		this.finInstnId = finInstnId;
	}
	public BrnchId getBrnchId() {
		return brnchId;
	}
	public void setBrnchId(BrnchId brnchId) {
		this.brnchId = brnchId;
	}

	
}
