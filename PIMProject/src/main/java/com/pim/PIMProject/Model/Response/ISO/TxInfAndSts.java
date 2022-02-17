package com.pim.PIMProject.Model.Response.ISO;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class TxInfAndSts {
	@JacksonXmlProperty(localName = "OrgnlInstrId")
	private String orgnlInstrId;
	@JacksonXmlProperty(localName = "OrgnlEndToEndId")
	private String orgnlEndToEndId;
	@JacksonXmlProperty(localName = "OrgnlTxId")
	private String orgnlTxId;
	@JacksonXmlProperty(localName = "TxSts")
	private String txSts;
	@JacksonXmlProperty(localName = "StsRsnInf")
	private StsRsnInf stsRsnInf;
	@JacksonXmlProperty(localName = "InstgAgt")
	private InstgAgt instgAgt;
	@JacksonXmlProperty(localName = "OrgnlTxRef")
	private OrgnlTxRef orgnlTxRef;
	public TxInfAndSts() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TxInfAndSts(String orgnlInstrId, String orgnlEndToEndId, String orgnlTxId, String txSts, StsRsnInf stsRsnInf,
			InstgAgt instgAgt, OrgnlTxRef orgnlTxRef) {
		super();
		this.orgnlInstrId = orgnlInstrId;
		this.orgnlEndToEndId = orgnlEndToEndId;
		this.orgnlTxId = orgnlTxId;
		this.txSts = txSts;
		this.stsRsnInf = stsRsnInf;
		this.instgAgt = instgAgt;
		this.orgnlTxRef = orgnlTxRef;
	}
	public String getOrgnlInstrId() {
		return orgnlInstrId;
	}
	public void setOrgnlInstrId(String orgnlInstrId) {
		this.orgnlInstrId = orgnlInstrId;
	}
	public String getOrgnlEndToEndId() {
		return orgnlEndToEndId;
	}
	public void setOrgnlEndToEndId(String orgnlEndToEndId) {
		this.orgnlEndToEndId = orgnlEndToEndId;
	}
	public String getOrgnlTxId() {
		return orgnlTxId;
	}
	public void setOrgnlTxId(String orgnlTxId) {
		this.orgnlTxId = orgnlTxId;
	}
	public String getTxSts() {
		return txSts;
	}
	public void setTxSts(String txSts) {
		this.txSts = txSts;
	}
	public StsRsnInf getStsRsnInf() {
		return stsRsnInf;
	}
	public void setStsRsnInf(StsRsnInf stsRsnInf) {
		this.stsRsnInf = stsRsnInf;
	}
	public InstgAgt getInstgAgt() {
		return instgAgt;
	}
	public void setInstgAgt(InstgAgt instgAgt) {
		this.instgAgt = instgAgt;
	}
	public OrgnlTxRef getOrgnlTxRef() {
		return orgnlTxRef;
	}
	public void setOrgnlTxRef(OrgnlTxRef orgnlTxRef) {
		this.orgnlTxRef = orgnlTxRef;
	}
	
}
