package com.pim.PIMProject.Model.Request;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class TxnInfo {
	@JacksonXmlProperty(isAttribute = true)
	private String addrType;
	@JacksonXmlProperty(localName = "ReferenceNo")
	private ReferenceNo referenceNo;
	@JacksonXmlProperty(localName = "TxnAmount")
	private TxnAmount txnAmount;
	
	public TxnInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TxnInfo(String addrType, ReferenceNo referenceNo, TxnAmount txnAmount) {
		super();
		this.addrType = addrType;
		this.referenceNo = referenceNo;
		this.txnAmount = txnAmount;
	}
	public String getAddrType() {
		return addrType;
	}
	public void setAddrType(String addrType) {
		this.addrType = addrType;
	}
	public ReferenceNo getReferenceNo() {
		return referenceNo;
	}
	public void setReferenceNo(ReferenceNo referenceNo) {
		this.referenceNo = referenceNo;
	}
	public TxnAmount getTxnAmount() {
		return txnAmount;
	}
	public void setTxnAmount(TxnAmount txnAmount) {
		this.txnAmount = txnAmount;
	}
	
}
