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
@Table(name = "MarketingCampaign")
public class MarketingCampaign {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "MarketingCampaign_ID")
	private int marketingcampaignId;
	
	@Column(name = "MarketingCampaign")
	private String marketingcampaign;

	@Column(name = "Description")
	private String description;

	@Column(name = "Client_ID")
	private int clientId;

	@Column(name = "CampaignType_ID")
	private String campaignType;

	@Column(name = "AddNumber")
	private String adNumber;

	@Column(name = "PhoneNumber")
	private String phoneNumber;

	@Column(name = "CancelledDate")
	private LocalDateTime cancelledDate;

	@Column(name = "ClosedDate")
	private LocalDateTime closedDate;

	@Column(name = "Status")
	private boolean status;

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
	 * @return the marketingcampaignId
	 */
	public int getMarketingcampaignId() {
		return marketingcampaignId;
	}

	/**
	 * @param marketingcampaignId the marketingcampaignId to set
	 */
	public void setMarketingcampaignId(int marketingcampaignId) {
		this.marketingcampaignId = marketingcampaignId;
	}	

	public String getMarketingcampaign() {
		return marketingcampaign;
	}

	public void setMarketingcampaign(String marketingcampaign) {
		this.marketingcampaign = marketingcampaign;
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
	 * @return the campaignType
	 */
	public String getCampaignType() {
		return campaignType;
	}

	/**
	 * @param campaignType the campaignType to set
	 */
	public void setCampaignType(String campaignType) {
		this.campaignType = campaignType;
	}

	/**
	 * @return the adNumber
	 */
	public String getAdNumber() {
		return adNumber;
	}

	/**
	 * @param adNumber the adNumber to set
	 */
	public void setAdNumber(String adNumber) {
		this.adNumber = adNumber;
	}

	/**
	 * @return the phoneNumber
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}

	/**
	 * @param phoneNumber the phoneNumber to set
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	/**
	 * @return the cancelledDate
	 */
	public LocalDateTime getCancelledDate() {
		return cancelledDate;
	}

	/**
	 * @param cancelledDate the cancelledDate to set
	 */
	public void setCancelledDate(LocalDateTime cancelledDate) {
		this.cancelledDate = cancelledDate;
	}

	/**
	 * @return the closedDate
	 */
	public LocalDateTime getClosedDate() {
		return closedDate;
	}

	/**
	 * @param closedDate the closedDate to set
	 */
	public void setClosedDate(LocalDateTime closedDate) {
		this.closedDate = closedDate;
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
