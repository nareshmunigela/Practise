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
import javax.persistence.Table;

@Entity
@Table(name = "SOContact")
public class ServiceOrderContact {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "SOContact_ID")
	private Integer serviceOrderContactId;

	@Column(name = "SO_ID")
	private int serviceOrderId;

	@Column(name = "MappingType")
	private String mappingType;

	@Column(name = "Contact_ID")
	private int contactId;

	@Column(name = "IsPrimary")
	private boolean primary;

	@Column(name = "Client_ID")
	private int clientId;

	@Column(name = "Status")
	private int status;

	@Column(name = "CreatedDate")
	private LocalDateTime createdDate;

	@Column(name = "UpdatedDate")
	private LocalDateTime updatedDate;

	@Column(name = "DeletedDate")
	private LocalDateTime deletedDate;

	@Column(name = "CreatedBy")
	private String createdBy;

	@Column(name = "UpdatedBy")
	private String updatedBy;

	@Column(name = "DeletedBy")
	private String deletedBy;

	public Integer getServiceOrderContactId() {
		return serviceOrderContactId;
	}

	public void setServiceOrderContactId(Integer serviceOrderContactId) {
		this.serviceOrderContactId = serviceOrderContactId;
	}

	public int getServiceOrderId() {
		return serviceOrderId;
	}

	public void setServiceOrderId(int serviceOrderId) {
		this.serviceOrderId = serviceOrderId;
	}

	public String getMappingType() {
		return mappingType;
	}

	public void setMappingType(String mappingType) {
		this.mappingType = mappingType;
	}

	public int getContactId() {
		return contactId;
	}

	public void setContactId(int contactId) {
		this.contactId = contactId;
	}

	public int getClientId() {
		return clientId;
	}

	public void setClientId(int clientId) {
		this.clientId = clientId;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public LocalDateTime getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
	}

	public LocalDateTime getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(LocalDateTime updatedDate) {
		this.updatedDate = updatedDate;
	}

	public LocalDateTime getDeletedDate() {
		return deletedDate;
	}

	public void setDeletedDate(LocalDateTime deletedDate) {
		this.deletedDate = deletedDate;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public String getDeletedBy() {
		return deletedBy;
	}

	public void setDeletedBy(String deletedBy) {
		this.deletedBy = deletedBy;
	}

	public boolean isPrimary() {
		return primary;
	}

	public void setPrimary(boolean primary) {
		this.primary = primary;
	}
	
}
