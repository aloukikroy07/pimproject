package com.pim.PIMProject.Model.ISO.PAIN01300106;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.pim.PIMProject.Model.ISO.PACS00800106.IntrBkSttlmAmt;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class Amt {
	@JacksonXmlProperty(localName = "InstdAmt")
	private IntrBkSttlmAmt intrBkSttlmAmt;
	@JacksonXmlProperty(localName = "AmtWthtCcy")
	private String amtWthtCcy;
	public Amt() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Amt(IntrBkSttlmAmt intrBkSttlmAmt, String amtWthtCcy) {
		super();
		this.intrBkSttlmAmt = intrBkSttlmAmt;
		this.amtWthtCcy = amtWthtCcy;
	}
	public IntrBkSttlmAmt getIntrBkSttlmAmt() {
		return intrBkSttlmAmt;
	}
	public void setIntrBkSttlmAmt(IntrBkSttlmAmt intrBkSttlmAmt) {
		this.intrBkSttlmAmt = intrBkSttlmAmt;
	}
	public String getAmtWthtCcy() {
		return amtWthtCcy;
	}
	public void setAmtWthtCcy(String amtWthtCcy) {
		this.amtWthtCcy = amtWthtCcy;
	}

	
	
}
