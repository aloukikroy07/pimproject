package com.pim.PIMProject.Model.ISO.PACS00200105;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class StsRsnInf {
	@JacksonXmlProperty(localName = "Rsn")
	private Rsn rsn;
	@JacksonXmlProperty(localName = "AddtlInf")
	private String addtlInf;
	public StsRsnInf() {
		super();
		// TODO Auto-generated constructor stub
	}
	public StsRsnInf(Rsn rsn, String addtlInf) {
		super();
		this.rsn = rsn;
		this.addtlInf = addtlInf;
	}
	public Rsn getRsn() {
		return rsn;
	}
	public void setRsn(Rsn rsn) {
		this.rsn = rsn;
	}
	public String getAddtlInf() {
		return addtlInf;
	}
	public void setAddtlInf(String addtlInf) {
		this.addtlInf = addtlInf;
	}
	
}
