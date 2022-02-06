package com.pim.PIMProject.Model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Info {
	private Integer idInfoKey;
	private String EntityType;
	private String Name;
	private String AddressLine1;
	private String AddressLine2;
	private String District;
	private String PostalCode;
	private String MobileNumber;
	private String Email;
	private String TypeOfOwnership;
	private String TypeOfBusiness;
	private String NameOfMinistry;
	private String NameOfDivision;
	private String TypeOfFinancialInstitution;
	private String SwiftCode;
	private String CBAccountNumber;
	private String NID;
	private String TIN;
	private String BIN;
	private String IDTPKey;
	private String DateOfBirth;
	private String CallBackURL;
	private String Password;
	
	public Info() {
		super();
	}

	public Info(Integer idInfoKey, String entityType, String name, String addressLine1, String addressLine2,
			String district, String postalCode, String mobileNumber, String email, String typeOfOwnership,
			String typeOfBusiness, String nameOfMinistry, String nameOfDivision, String typeOfFinancialInstitution,
			String swiftCode, String cBAccountNumber, String nID, String tIN, String bIN, String iDTPKey,
			String dateOfBirth, String callBackURL, String password) {
		super();
		this.idInfoKey = idInfoKey;
		EntityType = entityType;
		Name = name;
		AddressLine1 = addressLine1;
		AddressLine2 = addressLine2;
		District = district;
		PostalCode = postalCode;
		MobileNumber = mobileNumber;
		Email = email;
		TypeOfOwnership = typeOfOwnership;
		TypeOfBusiness = typeOfBusiness;
		NameOfMinistry = nameOfMinistry;
		NameOfDivision = nameOfDivision;
		TypeOfFinancialInstitution = typeOfFinancialInstitution;
		SwiftCode = swiftCode;
		CBAccountNumber = cBAccountNumber;
		NID = nID;
		TIN = tIN;
		BIN = bIN;
		IDTPKey = iDTPKey;
		DateOfBirth = dateOfBirth;
		CallBackURL = callBackURL;
		Password = password;
	}

	public Integer getIdInfoKey() {
		return idInfoKey;
	}

	public void setIdInfoKey(Integer idInfoKey) {
		this.idInfoKey = idInfoKey;
	}

	public String getEntityType() {
		return EntityType;
	}

	public void setEntityType(String entityType) {
		EntityType = entityType;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getAddressLine1() {
		return AddressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		AddressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return AddressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		AddressLine2 = addressLine2;
	}

	public String getDistrict() {
		return District;
	}

	public void setDistrict(String district) {
		District = district;
	}

	public String getPostalCode() {
		return PostalCode;
	}

	public void setPostalCode(String postalCode) {
		PostalCode = postalCode;
	}

	public String getMobileNumber() {
		return MobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		MobileNumber = mobileNumber;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getTypeOfOwnership() {
		return TypeOfOwnership;
	}

	public void setTypeOfOwnership(String typeOfOwnership) {
		TypeOfOwnership = typeOfOwnership;
	}

	public String getTypeOfBusiness() {
		return TypeOfBusiness;
	}

	public void setTypeOfBusiness(String typeOfBusiness) {
		TypeOfBusiness = typeOfBusiness;
	}

	public String getNameOfMinistry() {
		return NameOfMinistry;
	}

	public void setNameOfMinistry(String nameOfMinistry) {
		NameOfMinistry = nameOfMinistry;
	}

	public String getNameOfDivision() {
		return NameOfDivision;
	}

	public void setNameOfDivision(String nameOfDivision) {
		NameOfDivision = nameOfDivision;
	}

	public String getTypeOfFinancialInstitution() {
		return TypeOfFinancialInstitution;
	}

	public void setTypeOfFinancialInstitution(String typeOfFinancialInstitution) {
		TypeOfFinancialInstitution = typeOfFinancialInstitution;
	}

	public String getSwiftCode() {
		return SwiftCode;
	}

	public void setSwiftCode(String swiftCode) {
		SwiftCode = swiftCode;
	}

	public String getCBAccountNumber() {
		return CBAccountNumber;
	}

	public void setCBAccountNumber(String cBAccountNumber) {
		CBAccountNumber = cBAccountNumber;
	}

	public String getNID() {
		return NID;
	}

	public void setNID(String nID) {
		NID = nID;
	}

	public String getTIN() {
		return TIN;
	}

	public void setTIN(String tIN) {
		TIN = tIN;
	}

	public String getBIN() {
		return BIN;
	}

	public void setBIN(String bIN) {
		BIN = bIN;
	}

	public String getIDTPKey() {
		return IDTPKey;
	}

	public void setIDTPKey(String iDTPKey) {
		IDTPKey = iDTPKey;
	}

	public String getDateOfBirth() {
		return DateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		DateOfBirth = dateOfBirth;
	}

	public String getCallBackURL() {
		return CallBackURL;
	}

	public void setCallBackURL(String callBackURL) {
		CallBackURL = callBackURL;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	
	
	
}
