package com.ergossoft.serviceorder.model;

public class MediaDto {

	
	
	private String mediaId;
	private int soId;
	private int equipmentId;
	private String imgStr;
	
	private String fileName;
	private String fileType;
	
	private String mediaFileSize;
	private int mediaCategoryId;
	 
	private String updatedDate;
	
	public int getSoId() {
		return soId;
	}
	public void setSoId(int soId) {
		this.soId = soId;
	}
	public int getEquipmentId() {
		return equipmentId;
	}
	public void setEquipmentId(int equipmentId) {
		this.equipmentId = equipmentId;
	}
	public String getImgStr() {
		return imgStr;
	}
	public void setImgStr(String imgStr) {
		this.imgStr = imgStr;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public String getFileType() {
		return fileType;
	}
	public void setFileType(String fileType) {
		this.fileType = fileType;
	}
	public String getMediaId() {
		return mediaId;
	}
	public void setMediaId(String mediaId) {
		this.mediaId = mediaId;
	}
	public int getMediaCategoryId() {
		return mediaCategoryId;
	}
	public void setMediaCategoryId(int mediaCategoryId) {
		this.mediaCategoryId = mediaCategoryId;
	}
	public String getMediaFileSize() {
		return mediaFileSize;
	}
	public void setMediaFileSize(String mediaFileSize) {
		this.mediaFileSize = mediaFileSize;
	}
	public String getUpdatedDate() {
		return updatedDate;
	}
	public void setUpdatedDate(String updatedDate) {
		this.updatedDate = updatedDate;
	}
	
	
	
	
	
}
