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
@Table(name = "SubscriptionPlan")
public class SubscriptionPlan {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "SubscriptionPlan_ID")
	private Integer subscriptionPlanId;

	@Column(name = "Name")
	private String name;

	@Column(name = "NumberOfUsers")
	private Integer numberOfUsers;

	@Column(name = "BillingCostPerMonth")
	private Float billingCostPerMonth;

	@Column(name = "BillingCostPerYear")
	private Float billingCostPerYear;

	@Column(name = "BillingOption")
	private String billingOption;

	@Column(name = "AddonUserCost")
	private Float addOnUserCost;

	@Column(name = "ActivationFee")
	private Float activationFee;

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
	 * @return the subscriptionPlanId
	 */
	public Integer getSubscriptionPlanId() {
		return subscriptionPlanId;
	}

	/**
	 * @param subscriptionPlanId the subscriptionPlanId to set
	 */
	public void setSubscriptionPlanId(Integer subscriptionPlanId) {
		this.subscriptionPlanId = subscriptionPlanId;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the numberOfUsers
	 */
	public Integer getNumberOfUsers() {
		return numberOfUsers;
	}

	/**
	 * @param numberOfUsers the numberOfUsers to set
	 */
	public void setNumberOfUsers(Integer numberOfUsers) {
		this.numberOfUsers = numberOfUsers;
	}

	/**
	 * @return the billingCostPerMonth
	 */
	public Float getBillingCostPerMonth() {
		return billingCostPerMonth;
	}

	/**
	 * @param billingCostPerMonth the billingCostPerMonth to set
	 */
	public void setBillingCostPerMonth(Float billingCostPerMonth) {
		this.billingCostPerMonth = billingCostPerMonth;
	}

	/**
	 * @return the billingCostPerYear
	 */
	public Float getBillingCostPerYear() {
		return billingCostPerYear;
	}

	/**
	 * @param billingCostPerYear the billingCostPerYear to set
	 */
	public void setBillingCostPerYear(Float billingCostPerYear) {
		this.billingCostPerYear = billingCostPerYear;
	}

	/**
	 * @return the billingOption
	 */
	public String getBillingOption() {
		return billingOption;
	}

	/**
	 * @param billingOption the billingOption to set
	 */
	public void setBillingOption(String billingOption) {
		this.billingOption = billingOption;
	}

	/**
	 * @return the addOnUserCost
	 */
	public Float getAddOnUserCost() {
		return addOnUserCost;
	}

	/**
	 * @param addOnUserCost the addOnUserCost to set
	 */
	public void setAddOnUserCost(Float addOnUserCost) {
		this.addOnUserCost = addOnUserCost;
	}

	/**
	 * @return the activationFee
	 */
	public Float getActivationFee() {
		return activationFee;
	}

	/**
	 * @param activationFee the activationFee to set
	 */
	public void setActivationFee(Float activationFee) {
		this.activationFee = activationFee;
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
