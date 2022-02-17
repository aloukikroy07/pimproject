package com.pim.PIMProject.Model.ISO.PACS00800106;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.pim.PIMProject.Model.ISO.PAIN01300106.SchmeNm;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class Othr {
	@JacksonXmlProperty(localName = "Id")
	private String id;
	@JacksonXmlProperty(localName = "SchmeNm")
	private SchmeNm schmeNm;

	public Othr() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Othr(String id, SchmeNm schmeNm) {
		super();
		this.id = id;
		this.schmeNm = schmeNm;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public SchmeNm getSchmeNm() {
		return schmeNm;
	}

	public void setSchmeNm(SchmeNm schmeNm) {
		this.schmeNm = schmeNm;
	}
}
