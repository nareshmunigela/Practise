/**
 * 
 */
package com.ergossoft.serviceorder.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

 
@Entity
@Table(name = "ContactPhone")
public class ContactPhone {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ContactPhone_ID")
	private Integer contactPhoneId;

	@Column(name = "PhoneNumber")
	private String phoneNumber;

	@Column(name = "IsPrimary")
	private Boolean isPrimary;

	/*
	 * @Column(name = "LastName") private String lastName;
	 * 
	 * @Column(name = "FirstName") private String firstName;
	 */

	@Column(name = "PhoneType_ID")
	private int phoneTypeId;

	/*
	 * @Column(name = "RelationshipType_ID") private int relationshipTypeCd;
	 */
	@Column(name = "Extension")
	private String extension;

	@Column(name = "OptIn")
	private boolean optIn;

	@Column(name = "Client_ID")
	private int clientId;

	/*
	 * @Column(name = "Company_ID") private int companyId;
	 */
	
	
	
	@Column(name = "Status")
	private int status;

	/*
	 * @Column(name = "EventLog") private String eventLog;
	 */
	
   	@Column(name = "UpdatedDate")
	private LocalDateTime lastModifiedDate;

 //naresh
	@Column(name = "UpdatedBy")
	private String lastModifiedBy;


	@ManyToOne

	@JoinColumn(name = "Contact_ID")
	private Contact contact;

	/**
	 * @return the isPrimary
	 */

	public Boolean getIsPrimary() {
		return isPrimary;
	}

	public int getClientId() {
		return clientId;
	}

	public void setClientId(int clientId) {
		this.clientId = clientId;
	}

	/*
	 * public int getCompanyId() { return companyId; }
	 * 
	 * public void setCompanyId(int companyId) { this.companyId = companyId; }
	 */
	
	/**
	 * @param isPrimary the isPrimary to set
	 */
	public void setIsPrimary(Boolean isPrimary) {
		this.isPrimary = isPrimary;
	}

	/**
	 * @return the status
	 */
	public int getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(int status) {
		this.status = status;
	}

	/**
	 * @return the contactPhoneId
	 */
	public Integer getContactPhoneId() {
		return contactPhoneId;
	}

	/**
	 * @param contactPhoneId the contactPhoneId to set
	 */
	public void setContactPhoneId(Integer contactPhoneId) {
		this.contactPhoneId = contactPhoneId;
	}

	/**
	 * @return the phoneNumber
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}

	/**
	 * @param phoneNumber the phoneNumber to set
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public int getPhoneTypeId() {
		return phoneTypeId;
	}

	public void setPhoneTypeId(int phoneTypeId) {
		this.phoneTypeId = phoneTypeId;
	}

	
	
	/*
	 * public String getEventLog() { return eventLog; }
	 * 
	 * public void setEventLog(String eventLog) { this.eventLog = eventLog; }
	 */

	public LocalDateTime getLastModifiedDate() {
		return lastModifiedDate;
	}

	public void setLastModifiedDate(LocalDateTime lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
	}

	public String getLastModifiedBy() {
		return lastModifiedBy;
	}

	public void setLastModifiedBy(String lastModifiedBy) {
		this.lastModifiedBy = lastModifiedBy;
	}

	public Contact getContact() {
		return contact;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
	}

	public boolean isOptIn() {
		return optIn;
	}

	public void setOptIn(boolean optIn) {
		this.optIn = optIn;
	}

	public String getExtension() {
		return extension;
	}

	public void setExtension(String extension) {
		this.extension = extension;
	}

}
