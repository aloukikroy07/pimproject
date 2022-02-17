package com.pim.PIMProject.Model.ISO.PAIN01300106;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.pim.PIMProject.Model.ISO.PACS00800106.IntrBkSttlmAmt;

public class Amt {
	@JacksonXmlProperty(localName = "InstdAmt")
	private IntrBkSttlmAmt intrBkSttlmAmt;

	public Amt() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Amt(IntrBkSttlmAmt intrBkSttlmAmt) {
		super();
		this.intrBkSttlmAmt = intrBkSttlmAmt;
	}

	public IntrBkSttlmAmt getIntrBkSttlmAmt() {
		return intrBkSttlmAmt;
	}

	public void setIntrBkSttlmAmt(IntrBkSttlmAmt intrBkSttlmAmt) {
		this.intrBkSttlmAmt = intrBkSttlmAmt;
	}
	
}
