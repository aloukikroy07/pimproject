package com.pim.PIMProject.Model.ISO.CAMT05400104;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class NtryDtls {
	@JacksonXmlProperty(localName = "TxDtls")
	private TxDtls txDtls;

	public NtryDtls() {
		super();
		// TODO Auto-generated constructor stub
	}

	public NtryDtls(TxDtls txDtls) {
		super();
		this.txDtls = txDtls;
	}

	public TxDtls getTxDtls() {
		return txDtls;
	}

	public void setTxDtls(TxDtls txDtls) {
		this.txDtls = txDtls;
	}
}
