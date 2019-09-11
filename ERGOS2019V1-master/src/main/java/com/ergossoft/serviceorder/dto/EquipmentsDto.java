package com.ergossoft.serviceorder.dto;

import java.time.LocalDate;
import java.util.Date;

public class EquipmentsDto {
	
	
	private Integer equipmentId;
	private String name;
	private String description;
	private String manufacturer;
	private String serialNumber;
	private String warranty;
	private  Date installationDate;
	private String type;
	private String imgStr;
	
	private boolean installedByUs;
	
	public Integer getEquipmentId() {
		return equipmentId;
	}
	public void setEquipmentId(Integer equipmentId) {
		this.equipmentId = equipmentId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public String getSerialNumber() {
		return serialNumber;
	}
	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}
	public String getWarranty() {
		return warranty;
	}
	public void setWarranty(String warranty) {
		this.warranty = warranty;
	}
	
	
	
	 
	public Date getInstallationDate() {
		return installationDate;
	}
	public void setInstallationDate(Date installationDate) {
		this.installationDate = installationDate;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getImgStr() {
		return imgStr;
	}
	public void setImgStr(String imgStr) {
		this.imgStr = imgStr;
	}
	public boolean getInstalledByUs() {
		return installedByUs;
	}
	public void setInstalledByUs(boolean installedByUs) {
		this.installedByUs = installedByUs;
	}
	
	
	

}
