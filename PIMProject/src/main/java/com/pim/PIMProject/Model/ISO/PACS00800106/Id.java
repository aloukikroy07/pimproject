package com.pim.PIMProject.Model.ISO.PACS00800106;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.pim.PIMProject.Model.ISO.PAIN01300106.OrgId;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class Id {
	@JacksonXmlProperty(localName = "OrgId")
	private OrgId orgId;
	@JacksonXmlProperty(localName = "Othr")
	private Othr othr;

	public Id() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Id(OrgId orgId, Othr othr) {
		super();
		this.orgId = orgId;
		this.othr = othr;
	}

	public OrgId getOrgId() {
		return orgId;
	}

	public void setOrgId(OrgId orgId) {
		this.orgId = orgId;
	}

	public Othr getOthr() {
		return othr;
	}

	public void setOthr(Othr othr) {
		this.othr = othr;
	}
	
}
