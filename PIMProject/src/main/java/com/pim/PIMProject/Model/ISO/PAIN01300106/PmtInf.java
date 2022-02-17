package com.pim.PIMProject.Model.ISO.PAIN01300106;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.pim.PIMProject.Model.ISO.PACS00800106.Dbtr;
import com.pim.PIMProject.Model.ISO.PACS00800106.DbtrAcct;
import com.pim.PIMProject.Model.ISO.PACS00800106.FIId;

public class PmtInf {
	@JacksonXmlProperty(localName = "PmtInfId")
	private String pmtInfId;
	@JacksonXmlProperty(localName = "PmtMtd")
	private String pmtMtd;
	@JacksonXmlProperty(localName = "ReqdExctnDt")
	private String reqdExctnDt;
	@JacksonXmlProperty(localName = "Dbtr")
	private Dbtr dbtr;
	@JacksonXmlProperty(localName = "DbtrAcct")
	private DbtrAcct dbtrAcct;
	@JacksonXmlProperty(localName = "DbtrAgt")
	private FIId dbtrAgt;
	@JacksonXmlProperty(localName = "CdtTrfTx")
	private CdtTrfTx cdtTrfTx;
	public PmtInf() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PmtInf(String pmtInfId, String pmtMtd, String reqdExctnDt, Dbtr dbtr, DbtrAcct dbtrAcct, FIId dbtrAgt,
			CdtTrfTx cdtTrfTx) {
		super();
		this.pmtInfId = pmtInfId;
		this.pmtMtd = pmtMtd;
		this.reqdExctnDt = reqdExctnDt;
		this.dbtr = dbtr;
		this.dbtrAcct = dbtrAcct;
		this.dbtrAgt = dbtrAgt;
		this.cdtTrfTx = cdtTrfTx;
	}
	public String getPmtInfId() {
		return pmtInfId;
	}
	public void setPmtInfId(String pmtInfId) {
		this.pmtInfId = pmtInfId;
	}
	public String getPmtMtd() {
		return pmtMtd;
	}
	public void setPmtMtd(String pmtMtd) {
		this.pmtMtd = pmtMtd;
	}
	public String getReqdExctnDt() {
		return reqdExctnDt;
	}
	public void setReqdExctnDt(String reqdExctnDt) {
		this.reqdExctnDt = reqdExctnDt;
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
	public CdtTrfTx getCdtTrfTx() {
		return cdtTrfTx;
	}
	public void setCdtTrfTx(CdtTrfTx cdtTrfTx) {
		this.cdtTrfTx = cdtTrfTx;
	}
	
}
