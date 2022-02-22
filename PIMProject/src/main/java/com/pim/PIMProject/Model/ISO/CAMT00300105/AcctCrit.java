package com.pim.PIMProject.Model.ISO.CAMT00300105;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class AcctCrit {
	@JacksonXmlProperty(localName = "QryNm")
	private String qryNm;
	@JacksonXmlProperty(localName = "NewCrit")
	private NewCrit newCrit;
	public AcctCrit() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AcctCrit(String qryNm, NewCrit newCrit) {
		super();
		this.qryNm = qryNm;
		this.newCrit = newCrit;
	}
	public String getQryNm() {
		return qryNm;
	}
	public void setQryNm(String qryNm) {
		this.qryNm = qryNm;
	}
	public NewCrit getNewCrit() {
		return newCrit;
	}
	public void setNewCrit(NewCrit newCrit) {
		this.newCrit = newCrit;
	}
	
}
