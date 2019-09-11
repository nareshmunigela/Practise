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
@Table(name = "ContactEmail")
public class ContactEmail {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ContactEmail_ID")
	private Integer contactEmailId;

	@Column(name = "Email")
	private String email;

	@Column(name = "IsPrimary")
	private Boolean isPrimary;
 
 	@Column(name = "Client_ID")
	private int clientId;
	
	/*
	 * @Column(name = "Company_ID") private int companyId;
	 * 
	 * public int getCompanyId() { return companyId; }
	 * 
	 * public void setCompanyId(int companyId) { this.companyId = companyId; }
	 */

	@Column(name = "OptIn")
	private boolean optIn;
	
	@Column(name = "Status")
	private int status;
	
	/*
	 * @Column(name = "EventLog") private String eventLog;
	 */
	
   	@Column(name = "UpdatedDate")
	private LocalDateTime lastModifiedDate;

 
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
	
	

	public int getClientId() {
		return clientId;
	}

	public void setClientId(int clientId) {
		this.clientId = clientId;
	}

	/**
	 * @return the contactEmailId
	 */
	public Integer getContactEmailId() {
		return contactEmailId;
	}

	/**
	 * @param contactEmailId the contactEmailId to set
	 */
	public void setContactEmailId(Integer contactEmailId) {
		this.contactEmailId = contactEmailId;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
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
	

	
}
