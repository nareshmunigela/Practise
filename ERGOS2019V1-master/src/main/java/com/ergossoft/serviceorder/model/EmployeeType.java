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

/**
 *  
 *
 */
@Entity
@Table(name = "EmployeeType")
public class EmployeeType {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "EmployeeType_ID")
	private int employeeTypeId;

	@Column(name = "EmployeeTypeCode")
	private String employeeTypeCode;

	@Column(name = "Description")
	private String description;

	@Column(name = "Service")
	private boolean service;

	@Column(name = "SalesMan")
	private boolean salesMan;

	@Column(name = "Dispatcher")
	private boolean dispatcher;

	@Column(name = "Audit")
	private boolean audit;

	@Column(name = "History")
	private boolean history;

	@Column(name = "Porequest")
	private boolean poRequest;

	@Column(name = "Client_ID")
	private int clientId;

	@Column(name = "SystemValue")
	private boolean systemValue;

	@Column(name = "Status")
	private boolean status;

	@Column(name = "CreatedDate")
	private LocalDateTime createdDate;

	@Column(name = "DeletedDate")
	private LocalDateTime deletedDate;

	@Column(name = "UpdatedDate")
	private LocalDateTime updatedDate;

	@Column(name = "CreatedBy")
	private String createdBy;

	@Column(name = "UpdatedBy")
	private String updatedBy;

	@Column(name = "DeletedBy")
	private String deletedBy;

	/**
	 * @return the employeeTypeId
	 */
	public int getEmployeeTypeId() {
		return employeeTypeId;
	}

	/**
	 * @param employeeTypeId the employeeTypeId to set
	 */
	public void setEmployeeTypeId(int employeeTypeId) {
		this.employeeTypeId = employeeTypeId;
	}

	/**
	 * @return the employeeTypeCode
	 */
	public String getEmployeeTypeCode() {
		return employeeTypeCode;
	}

	/**
	 * @param employeeTypeCode the employeeTypeCode to set
	 */
	public void setEmployeeTypeCode(String employeeTypeCode) {
		this.employeeTypeCode = employeeTypeCode;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the service
	 */
	public boolean isService() {
		return service;
	}

	/**
	 * @param service the service to set
	 */
	public void setService(boolean service) {
		this.service = service;
	}

	/**
	 * @return the salesMan
	 */
	public boolean isSalesMan() {
		return salesMan;
	}

	/**
	 * @param salesMan the salesMan to set
	 */
	public void setSalesMan(boolean salesMan) {
		this.salesMan = salesMan;
	}

	/**
	 * @return the dispatcher
	 */
	public boolean isDispatcher() {
		return dispatcher;
	}

	/**
	 * @param dispatcher the dispatcher to set
	 */
	public void setDispatcher(boolean dispatcher) {
		this.dispatcher = dispatcher;
	}

	/**
	 * @return the audit
	 */
	public boolean isAudit() {
		return audit;
	}

	/**
	 * @param audit the audit to set
	 */
	public void setAudit(boolean audit) {
		this.audit = audit;
	}

	/**
	 * @return the history
	 */
	public boolean isHistory() {
		return history;
	}

	/**
	 * @param history the history to set
	 */
	public void setHistory(boolean history) {
		this.history = history;
	}

	/**
	 * @return the poRequest
	 */
	public boolean isPoRequest() {
		return poRequest;
	}

	/**
	 * @param poRequest the poRequest to set
	 */
	public void setPoRequest(boolean poRequest) {
		this.poRequest = poRequest;
	}

	/**
	 * @return the clientId
	 */
	public int getClientId() {
		return clientId;
	}

	/**
	 * @param clientId the clientId to set
	 */
	public void setClientId(int clientId) {
		this.clientId = clientId;
	}

	/**
	 * @return the systemValue
	 */
	public boolean isSystemValue() {
		return systemValue;
	}

	/**
	 * @param systemValue the systemValue to set
	 */
	public void setSystemValue(boolean systemValue) {
		this.systemValue = systemValue;
	}

	/**
	 * @return the status
	 */
	public boolean isStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(boolean status) {
		this.status = status;
	}

	/**
	 * @return the createdDate
	 */
	public LocalDateTime getCreatedDate() {
		return createdDate;
	}

	/**
	 * @param createdDate the createdDate to set
	 */
	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
	}

	/**
	 * @return the deletedDate
	 */
	public LocalDateTime getDeletedDate() {
		return deletedDate;
	}

	/**
	 * @param deletedDate the deletedDate to set
	 */
	public void setDeletedDate(LocalDateTime deletedDate) {
		this.deletedDate = deletedDate;
	}

	/**
	 * @return the updatedDate
	 */
	public LocalDateTime getUpdatedDate() {
		return updatedDate;
	}

	/**
	 * @param updatedDate the updatedDate to set
	 */
	public void setUpdatedDate(LocalDateTime updatedDate) {
		this.updatedDate = updatedDate;
	}

	/**
	 * @return the createdBy
	 */
	public String getCreatedBy() {
		return createdBy;
	}

	/**
	 * @param createdBy the createdBy to set
	 */
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	/**
	 * @return the updatedBy
	 */
	public String getUpdatedBy() {
		return updatedBy;
	}

	/**
	 * @param updatedBy the updatedBy to set
	 */
	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	/**
	 * @return the deletedBy
	 */
	public String getDeletedBy() {
		return deletedBy;
	}

	/**
	 * @param deletedBy the deletedBy to set
	 */
	public void setDeletedBy(String deletedBy) {
		this.deletedBy = deletedBy;
	}

}
