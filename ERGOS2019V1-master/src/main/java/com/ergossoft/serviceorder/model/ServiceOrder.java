/**
 * 
 */
package com.ergossoft.serviceorder.model;

import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ServiceOrder")
public class ServiceOrder {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "SO_ID")
	private Integer serviceOrderId;
	
	@Column(name = "Client_ID")
	private Integer clientId;
	
	@Column(name = "Company_ID")
	private Integer companyId;

	@Column(name = "SONumber")
	private String serviceOrderNumber;
	
	@Column(name = "SOType_ID")
	private Integer soTypeId;

	@Column(name = "Site_ID")
	private Integer siteId;

	@Column(name = "Customer_ID")
	private Integer customerId;
	
	@Column(name = "IsCompanyOrCustomer")
	private boolean isCompanyOrCustomer;

	@Column(name = "ProblemType_ID")
	private Integer problemTypeId;

	@Column(name = "OpeningComments")
	private String openingCommments;

	@Column(name = "ClosingComments")
	private String closingComments;
	
	@Column(name = "Attachment")
	private String attachment;
	
	@Column(name = "AssignedBy")
	public String assignedBy;

	@Column(name = "AssignedDate")
	private LocalDateTime assignedDate;
	
	@Column(name = "Employee_ID")
	private Integer employeeId;
	
	@Column(name = "ScheduleTime_ID")
	private Integer scheduledTimeId;

	@Column(name = "ScheduleStart")
	private Date scheduleStart;
	
	@Column(name = "ScheduleEnd")
	private Date scheduleEnd;
	
	@Column(name = "ScheduleDays")
	private Integer scheduledDays;
	
	@Column(name = "ScheduleExtraDays")
	private Integer scheduledExtraDays;
	
	@Column(name = "RemainingDays")
	private Integer remainingDays;
	
	/*
	 * @Column(name = "BillingAddressId") private Integer billingAddressId;
	 * 
	*/

	@Column(name = "ScheduleNote")
	private String scheduleNote;
	
	@Column(name = "Priority_ID")
	private int priorityId;

	@Column(name = "PaymentTerm_ID")
	private int paymentTermId;

	@Column(name = "MarketingCampaign_ID")
	private int marketingCampaignId;


	@Column(name = "WaitList")
	private boolean waitlist;

	@Column(name = "ManagerApproved")
	private boolean managerApproved;

	

	@Column(name = "SendToTechnician")
	private boolean sendtoTechnician;

	@Column(name = "SeqNumber") 
	private Integer seqNumber;
	
	@Column(name = "Confirmed")
	private boolean confirmed;

	@Column(name = "ConfirmedDate")
	private LocalDateTime confirmedDate;
	
	@Column(name = "ApprovedBy")
	public String approvedBy;

	@Column(name = "ApprovalDate")
	private LocalDateTime approvalDate;

	@Column(name = "ClosedBy")
	private String closeBy;
	
	@Column(name = "ClosedDate")
	private LocalDateTime closeDate;
	
	@Column(name = "MembershipOffered")
	private boolean membershipOffered;
	

	/*@Column(name = "ExtendedNotes")
	private String extendedNotes;*/
	@Column(name = "Sold_By")
	private String soldBy;

	@Column(name = "Invoice_ID")
	private int invoiceId;

	@Column(name = "Labour")
	private String labour;

	@Column(name = "Discount")
	private Float discount;

	@Column(name = "PartCharge")
	private Float partCharge;

	@Column(name = "ServiceCharge")
	private Float serviceCharge;

	@Column(name = "SubTotal")
	private Float subTotal;

	@Column(name = "Tax")
	private Float tax;

	@Column(name = "WarrantySales")
	private String warrantySales;

	@Column(name = "TotalInvoice")
	private Float totalInvoice;

	@Column(name = "Revenue")
	public Float revenue;

	@Column(name = "Cost")
	public Float cost;

	@Column(name = "ProfitOrLoss")
	public Float profitOrLoss;
	
	@Column(name = "SOSubStatus_ID")
	private Integer serviceSubOrderStatusId;

	@Column(name = "SOStatus_ID")
	private Integer serviceOrderStatusId;

	@Column(name = "Status")
	private int status;
	
	@Column(name = "CreatedDate")
	private LocalDateTime createdDate;
   	@Column(name = "UpdatedDate")
	private LocalDateTime lastModifiedDate;

 
	@Column(name = "UpdatedBy")
	private String lastModifiedBy;


	public Integer getServiceOrderId() {
		return serviceOrderId;
	}


	public void setServiceOrderId(Integer serviceOrderId) {
		this.serviceOrderId = serviceOrderId;
	}


	public Integer getClientId() {
		return clientId;
	}


	public void setClientId(Integer clientId) {
		this.clientId = clientId;
	}


	public Integer getCompanyId() {
		return companyId;
	}


	public void setCompanyId(Integer companyId) {
		this.companyId = companyId;
	}


	public String getServiceOrderNumber() {
		return serviceOrderNumber;
	}


	public void setServiceOrderNumber(String serviceOrderNumber) {
		this.serviceOrderNumber = serviceOrderNumber;
	}


	public Integer getSoTypeId() {
		return soTypeId;
	}


	public void setSoTypeId(Integer soTypeId) {
		this.soTypeId = soTypeId;
	}


	public Integer getSiteId() {
		return siteId;
	}


	public void setSiteId(Integer siteId) {
		this.siteId = siteId;
	}


	public Integer getCustomerId() {
		return customerId;
	}


	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}


	public boolean isCompanyOrCustomer() {
		return isCompanyOrCustomer;
	}


	public void setCompanyOrCustomer(boolean isCompanyOrCustomer) {
		this.isCompanyOrCustomer = isCompanyOrCustomer;
	}


	public Integer getProblemTypeId() {
		return problemTypeId;
	}


	public void setProblemTypeId(Integer problemTypeId) {
		this.problemTypeId = problemTypeId;
	}


	public String getOpeningCommments() {
		return openingCommments;
	}


	public void setOpeningCommments(String openingCommments) {
		this.openingCommments = openingCommments;
	}


	public String getClosingComments() {
		return closingComments;
	}


	public void setClosingComments(String closingComments) {
		this.closingComments = closingComments;
	}


	public String getAttachment() {
		return attachment;
	}


	public void setAttachment(String attachment) {
		this.attachment = attachment;
	}


	public String getAssignedBy() {
		return assignedBy;
	}


	public void setAssignedBy(String assignedBy) {
		this.assignedBy = assignedBy;
	}


	public LocalDateTime getAssignedDate() {
		return assignedDate;
	}


	public void setAssignedDate(LocalDateTime assignedDate) {
		this.assignedDate = assignedDate;
	}


	public Integer getEmployeeId() {
		return employeeId;
	}


	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}


	public Integer getScheduledTimeId() {
		return scheduledTimeId;
	}


	public void setScheduledTimeId(Integer scheduledTimeId) {
		this.scheduledTimeId = scheduledTimeId;
	}


	public Date getScheduleStart() {
		return scheduleStart;
	}


	public void setScheduleStart(Date scheduleStart) {
		this.scheduleStart = scheduleStart;
	}


	public Date getScheduleEnd() {
		return scheduleEnd;
	}


	public void setScheduleEnd(Date scheduleEnd) {
		this.scheduleEnd = scheduleEnd;
	}


	public Integer getScheduledDays() {
		return scheduledDays;
	}


	public void setScheduledDays(Integer scheduledDays) {
		this.scheduledDays = scheduledDays;
	}


	public Integer getScheduledExtraDays() {
		return scheduledExtraDays;
	}


	public void setScheduledExtraDays(Integer scheduledExtraDays) {
		this.scheduledExtraDays = scheduledExtraDays;
	}


	public Integer getRemainingDays() {
		return remainingDays;
	}


	public void setRemainingDays(Integer remainingDays) {
		this.remainingDays = remainingDays;
	}


	public String getScheduleNote() {
		return scheduleNote;
	}


	public void setScheduleNote(String scheduleNote) {
		this.scheduleNote = scheduleNote;
	}


	public int getPriorityId() {
		return priorityId;
	}


	public void setPriorityId(int priorityId) {
		this.priorityId = priorityId;
	}


	public int getPaymentTermId() {
		return paymentTermId;
	}


	public void setPaymentTermId(int paymentTermId) {
		this.paymentTermId = paymentTermId;
	}


	public int getMarketingCampaignId() {
		return marketingCampaignId;
	}


	public void setMarketingCampaignId(int marketingCampaignId) {
		this.marketingCampaignId = marketingCampaignId;
	}


	public boolean isWaitlist() {
		return waitlist;
	}


	public void setWaitlist(boolean waitlist) {
		this.waitlist = waitlist;
	}


	public boolean isManagerApproved() {
		return managerApproved;
	}


	public void setManagerApproved(boolean managerApproved) {
		this.managerApproved = managerApproved;
	}


	public boolean isSendtoTechnician() {
		return sendtoTechnician;
	}


	public void setSendtoTechnician(boolean sendtoTechnician) {
		this.sendtoTechnician = sendtoTechnician;
	}


	public Integer getSeqNumber() {
		return seqNumber;
	}


	public void setSeqNumber(Integer seqNumber) {
		this.seqNumber = seqNumber;
	}


	public boolean isConfirmed() {
		return confirmed;
	}


	public void setConfirmed(boolean confirmed) {
		this.confirmed = confirmed;
	}


	public LocalDateTime getConfirmedDate() {
		return confirmedDate;
	}


	public void setConfirmedDate(LocalDateTime confirmedDate) {
		this.confirmedDate = confirmedDate;
	}


	public String getApprovedBy() {
		return approvedBy;
	}


	public void setApprovedBy(String approvedBy) {
		this.approvedBy = approvedBy;
	}


	public LocalDateTime getApprovalDate() {
		return approvalDate;
	}


	public void setApprovalDate(LocalDateTime approvalDate) {
		this.approvalDate = approvalDate;
	}


	public String getCloseBy() {
		return closeBy;
	}


	public void setCloseBy(String closeBy) {
		this.closeBy = closeBy;
	}


	public LocalDateTime getCloseDate() {
		return closeDate;
	}


	public void setCloseDate(LocalDateTime closeDate) {
		this.closeDate = closeDate;
	}


	public boolean isMembershipOffered() {
		return membershipOffered;
	}


	public void setMembershipOffered(boolean membershipOffered) {
		this.membershipOffered = membershipOffered;
	}


	public String getSoldBy() {
		return soldBy;
	}


	public void setSoldBy(String soldBy) {
		this.soldBy = soldBy;
	}


	public int getInvoiceId() {
		return invoiceId;
	}


	public void setInvoiceId(int invoiceId) {
		this.invoiceId = invoiceId;
	}


	public String getLabour() {
		return labour;
	}


	public void setLabour(String labour) {
		this.labour = labour;
	}


	public Float getDiscount() {
		return discount;
	}


	public void setDiscount(Float discount) {
		this.discount = discount;
	}


	public Float getPartCharge() {
		return partCharge;
	}


	public void setPartCharge(Float partCharge) {
		this.partCharge = partCharge;
	}


	public Float getServiceCharge() {
		return serviceCharge;
	}


	public void setServiceCharge(Float serviceCharge) {
		this.serviceCharge = serviceCharge;
	}


	public Float getSubTotal() {
		return subTotal;
	}


	public void setSubTotal(Float subTotal) {
		this.subTotal = subTotal;
	}


	public Float getTax() {
		return tax;
	}


	public void setTax(Float tax) {
		this.tax = tax;
	}


	public String getWarrantySales() {
		return warrantySales;
	}


	public void setWarrantySales(String warrantySales) {
		this.warrantySales = warrantySales;
	}


	public Float getTotalInvoice() {
		return totalInvoice;
	}


	public void setTotalInvoice(Float totalInvoice) {
		this.totalInvoice = totalInvoice;
	}


	public Float getRevenue() {
		return revenue;
	}


	public void setRevenue(Float revenue) {
		this.revenue = revenue;
	}


	public Float getCost() {
		return cost;
	}


	public void setCost(Float cost) {
		this.cost = cost;
	}


	public Float getProfitOrLoss() {
		return profitOrLoss;
	}


	public void setProfitOrLoss(Float profitOrLoss) {
		this.profitOrLoss = profitOrLoss;
	}


	public Integer getServiceSubOrderStatusId() {
		return serviceSubOrderStatusId;
	}


	public void setServiceSubOrderStatusId(Integer serviceSubOrderStatusId) {
		this.serviceSubOrderStatusId = serviceSubOrderStatusId;
	}


	public Integer getServiceOrderStatusId() {
		return serviceOrderStatusId;
	}


	public void setServiceOrderStatusId(Integer serviceOrderStatusId) {
		this.serviceOrderStatusId = serviceOrderStatusId;
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


	public LocalDateTime getLastModifiedDate() {
		return lastModifiedDate;
	}


	public void setLastModifiedDate(LocalDateTime lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
	}

//modified from int to string
	public String getLastModifiedBy() {
		return lastModifiedBy;
	}


	public void setLastModifiedBy(String lastModifiedBy) {
		this.lastModifiedBy = lastModifiedBy;
	}
	
	/*
	 * @Column(name = "TaxExempt") private Boolean taxExempt;
	 */
	/*@Column(name = "ScheduledDate")
	private LocalDate scheduledDate;

	@Column(name = "ScheduledTime")
	private LocalTime scheduledTime;
	@Column(name = "EventLog")
	private String eventLog;
	*/
	
}
