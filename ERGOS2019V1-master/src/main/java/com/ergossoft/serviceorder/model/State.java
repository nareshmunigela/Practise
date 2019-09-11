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
@Table(name = "State")
public class State {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "State_ID")
	private Integer stateId;

	@Column(name = "StateCode")
	private String stateCode;

	@Column(name = "State")
	private String stateDescription;

	@Column(name = "Country")
	private String country;

	@Column(name = "StateTaxRate")
	private Integer stateTaxRate;

	@Column(name = "LaborTaxRate")
	private Integer laborTaxRate;

	@Column(name = "TotalTaxable")
	private Boolean totalTaxable;

	@Column(name = "LaborTaxable")
	private Boolean laborTaxable;

	@Column(name = "PartsTaxable")
	private Boolean partsTaxable;

	@Column(name = "TimeZone")
	private LocalDateTime timeZone;

	@Column(name = "SystemValue")
	private Boolean systemValue;

	@Column(name = "Status")
	private Boolean status;

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

	public Integer getStateId() {
		return stateId;
	}

	public void setStateId(Integer stateId) {
		this.stateId = stateId;
	}

	public String getStateCode() {
		return stateCode;
	}

	public void setStateCode(String stateCode) {
		this.stateCode = stateCode;
	}

	/**
	 * @return the stateDescription
	 */
	public String getStateDescription() {
		return stateDescription;
	}

	/**
	 * @param stateDescription the stateDescription to set
	 */
	public void setStateDescription(String stateDescription) {
		this.stateDescription = stateDescription;
	}

	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}

	/**
	 * @return the stateTaxRate
	 */
	public Integer getStateTaxRate() {
		return stateTaxRate;
	}

	/**
	 * @param stateTaxRate the stateTaxRate to set
	 */
	public void setStateTaxRate(Integer stateTaxRate) {
		this.stateTaxRate = stateTaxRate;
	}

	/**
	 * @return the laborTaxRate
	 */
	public Integer getLaborTaxRate() {
		return laborTaxRate;
	}

	/**
	 * @param laborTaxRate the laborTaxRate to set
	 */
	public void setLaborTaxRate(Integer laborTaxRate) {
		this.laborTaxRate = laborTaxRate;
	}

	/**
	 * @return the totalTaxable
	 */
	public Boolean getTotalTaxable() {
		return totalTaxable;
	}

	/**
	 * @param totalTaxable the totalTaxable to set
	 */
	public void setTotalTaxable(Boolean totalTaxable) {
		this.totalTaxable = totalTaxable;
	}

	/**
	 * @return the laborTaxable
	 */
	public Boolean getLaborTaxable() {
		return laborTaxable;
	}

	/**
	 * @param laborTaxable the laborTaxable to set
	 */
	public void setLaborTaxable(Boolean laborTaxable) {
		this.laborTaxable = laborTaxable;
	}

	/**
	 * @return the partsTaxable
	 */
	public Boolean getPartsTaxable() {
		return partsTaxable;
	}

	/**
	 * @param partsTaxable the partsTaxable to set
	 */
	public void setPartsTaxable(Boolean partsTaxable) {
		this.partsTaxable = partsTaxable;
	}

	/**
	 * @return the timeZone
	 */
	public LocalDateTime getTimeZone() {
		return timeZone;
	}

	/**
	 * @param timeZone the timeZone to set
	 */
	public void setTimeZone(LocalDateTime timeZone) {
		this.timeZone = timeZone;
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
