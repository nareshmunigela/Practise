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
@Table(name = "Property")
public class Property {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Property_ID")
	private Integer propertyTypeId;

	@Column(name = "PropertyCode")
	private String PropertyCode;

	@Column(name = "Description")
	private String description;

	@Column(name = "Client_ID")
	private Integer clientId;

	@Column(name = "LaborTax")
	private Float laborTax;

	@Column(name = "PartTax")
	private Float partsTax;

	@Column(name = "TotalTax")
	private Float totalTax;

	@Column(name = "ResidentialCommercial")
	private String residentialCommercial;

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

	/**
	 * @return the propertyTypeId
	 */
	public Integer getPropertyTypeId() {
		return propertyTypeId;
	}

	/**
	 * @param propertyTypeId the propertyTypeId to set
	 */
	public void setPropertyTypeId(Integer propertyTypeId) {
		this.propertyTypeId = propertyTypeId;
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
	 * @return the laborTax
	 */
	public Float getLaborTax() {
		return laborTax;
	}

	/**
	 * @param laborTax the laborTax to set
	 */
	public void setLaborTax(Float laborTax) {
		this.laborTax = laborTax;
	}

	/**
	 * @return the partsTax
	 */
	public Float getPartsTax() {
		return partsTax;
	}

	/**
	 * @param partsTax the partsTax to set
	 */
	public void setPartsTax(Float partsTax) {
		this.partsTax = partsTax;
	}

	/**
	 * @return the totalTax
	 */
	public Float getTotalTax() {
		return totalTax;
	}

	/**
	 * @param totalTax the totalTax to set
	 */
	public void setTotalTax(Float totalTax) {
		this.totalTax = totalTax;
	}

	public String getPropertyCode() {
		return PropertyCode;
	}

	public void setPropertyCode(String propertyCode) {
		PropertyCode = propertyCode;
	}

	public String getResidentialCommercial() {
		return residentialCommercial;
	}

	public void setResidentialCommercial(String residentialCommercial) {
		this.residentialCommercial = residentialCommercial;
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
