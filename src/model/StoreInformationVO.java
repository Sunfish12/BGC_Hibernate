package model;

import java.util.HashSet;
import java.util.Set;

public class StoreInformationVO implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int storeId;
	private StoreMemberVO storeMember;
	private String storeName;
	private String storeAddress;
	private String imgFileName;
	private byte[] storeImage;
	private String storeTel;
	private Double rentAreaCost;
	private Integer groupUpperLimit;
	private Set<StoreInformation_ImageVO> storeInformationImages = new HashSet<StoreInformation_ImageVO>(
			0);
	private StoreScoreVO storeScore;
	private RentalTimeVO rentalTime;

	public StoreInformationVO() {
	}

	public StoreInformationVO(int storeId) {
		this.storeId = storeId;
	}

	public StoreInformationVO(int storeId, StoreMemberVO storeMember,
			String storeName, String storeAddress, String imgFileName,
			byte[] storeImage, String storeTel, Double rentAreaCost,
			Integer groupUpperLimit,
			Set<StoreInformation_ImageVO> storeInformationImages,
			StoreScoreVO storeScore, RentalTimeVO rentalTime) {
		this.storeId = storeId;
		this.storeMember = storeMember;
		this.storeName = storeName;
		this.storeAddress = storeAddress;
		this.imgFileName = imgFileName;
		this.storeImage = storeImage;
		this.storeTel = storeTel;
		this.rentAreaCost = rentAreaCost;
		this.groupUpperLimit = groupUpperLimit;
		this.storeInformationImages = storeInformationImages;
		this.storeScore = storeScore;
		this.rentalTime = rentalTime;
	}

	public int getStoreId() {
		return this.storeId;
	}

	public void setStoreId(int storeId) {
		this.storeId = storeId;
	}

	public StoreMemberVO getStoreMember() {
		return this.storeMember;
	}

	public void setStoreMember(StoreMemberVO storeMember) {
		this.storeMember = storeMember;
	}

	public String getStoreName() {
		return this.storeName;
	}

	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}

	public String getStoreAddress() {
		return this.storeAddress;
	}

	public void setStoreAddress(String storeAddress) {
		this.storeAddress = storeAddress;
	}

	public String getImgFileName() {
		return this.imgFileName;
	}

	public void setImgFileName(String imgFileName) {
		this.imgFileName = imgFileName;
	}

	public byte[] getStoreImage() {
		return this.storeImage;
	}

	public void setStoreImage(byte[] storeImage) {
		this.storeImage = storeImage;
	}

	public String getStoreTel() {
		return this.storeTel;
	}

	public void setStoreTel(String storeTel) {
		this.storeTel = storeTel;
	}

	public Double getRentAreaCost() {
		return this.rentAreaCost;
	}

	public void setRentAreaCost(Double rentAreaCost) {
		this.rentAreaCost = rentAreaCost;
	}

	public Integer getGroupUpperLimit() {
		return this.groupUpperLimit;
	}

	public void setGroupUpperLimit(Integer groupUpperLimit) {
		this.groupUpperLimit = groupUpperLimit;
	}

	public Set<StoreInformation_ImageVO> getStoreInformationImages() {
		return this.storeInformationImages;
	}

	public void setStoreInformationImages(
			Set<StoreInformation_ImageVO> storeInformationImages) {
		this.storeInformationImages = storeInformationImages;
	}

	public StoreScoreVO getStoreScore() {
		return this.storeScore;
	}

	public void setStoreScore(StoreScoreVO storeScore) {
		this.storeScore = storeScore;
	}

	public RentalTimeVO getRentalTime() {
		return this.rentalTime;
	}

	public void setRentalTime(RentalTimeVO rentalTime) {
		this.rentalTime = rentalTime;
	}

}
