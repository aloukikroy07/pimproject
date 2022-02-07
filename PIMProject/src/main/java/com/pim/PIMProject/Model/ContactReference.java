package com.pim.PIMProject.Model;

import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@XmlRootElement
public class ContactReference {
		private Integer idContactReferenceKey;
		@JacksonXmlProperty(localName = "ContactPersonName")
		private String contactPersonName;
		@JacksonXmlProperty(localName = "Designation")
		private String designation;
		@JacksonXmlProperty(localName = "ContactNumber")
		private String contactNumber;
		@JacksonXmlProperty(localName = "Email")
		private String email;
		
		public ContactReference() {
			super();
			// TODO Auto-generated constructor stub
		}

		public ContactReference(Integer idContactReferenceKey, String contactPersonName, String designation,
				String contactNumber, String email) {
			super();
			this.idContactReferenceKey = idContactReferenceKey;
			this.contactPersonName = contactPersonName;
			this.designation = designation;
			this.contactNumber = contactNumber;
			this.email = email;
		}

		public Integer getIdContactReferenceKey() {
			return idContactReferenceKey;
		}

		public void setIdContactReferenceKey(Integer idContactReferenceKey) {
			this.idContactReferenceKey = idContactReferenceKey;
		}

		public String getContactPersonName() {
			return contactPersonName;
		}

		public void setContactPersonName(String contactPersonName) {
			this.contactPersonName = contactPersonName;
		}

		public String getDesignation() {
			return designation;
		}

		public void setDesignation(String designation) {
			this.designation = designation;
		}

		public String getContactNumber() {
			return contactNumber;
		}

		public void setContactNumber(String contactNumber) {
			this.contactNumber = contactNumber;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}	
}
