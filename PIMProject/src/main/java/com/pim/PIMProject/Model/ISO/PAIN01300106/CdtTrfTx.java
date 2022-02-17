package com.pim.PIMProject.Model.ISO.PAIN01300106;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.pim.PIMProject.Model.ISO.PACS00800106.Dbtr;
import com.pim.PIMProject.Model.ISO.PACS00800106.DbtrAcct;
import com.pim.PIMProject.Model.ISO.PACS00800106.FIId;
import com.pim.PIMProject.Model.ISO.PACS00800106.PmtId;
import com.pim.PIMProject.Model.ISO.PACS00800106.PmtTpInf;
import com.pim.PIMProject.Model.ISO.PACS00800106.RmtInf;
import com.pim.PIMProject.Model.ISO.PACS00800106.SplmtryData;

public class CdtTrfTx {
	@JacksonXmlProperty(localName = "PmtId")
	private PmtId pmtId;
	@JacksonXmlProperty(localName = "PmtTpInf")
	private PmtTpInf pmtTpInf;
	@JacksonXmlProperty(localName = "Amt")
	private Amt amt;
	@JacksonXmlProperty(localName = "ChrgBr")
	private String chrgBr;
	@JacksonXmlProperty(localName = "CdtrAgt")
	private FIId cdtrAgt;
	@JacksonXmlProperty(localName = "Cdtr")
	private Dbtr cdtr;
	@JacksonXmlProperty(localName = "CdtrAcct")
	private DbtrAcct cdtrAcct;
	@JacksonXmlProperty(localName = "RmtInf")
	private RmtInf rmtInf;
	@JacksonXmlProperty(localName = "SplmtryData")
	private SplmtryData splmtryData;
	public CdtTrfTx() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CdtTrfTx(PmtId pmtId, PmtTpInf pmtTpInf, Amt amt, String chrgBr, FIId cdtrAgt, Dbtr cdtr, DbtrAcct cdtrAcct,
			RmtInf rmtInf, SplmtryData splmtryData) {
		super();
		this.pmtId = pmtId;
		this.pmtTpInf = pmtTpInf;
		this.amt = amt;
		this.chrgBr = chrgBr;
		this.cdtrAgt = cdtrAgt;
		this.cdtr = cdtr;
		this.cdtrAcct = cdtrAcct;
		this.rmtInf = rmtInf;
		this.splmtryData = splmtryData;
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
	public Amt getAmt() {
		return amt;
	}
	public void setAmt(Amt amt) {
		this.amt = amt;
	}
	public String getChrgBr() {
		return chrgBr;
	}
	public void setChrgBr(String chrgBr) {
		this.chrgBr = chrgBr;
	}
	public FIId getCdtrAgt() {
		return cdtrAgt;
	}
	public void setCdtrAgt(FIId cdtrAgt) {
		this.cdtrAgt = cdtrAgt;
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
	public SplmtryData getSplmtryData() {
		return splmtryData;
	}
	public void setSplmtryData(SplmtryData splmtryData) {
		this.splmtryData = splmtryData;
	}
}
