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
@Table(name = "ProblemType")
public class ProblemType {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ProblemType_ID")
	private Integer problemTypeId;

	@Column(name = "ProblemTypeCode")
	private String problemTypeCode;

	@Column(name = "Description")
	private String description;

	@Column(name = "TimeToComplete")
	private Integer timeToComplete;

	@Column(name = "EstimatedHour")
	private Integer estimatedHours;

	@Column(name = "MaintenanceOnly")
	private int maintenanceonly;

	@Column(name = "ProblemCategory_ID")
	private Integer problemCategoryId;

	@Column(name = "Client_ID")
	private Integer clientId;

	@Column(name = "SystemValue")
	private Boolean systemValue;

	@Column(name = "Status")
	private Boolean status;

	@Column(name = "SkillType_ID")
	private Integer skillTypeId;

	@Column(name = "SkillLevel_ID")
	private Integer skillLevelId;

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

	public String getProblemTypeCode() {
		return problemTypeCode;
	}

	public void setProblemTypeCode(String problemTypeCode) {
		this.problemTypeCode = problemTypeCode;
	}

	public int getMaintenanceonly() {
		return maintenanceonly;
	}

	public void setMaintenanceonly(int maintenanceonly) {
		this.maintenanceonly = maintenanceonly;
	}

	public Integer getSkillTypeId() {
		return skillTypeId;
	}

	public void setSkillTypeId(Integer skillTypeId) {
		this.skillTypeId = skillTypeId;
	}

	public Integer getSkillLevelId() {
		return skillLevelId;
	}

	public void setSkillLevelId(Integer skillLevelId) {
		this.skillLevelId = skillLevelId;
	}

	/**
	 * @return the problemTypeId
	 */
	public Integer getProblemTypeId() {
		return problemTypeId;
	}

	/**
	 * @param problemTypeId the problemTypeId to set
	 */
	public void setProblemTypeId(Integer problemTypeId) {
		this.problemTypeId = problemTypeId;
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
	 * @return the timeToComplete
	 */
	public Integer getTimeToComplete() {
		return timeToComplete;
	}

	/**
	 * @param timeToComplete the timeToComplete to set
	 */
	public void setTimeToComplete(Integer timeToComplete) {
		this.timeToComplete = timeToComplete;
	}

	/**
	 * @return the estimatedHours
	 */
	public Integer getEstimatedHours() {
		return estimatedHours;
	}

	/**
	 * @param estimatedHours the estimatedHours to set
	 */
	public void setEstimatedHours(Integer estimatedHours) {
		this.estimatedHours = estimatedHours;
	}

	/**
	 * @return the maintainanceOnly
	 */
	public int getMaintainanceonly() {
		return maintenanceonly;
	}

	/**
	 * @param maintainanceOnly the maintainanceOnly to set
	 */
	public void setMaintainanceonly(int maintainanceOnly) {
		this.maintenanceonly = maintainanceOnly;
	}

	/**
	 * @return the problemCategoryId
	 */
	public Integer getProblemCategoryId() {
		return problemCategoryId;
	}

	/**
	 * @param problemCategoryId the problemCategoryId to set
	 */
	public void setProblemCategoryId(Integer problemCategoryId) {
		this.problemCategoryId = problemCategoryId;
	}

	/**
	 * @return the clientId
	 */
	public Integer getClientId() {
		return clientId;
	}

	/**
	 * @param clientId the clientId to set
	 */
	public void setClientId(Integer clientId) {
		this.clientId = clientId;
	}

	/**
	 * @return the systemValue
	 */
	public Boolean getSystemValue() {
		return systemValue;
	}

	/**
	 * @param systemValue the systemValue to set
	 */
	public void setSystemValue(Boolean systemValue) {
		this.systemValue = systemValue;
	}

	/**
	 * @return the status
	 */
	public Boolean getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(Boolean status) {
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
