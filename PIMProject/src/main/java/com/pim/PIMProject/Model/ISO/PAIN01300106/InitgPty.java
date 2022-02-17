package com.pim.PIMProject.Model.ISO.PAIN01300106;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.pim.PIMProject.Model.ISO.PACS00800106.Id;

public class InitgPty {
	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	private Id id;

	public InitgPty() {
		super();
		// TODO Auto-generated constructor stub
	}

	public InitgPty(Id id) {
		super();
		this.id = id;
	}

	public Id getId() {
		return id;
	}

	public void setId(Id id) {
		this.id = id;
	}
}
