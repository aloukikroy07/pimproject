package com.pim.PIMProject.Model.ISO.PAIN01400106;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.pim.PIMProject.Model.ISO.PACS00200105.TxInfAndSts;

public class OrgnlPmtInfAndSts {
	@JacksonXmlProperty(localName = "OrgnlPmtInfId")
	private String orgnlPmtInfId;
	@JacksonXmlProperty(localName = "TxInfAndSts")
	private TxInfAndSts txInfAndSts;
	public OrgnlPmtInfAndSts() {
		super();
		// TODO Auto-generated constructor stub
	}
	public OrgnlPmtInfAndSts(String orgnlPmtInfId, TxInfAndSts txInfAndSts) {
		super();
		this.orgnlPmtInfId = orgnlPmtInfId;
		this.txInfAndSts = txInfAndSts;
	}
	public String getOrgnlPmtInfId() {
		return orgnlPmtInfId;
	}
	public void setOrgnlPmtInfId(String orgnlPmtInfId) {
		this.orgnlPmtInfId = orgnlPmtInfId;
	}
	public TxInfAndSts getTxInfAndSts() {
		return txInfAndSts;
	}
	public void setTxInfAndSts(TxInfAndSts txInfAndSts) {
		this.txInfAndSts = txInfAndSts;
	}
	
}
