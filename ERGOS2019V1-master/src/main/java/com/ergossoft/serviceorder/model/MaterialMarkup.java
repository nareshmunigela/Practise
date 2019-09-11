package com.ergossoft.serviceorder.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "MaterialMarkup")
public class MaterialMarkup {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "MaterialMarkup_ID")
	private long materialMarkup_ID;
	
	@Column(name = "MaterialMarkupCode")
	private String materialMarkupCode;
	
	@Column(name = "CostFrom")
	private Double costFrom;
	
	@Column(name = "CostUpto")
	private Double costUpto;
	
	@Column(name = "Divisor")
	private Double divisor;
	
	@Column(name = "Client_ID")
	private long clientID;
	
	@Column(name = "Status")
	private long status;
	
	@Column(name = "CreatedDate")
	private LocalDateTime createdDate;
	
	@Column(name = "DeletedDate")
	private LocalDateTime deletedDate;
	
	@Column(name = "CreatedBy")
	private String createdBy;
	
	@Column(name = "UpdatedBy")
	private String updatedBy;
	
	@Column(name = "DeletedBy")
	private String deletedBy;
	
	public long getMaterialMarkup_ID() {
		return materialMarkup_ID;
	}

	public void setMaterialMarkup_ID(long materialMarkup_ID) {
		this.materialMarkup_ID = materialMarkup_ID;
	}

	public String getMaterialMarkupCode() {
		return materialMarkupCode;
	}

	public void setMaterialMarkupCode(String materialMarkupCode) {
		this.materialMarkupCode = materialMarkupCode;
	}

	public Double getCostFrom() {
		return costFrom;
	}

	public void setCostFrom(Double costFrom) {
		this.costFrom = costFrom;
	}

	public Double getCostUpto() {
		return costUpto;
	}

	public void setCostUpto(Double costUpto) {
		this.costUpto = costUpto;
	}

	public Double getDivisor() {
		return divisor;
	}

	public void setDivisor(Double divisor) {
		this.divisor = divisor;
	}

	public long getClientID() {
		return clientID;
	}

	public void setClientID(long clientID) {
		this.clientID = clientID;
	}

	public long getStatus() {
		return status;
	}

	public void setStatus(long status) {
		this.status = status;
	}

	public LocalDateTime getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
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
}
