package com.pim.PIMProject.Model.ISO.PACS00200105;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.pim.PIMProject.Model.ISO.PACS00800106.IntrBkSttlmAmt;
import com.pim.PIMProject.Model.ISO.PACS00800106.Dbtr;
import com.pim.PIMProject.Model.ISO.PACS00800106.FIId;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class OrgnlTxRef {
	@JacksonXmlProperty(localName = "IntrBkSttlmDt")
	private String intrBkSttlmDt;
	@JacksonXmlProperty(localName = "IntrBkSttlmAmt")
	private IntrBkSttlmAmt intrBkSttlmAmt;
	@JacksonXmlProperty(localName = "ReqdExctnDt")
	private String reqdExctnDt;
	@JacksonXmlProperty(localName = "Dbtr")
	private Dbtr dbtr;
	@JacksonXmlProperty(localName = "DbtrAgt")
	private FIId dbtrAgt;
	@JacksonXmlProperty(localName = "CdtrAgt")
	private FIId cdtrAgt;
	@JacksonXmlProperty(localName = "Cdtr")
	private Dbtr cdtr;
	public OrgnlTxRef() {
		super();
		// TODO Auto-generated constructor stub
	}
	public OrgnlTxRef(String intrBkSttlmDt, IntrBkSttlmAmt intrBkSttlmAmt, String reqdExctnDt, Dbtr dbtr, FIId dbtrAgt,
			FIId cdtrAgt, Dbtr cdtr) {
		super();
		this.intrBkSttlmDt = intrBkSttlmDt;
		this.intrBkSttlmAmt = intrBkSttlmAmt;
		this.reqdExctnDt = reqdExctnDt;
		this.dbtr = dbtr;
		this.dbtrAgt = dbtrAgt;
		this.cdtrAgt = cdtrAgt;
		this.cdtr = cdtr;
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
	public FIId getDbtrAgt() {
		return dbtrAgt;
	}
	public void setDbtrAgt(FIId dbtrAgt) {
		this.dbtrAgt = dbtrAgt;
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
	
	
}
