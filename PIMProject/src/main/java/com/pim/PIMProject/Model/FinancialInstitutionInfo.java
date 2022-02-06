package com.pim.PIMProject.Model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class FinancialInstitutionInfo {
	private Integer idFinancialInstitutionKey;
	private String FinancialInstitution;
	private String BranchName;
	private String RoutingNumber;
	private String AccountingNumber;
	
	public FinancialInstitutionInfo() {
		super();
	}

	public FinancialInstitutionInfo(Integer idFinancialInstitutionKey, String financialInstitution, String branchName,
			String routingNumber, String accountingNumber) {
		super();
		this.idFinancialInstitutionKey = idFinancialInstitutionKey;
		FinancialInstitution = financialInstitution;
		BranchName = branchName;
		RoutingNumber = routingNumber;
		AccountingNumber = accountingNumber;
	}

	public Integer getIdFinancialInstitutionKey() {
		return idFinancialInstitutionKey;
	}

	public void setIdFinancialInstitutionKey(Integer idFinancialInstitutionKey) {
		this.idFinancialInstitutionKey = idFinancialInstitutionKey;
	}

	public String getFinancialInstitution() {
		return FinancialInstitution;
	}

	public void setFinancialInstitution(String financialInstitution) {
		FinancialInstitution = financialInstitution;
	}

	public String getBranchName() {
		return BranchName;
	}

	public void setBranchName(String branchName) {
		BranchName = branchName;
	}

	public String getRoutingNumber() {
		return RoutingNumber;
	}

	public void setRoutingNumber(String routingNumber) {
		RoutingNumber = routingNumber;
	}

	public String getAccountingNumber() {
		return AccountingNumber;
	}

	public void setAccountingNumber(String accountingNumber) {
		AccountingNumber = accountingNumber;
	}
	
	
}
