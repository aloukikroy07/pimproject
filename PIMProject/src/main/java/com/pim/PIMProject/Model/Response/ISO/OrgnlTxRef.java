package com.pim.PIMProject.Model.Response.ISO;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.pim.PIMProject.ISO.Model.IntrBkSttlmAmt;

public class OrgnlTxRef {
	@JacksonXmlProperty(localName = "IntrBkSttlmDt")
	private String intrBkSttlmDt;
	@JacksonXmlProperty(localName = "IntrBkSttlmAmt")
	private IntrBkSttlmAmt intrBkSttlmAmt;
	public OrgnlTxRef() {
		super();
		// TODO Auto-generated constructor stub
	}
	public OrgnlTxRef(String intrBkSttlmDt, IntrBkSttlmAmt intrBkSttlmAmt) {
		super();
		this.intrBkSttlmDt = intrBkSttlmDt;
		this.intrBkSttlmAmt = intrBkSttlmAmt;
	}
	public String getIntrBkSttlmDt() {
		return intrBkSttlmDt;
	}
	public void setIntrBkSttlmDt(String intrBkSttlmDt) {
		this.intrBkSttlmDt = intrBkSttlmDt;
	}
	public IntrBkSttlmAmt getIntrBkSttlmAmt() {
		return intrBkSttlmAmt;
	}
	public void setIntrBkSttlmAmt(IntrBkSttlmAmt intrBkSttlmAmt) {
		this.intrBkSttlmAmt = intrBkSttlmAmt;
	}
	

}
