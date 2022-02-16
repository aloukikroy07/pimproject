package com.pim.PIMProject.ISO.Model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class CdtTrfTxInf {
	@JacksonXmlProperty(localName = "PmtId")
	private PmtId pmtId;
	@JacksonXmlProperty(localName = "PmtTpInf")
	private PmtTpInf pmtTpInf;
	@JacksonXmlProperty(localName = "IntrBkSttlmAmt")
	private IntrBkSttlmAmt intrBkSttlmAmt;
	@JacksonXmlProperty(localName = "ChrgBr")
	private String chrgBr;
	@JacksonXmlProperty(localName = "InstgAgt")
	private FIId instgAgt;
	@JacksonXmlProperty(localName = "InstdAgt")
	private FIId instdAgt;
	@JacksonXmlProperty(localName = "Dbtr")
	private Dbtr dbtr;
	@JacksonXmlProperty(localName = "DbtrAcct")
	private DbtrAcct dbtrAcct;
	@JacksonXmlProperty(localName = "DbtrAgt")
	private FIId dbtrAgt;
	@JacksonXmlProperty(localName = "DbtrAgtAcct")
	private DbtrAcct dbtrAgtAcct;
	@JacksonXmlProperty(localName = "CdtrAgt")
	private FIId cdtrAgt;
	@JacksonXmlProperty(localName = "CdtrAgtAcct")
	private DbtrAcct cdtrAgtAcct;
	@JacksonXmlProperty(localName = "Cdtr")
	private Dbtr cdtr;
	@JacksonXmlProperty(localName = "CdtrAcct")
	private DbtrAcct cdtrAcct;
	@JacksonXmlProperty(localName = "RmtInf")
	private RmtInf rmtInf;
	public CdtTrfTxInf() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CdtTrfTxInf(PmtId pmtId, PmtTpInf pmtTpInf, IntrBkSttlmAmt intrBkSttlmAmt, String chrgBr, FIId instgAgt,
			FIId instdAgt, Dbtr dbtr, DbtrAcct dbtrAcct, FIId dbtrAgt, DbtrAcct dbtrAgtAcct, FIId cdtrAgt,
			DbtrAcct cdtrAgtAcct, Dbtr cdtr, DbtrAcct cdtrAcct, RmtInf rmtInf) {
		super();
		this.pmtId = pmtId;
		this.pmtTpInf = pmtTpInf;
		this.intrBkSttlmAmt = intrBkSttlmAmt;
		this.chrgBr = chrgBr;
		this.instgAgt = instgAgt;
		this.instdAgt = instdAgt;
		this.dbtr = dbtr;
		this.dbtrAcct = dbtrAcct;
		this.dbtrAgt = dbtrAgt;
		this.dbtrAgtAcct = dbtrAgtAcct;
		this.cdtrAgt = cdtrAgt;
		this.cdtrAgtAcct = cdtrAgtAcct;
		this.cdtr = cdtr;
		this.cdtrAcct = cdtrAcct;
		this.rmtInf = rmtInf;
	}
	public PmtId getPmtId() {
		return pmtId;
	}
	public void setPmtId(PmtId pmtId) {
		this.pmtId = pmtId;
	}
	public PmtTpInf getPmtTpInf() {
		return pmtTpInf;
	}
	public void setPmtTpInf(PmtTpInf pmtTpInf) {
		this.pmtTpInf = pmtTpInf;
	}
	public IntrBkSttlmAmt getIntrBkSttlmAmt() {
		return intrBkSttlmAmt;
	}
	public void setIntrBkSttlmAmt(IntrBkSttlmAmt intrBkSttlmAmt) {
		this.intrBkSttlmAmt = intrBkSttlmAmt;
	}
	public String getChrgBr() {
		return chrgBr;
	}
	public void setChrgBr(String chrgBr) {
		this.chrgBr = chrgBr;
	}
	public FIId getInstgAgt() {
		return instgAgt;
	}
	public void setInstgAgt(FIId instgAgt) {
		this.instgAgt = instgAgt;
	}
	public FIId getInstdAgt() {
		return instdAgt;
	}
	public void setInstdAgt(FIId instdAgt) {
		this.instdAgt = instdAgt;
	}
	public Dbtr getDbtr() {
		return dbtr;
	}
	public void setDbtr(Dbtr dbtr) {
		this.dbtr = dbtr;
	}
	public DbtrAcct getDbtrAcct() {
		return dbtrAcct;
	}
	public void setDbtrAcct(DbtrAcct dbtrAcct) {
		this.dbtrAcct = dbtrAcct;
	}
	public FIId getDbtrAgt() {
		return dbtrAgt;
	}
	public void setDbtrAgt(FIId dbtrAgt) {
		this.dbtrAgt = dbtrAgt;
	}
	public DbtrAcct getDbtrAgtAcct() {
		return dbtrAgtAcct;
	}
	public void setDbtrAgtAcct(DbtrAcct dbtrAgtAcct) {
		this.dbtrAgtAcct = dbtrAgtAcct;
	}
	public FIId getCdtrAgt() {
		return cdtrAgt;
	}
	public void setCdtrAgt(FIId cdtrAgt) {
		this.cdtrAgt = cdtrAgt;
	}
	public DbtrAcct getCdtrAgtAcct() {
		return cdtrAgtAcct;
	}
	public void setCdtrAgtAcct(DbtrAcct cdtrAgtAcct) {
		this.cdtrAgtAcct = cdtrAgtAcct;
	}
	public Dbtr getCdtr() {
		return cdtr;
	}
	public void setCdtr(Dbtr cdtr) {
		this.cdtr = cdtr;
	}
	public DbtrAcct getCdtrAcct() {
		return cdtrAcct;
	}
	public void setCdtrAcct(DbtrAcct cdtrAcct) {
		this.cdtrAcct = cdtrAcct;
	}
	public RmtInf getRmtInf() {
		return rmtInf;
	}
	public void setRmtInf(RmtInf rmtInf) {
		this.rmtInf = rmtInf;
	}
	
	
}
