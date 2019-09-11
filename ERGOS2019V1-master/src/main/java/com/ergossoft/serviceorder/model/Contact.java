/**
 * 
 */
package com.ergossoft.serviceorder.model;

import java.time.LocalDateTime;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

 
@Entity
@Table(name = "Contact")
public class Contact {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Contact_ID")
	private Integer contactId;

	@Column(name = "FirstName")
	private String firstName;

	@Column(name = "LastName")
	private String lastName;

	@Column(name = "Site_ID")
	private Integer siteId;

	@Column(name = "IsPrimary")
	private boolean isPrimary;

	@Column(name = "RelationShipType_ID")
	private int relationshipTypeId;

	@Column(name = "Customer_ID")
	private Integer customerId;
 

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


	
	@OneToMany(mappedBy = "contact", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private Set<ContactPhone> contactPhones;

	@OneToMany(mappedBy = "contact", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private Set<ContactEmail> contactEmails;

	/**
	 * @return the contactId
	 */
	public Integer getContactId() {
		return contactId;
	}

	/**
	 * @param contactId the contactId to set
	 */
	public void setContactId(Integer contactId) {
		this.contactId = contactId;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */

	public String getLastName() {
		return lastName;
	}

	public Integer getSiteId() {
		return siteId;
	}

	public void setSiteId(Integer siteId) {
		this.siteId = siteId;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the customerId
	 */
	public Integer getCustomerId() {
		return customerId;
	}

	/**
	 * @param customerId the customerId to set
	 */
	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
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

	public void setPrimary(boolean isPrimary) {
		this.isPrimary = isPrimary;
	}

	public Set<ContactPhone> getContactPhones() {
		return contactPhones;
	}

	public void setContactPhones(Set<ContactPhone> contactPhones) {
		this.contactPhones = contactPhones;
	}

	public Set<ContactEmail> getContactEmails() {
		return contactEmails;
	}

	public void setContactEmails(Set<ContactEmail> contactEmails) {
		this.contactEmails = contactEmails;
	}

	public boolean getIsPrimary() {
		return isPrimary;
	}

	public void setIsPrimary(boolean isPrimary) {
		this.isPrimary = isPrimary;
	}

	public int getRelationshipTypeId() {
		return relationshipTypeId;
	}

	public void setRelationshipTypeId(int relationshipTypeId) {
		this.relationshipTypeId = relationshipTypeId;
	}

	 

}
