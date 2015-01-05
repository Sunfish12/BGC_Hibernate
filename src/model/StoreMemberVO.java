package model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class StoreMemberVO implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int storeMemberId;
	private String storeUsername;
	private byte[] storePswd;
	private Date storeJoinDate;
	private String storePhone;
	private String imgFileName;
	private byte[] storeImage;
	private String storeEmail;
	private String storeWebsite;
	private Set<BoardGamesVO> boardGameses = new HashSet<BoardGamesVO>(0);
	private Set<StoreInformationVO> storeInformations = new HashSet<StoreInformationVO>(
			0);
	private Set<GroupRoomVO> groupRooms = new HashSet<GroupRoomVO>(0);

	public StoreMemberVO() {
	}

	public StoreMemberVO(int storeMemberId) {
		this.storeMemberId = storeMemberId;
	}

	public StoreMemberVO(int storeMemberId, String storeUsername,
			byte[] storePswd, Date storeJoinDate, String storePhone,
			String imgFileName, byte[] storeImage, String storeEmail,
			String storeWebsite, Set<BoardGamesVO> boardGameses,
			Set<StoreInformationVO> storeInformations, Set<GroupRoomVO> groupRooms) {
		this.storeMemberId = storeMemberId;
		this.storeUsername = storeUsername;
		this.storePswd = storePswd;
		this.storeJoinDate = storeJoinDate;
		this.storePhone = storePhone;
		this.imgFileName = imgFileName;
		this.storeImage = storeImage;
		this.storeEmail = storeEmail;
		this.storeWebsite = storeWebsite;
		this.boardGameses = boardGameses;
		this.storeInformations = storeInformations;
		this.groupRooms = groupRooms;
	}

	public int getStoreMemberId() {
		return this.storeMemberId;
	}

	public void setStoreMemberId(int storeMemberId) {
		this.storeMemberId = storeMemberId;
	}

	public String getStoreUsername() {
		return this.storeUsername;
	}

	public void setStoreUsername(String storeUsername) {
		this.storeUsername = storeUsername;
	}

	public byte[] getStorePswd() {
		return this.storePswd;
	}

	public void setStorePswd(byte[] storePswd) {
		this.storePswd = storePswd;
	}

	public Date getStoreJoinDate() {
		return this.storeJoinDate;
	}

	public void setStoreJoinDate(Date storeJoinDate) {
		this.storeJoinDate = storeJoinDate;
	}

	public String getStorePhone() {
		return this.storePhone;
	}

	public void setStorePhone(String storePhone) {
		this.storePhone = storePhone;
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

	public String getStoreEmail() {
		return this.storeEmail;
	}

	public void setStoreEmail(String storeEmail) {
		this.storeEmail = storeEmail;
	}

	public String getStoreWebsite() {
		return this.storeWebsite;
	}

	public void setStoreWebsite(String storeWebsite) {
		this.storeWebsite = storeWebsite;
	}

	public Set<BoardGamesVO> getBoardGameses() {
		return this.boardGameses;
	}

	public void setBoardGameses(Set<BoardGamesVO> boardGameses) {
		this.boardGameses = boardGameses;
	}

	public Set<StoreInformationVO> getStoreInformations() {
		return this.storeInformations;
	}

	public void setStoreInformations(Set<StoreInformationVO> storeInformations) {
		this.storeInformations = storeInformations;
	}

	public Set<GroupRoomVO> getGroupRooms() {
		return this.groupRooms;
	}

	public void setGroupRooms(Set<GroupRoomVO> groupRooms) {
		this.groupRooms = groupRooms;
	}

}
