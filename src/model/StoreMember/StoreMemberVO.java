package model.StoreMember;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import model.BoardGames.BoardGamesVO;
import model.GroupRoom.GroupRoomVO;
import model.StoreInformation.StoreInformationVO;

public class StoreMemberVO implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String storeUsername;
	private int storeMemberId;
	private byte[] storePswd;
	private Date storeJoinDate;
	private String storePhone;
	private String imgFileName;
	private byte[] storeImage;
	private String storeEmail;
	private String storeWebsite;
	private Set<GroupRoomVO> groupRooms = new HashSet<GroupRoomVO>(0);
	private Set<StoreInformationVO> storeInformations = new HashSet<StoreInformationVO>(
			0);
	private Set<BoardGamesVO> boardGameses = new HashSet<BoardGamesVO>(0);

	public StoreMemberVO() {
	}

	public StoreMemberVO(String storeUsername, int storeMemberId) {
		this.storeUsername = storeUsername;
		this.storeMemberId = storeMemberId;
	}

	public StoreMemberVO(String storeUsername, int storeMemberId,
			byte[] storePswd, Date storeJoinDate, String storePhone,
			String imgFileName, byte[] storeImage, String storeEmail,
			String storeWebsite, Set<GroupRoomVO> groupRooms,
			Set<StoreInformationVO> storeInformations,
			Set<BoardGamesVO> boardGameses) {
		this.storeUsername = storeUsername;
		this.storeMemberId = storeMemberId;
		this.storePswd = storePswd;
		this.storeJoinDate = storeJoinDate;
		this.storePhone = storePhone;
		this.imgFileName = imgFileName;
		this.storeImage = storeImage;
		this.storeEmail = storeEmail;
		this.storeWebsite = storeWebsite;
		this.groupRooms = groupRooms;
		this.storeInformations = storeInformations;
		this.boardGameses = boardGameses;
	}

	@Override
	public String toString() {
		return "[" + storeMemberId + "," + storeUsername + "," + storeJoinDate
				+ "," + storePhone + "," + imgFileName + "," + storeEmail + ","
				+ storeWebsite + "]";
	}

	private static SimpleDateFormat sdFormat = new SimpleDateFormat(
			"yyyy-MM-dd");

	public static java.util.Date convertDate(String data) {
		java.util.Date result = null;
		try {
			result = sdFormat.parse(data);
		} catch (ParseException e) {
			e.printStackTrace();
			result = new java.util.Date(0);
		}
		return result;
	}

	public static int convertInt(String data) {
		int result = 0;
		try {
			result = Integer.parseInt(data);
		} catch (NumberFormatException e) {
			e.printStackTrace();
			result = -1000;
		}
		return result;
	}

	public String getStoreUsername() {
		return this.storeUsername;
	}

	public void setStoreUsername(String storeUsername) {
		this.storeUsername = storeUsername;
	}

	public int getStoreMemberId() {
		return this.storeMemberId;
	}

	public void setStoreMemberId(int storeMemberId) {
		this.storeMemberId = storeMemberId;
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

	public Set<GroupRoomVO> getGroupRooms() {
		return this.groupRooms;
	}

	public void setGroupRooms(Set<GroupRoomVO> groupRooms) {
		this.groupRooms = groupRooms;
	}

	public Set<StoreInformationVO> getStoreInformations() {
		return this.storeInformations;
	}

	public void setStoreInformations(Set<StoreInformationVO> storeInformations) {
		this.storeInformations = storeInformations;
	}

	public Set<BoardGamesVO> getBoardGameses() {
		return this.boardGameses;
	}

	public void setBoardGameses(Set<BoardGamesVO> boardGameses) {
		this.boardGameses = boardGameses;
	}

}
