package com.pim.PIMProject.Model.ISO.CAMT05400104;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.pim.PIMProject.Model.ISO.PACS00800106.Dbtr;
import com.pim.PIMProject.Model.ISO.PAIN01300106.InitgPty;

public class RltdPties {
	@JacksonXmlProperty(localName = "InitgPty")
	private InitgPty initgPty;
	@JacksonXmlProperty(localName = "Cdtr")
	private Dbtr dbtr;
	public RltdPties() {
		super();
		// TODO Auto-generated constructor stub
	}
	public RltdPties(InitgPty initgPty, Dbtr dbtr) {
		super();
		this.initgPty = initgPty;
		this.dbtr = dbtr;
	}
	public InitgPty getInitgPty() {
		return initgPty;
	}
	public void setInitgPty(InitgPty initgPty) {
		this.initgPty = initgPty;
	}
	public Dbtr getDbtr() {
		return dbtr;
	}
	public void setDbtr(Dbtr dbtr) {
		this.dbtr = dbtr;
	}
	
}
