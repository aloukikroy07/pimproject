package com.pim.PIMProject.Model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ContactReference {
		private Integer idContactReferenceKey;
		private String ContactPersonName;
		private String Designation;
		private String ContactNumber;
		private String Email;
		
		public ContactReference() {
			super();
		}

		public ContactReference(Integer idContactReferenceKey, String contactPersonName, String designation,
				String contactNumber, String email) {
			super();
			this.idContactReferenceKey = idContactReferenceKey;
			ContactPersonName = contactPersonName;
			Designation = designation;
			ContactNumber = contactNumber;
			Email = email;
		}

		public Integer getIdContactReferenceKey() {
			return idContactReferenceKey;
		}

		public void setIdContactReferenceKey(Integer idContactReferenceKey) {
			this.idContactReferenceKey = idContactReferenceKey;
		}

		public String getContactPersonName() {
			return ContactPersonName;
		}

		public void setContactPersonName(String contactPersonName) {
			ContactPersonName = contactPersonName;
		}

		public String getDesignation() {
			return Designation;
		}

		public void setDesignation(String designation) {
			Designation = designation;
		}

		public String getContactNumber() {
			return ContactNumber;
		}

		public void setContactNumber(String contactNumber) {
			ContactNumber = contactNumber;
		}

		public String getEmail() {
			return Email;
		}

		public void setEmail(String email) {
			Email = email;
		}
		
		
		
}
