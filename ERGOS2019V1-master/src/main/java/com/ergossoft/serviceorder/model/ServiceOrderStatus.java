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
@Table(name="SOStatus")
public class ServiceOrderStatus {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "SOStatus_ID")
	private Integer serviceorderStatusid;
	
	@Column(name = "Description")
	private String description;
	
	@Column(name = "StatusCode")
	private String statusOldCode;
	
	@Column(name = "ForeGround")
	private String foreGround;
	
	@Column(name = "BackGround")
	private Integer backGround;	
	
	@Column(name = "Client_ID")
	private Integer clientId;
	
	@Column(name= "SystemValue")
	private boolean systemValue;
	
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

	public Integer getServiceorderStatusid() {
		return serviceorderStatusid;
	}

	public void setServiceorderStatusid(Integer serviceorderStatusid) {
		this.serviceorderStatusid = serviceorderStatusid;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getStatusOldCode() {
		return statusOldCode;
	}

	public void setStatusOldCode(String statusOldCode) {
		this.statusOldCode = statusOldCode;
	}

	public String getForeGround() {
		return foreGround;
	}

	public void setForeGround(String foreGround) {
		this.foreGround = foreGround;
	}

	public Integer getBackGround() {
		return backGround;
	}

	public void setBackGround(Integer backGround) {
		this.backGround = backGround;
	}

	public Integer getClientId() {
		return clientId;
	}

	public void setClientId(Integer clientId) {
		this.clientId = clientId;
	}

	public boolean isSystemValue() {
		return systemValue;
	}

	public void setSystemValue(boolean systemValue) {
		this.systemValue = systemValue;
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

	
}
