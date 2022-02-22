package com.pim.PIMProject.Model.ISO.CAMT05400104;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.pim.PIMProject.Model.ISO.PACS00800106.DbtrAcct;

public class Ntfctn {
	@JacksonXmlProperty(localName = "Id")
	private String id;
	@JacksonXmlProperty(localName = "CreDtTm")
	private String creDtTm;
	@JacksonXmlProperty(localName = "Acct")
	private DbtrAcct acct;
	@JacksonXmlProperty(localName = "Ntry")
	private Ntry ntry;
	public Ntfctn() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Ntfctn(String id, String creDtTm, DbtrAcct acct, Ntry ntry) {
		super();
		this.id = id;
		this.creDtTm = creDtTm;
		this.acct = acct;
		this.ntry = ntry;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCreDtTm() {
		return creDtTm;
	}
	public void setCreDtTm(String creDtTm) {
		this.creDtTm = creDtTm;
	}
	public DbtrAcct getAcct() {
		return acct;
	}
	public void setAcct(DbtrAcct acct) {
		this.acct = acct;
	}
	public Ntry getNtry() {
		return ntry;
	}
	public void setNtry(Ntry ntry) {
		this.ntry = ntry;
	}
	
	
}
