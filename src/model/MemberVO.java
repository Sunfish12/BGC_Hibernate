package model;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class MemberVO implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int memberId;
	private String username;
	private byte[] pswd;
	private String email;
	private String lastname;
	private String firstname;
	private String gender;
	private Serializable nickname;
	private Date birthday;
	private String idCard;
	private Date joinDate;
	private String phone;
	private String memberAddress;
	private String imgFileName;
	private byte[] memberImage;
	private Boolean isGroupBan;
	private Boolean isCommentBan;
	private Date notBanTime;
	private Date banTime;
	private Set<TabuUsernameTableVO> tabuUsernameTablesForToTabuMemberId = new HashSet<TabuUsernameTableVO>(
			0);
	private Set<TabuUsernameTableVO> tabuUsernameTablesForTabuMemberId = new HashSet<TabuUsernameTableVO>(
			0);
	private Member_FavoredTypeVO memberFavoredType;
	private Set<GroupRoomVO> groupRooms = new HashSet<GroupRoomVO>(0);

	public MemberVO() {
	}

	public MemberVO(int memberId, String username, byte[] pswd, String email,
			String lastname, String firstname, String idCard) {
		this.memberId = memberId;
		this.username = username;
		this.pswd = pswd;
		this.email = email;
		this.lastname = lastname;
		this.firstname = firstname;
		this.idCard = idCard;
	}

	public MemberVO(int memberId, String username, byte[] pswd, String email,
			String lastname, String firstname, String gender,
			Serializable nickname, Date birthday, String idCard, Date joinDate,
			String phone, String memberAddress, String imgFileName,
			byte[] memberImage, Boolean isGroupBan, Boolean isCommentBan,
			Date notBanTime, Date banTime,
			Set<TabuUsernameTableVO> tabuUsernameTablesForToTabuMemberId,
			Set<TabuUsernameTableVO> tabuUsernameTablesForTabuMemberId,
			Member_FavoredTypeVO memberFavoredType, Set<GroupRoomVO> groupRooms) {
		this.memberId = memberId;
		this.username = username;
		this.pswd = pswd;
		this.email = email;
		this.lastname = lastname;
		this.firstname = firstname;
		this.gender = gender;
		this.nickname = nickname;
		this.birthday = birthday;
		this.idCard = idCard;
		this.joinDate = joinDate;
		this.phone = phone;
		this.memberAddress = memberAddress;
		this.imgFileName = imgFileName;
		this.memberImage = memberImage;
		this.isGroupBan = isGroupBan;
		this.isCommentBan = isCommentBan;
		this.notBanTime = notBanTime;
		this.banTime = banTime;
		this.tabuUsernameTablesForToTabuMemberId = tabuUsernameTablesForToTabuMemberId;
		this.tabuUsernameTablesForTabuMemberId = tabuUsernameTablesForTabuMemberId;
		this.memberFavoredType = memberFavoredType;
		this.groupRooms = groupRooms;
	}

	public int getMemberId() {
		return this.memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public byte[] getPswd() {
		return this.pswd;
	}

	public void setPswd(byte[] pswd) {
		this.pswd = pswd;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLastname() {
		return this.lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getFirstname() {
		return this.firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Serializable getNickname() {
		return this.nickname;
	}

	public void setNickname(Serializable nickname) {
		this.nickname = nickname;
	}

	public Date getBirthday() {
		return this.birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getIdCard() {
		return this.idCard;
	}

	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}

	public Date getJoinDate() {
		return this.joinDate;
	}

	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getMemberAddress() {
		return this.memberAddress;
	}

	public void setMemberAddress(String memberAddress) {
		this.memberAddress = memberAddress;
	}

	public String getImgFileName() {
		return this.imgFileName;
	}

	public void setImgFileName(String imgFileName) {
		this.imgFileName = imgFileName;
	}

	public byte[] getMemberImage() {
		return this.memberImage;
	}

	public void setMemberImage(byte[] memberImage) {
		this.memberImage = memberImage;
	}

	public Boolean getIsGroupBan() {
		return this.isGroupBan;
	}

	public void setIsGroupBan(Boolean isGroupBan) {
		this.isGroupBan = isGroupBan;
	}

	public Boolean getIsCommentBan() {
		return this.isCommentBan;
	}

	public void setIsCommentBan(Boolean isCommentBan) {
		this.isCommentBan = isCommentBan;
	}

	public Date getNotBanTime() {
		return this.notBanTime;
	}

	public void setNotBanTime(Date notBanTime) {
		this.notBanTime = notBanTime;
	}

	public Date getBanTime() {
		return this.banTime;
	}

	public void setBanTime(Date banTime) {
		this.banTime = banTime;
	}

	public Set<TabuUsernameTableVO> getTabuUsernameTablesForToTabuMemberId() {
		return this.tabuUsernameTablesForToTabuMemberId;
	}

	public void setTabuUsernameTablesForToTabuMemberId(
			Set<TabuUsernameTableVO> tabuUsernameTablesForToTabuMemberId) {
		this.tabuUsernameTablesForToTabuMemberId = tabuUsernameTablesForToTabuMemberId;
	}

	public Set<TabuUsernameTableVO> getTabuUsernameTablesForTabuMemberId() {
		return this.tabuUsernameTablesForTabuMemberId;
	}

	public void setTabuUsernameTablesForTabuMemberId(
			Set<TabuUsernameTableVO> tabuUsernameTablesForTabuMemberId) {
		this.tabuUsernameTablesForTabuMemberId = tabuUsernameTablesForTabuMemberId;
	}

	public Member_FavoredTypeVO getMemberFavoredType() {
		return this.memberFavoredType;
	}

	public void setMemberFavoredType(Member_FavoredTypeVO memberFavoredType) {
		this.memberFavoredType = memberFavoredType;
	}

	public Set<GroupRoomVO> getGroupRooms() {
		return this.groupRooms;
	}

	public void setGroupRooms(Set<GroupRoomVO> groupRooms) {
		this.groupRooms = groupRooms;
	}

}
