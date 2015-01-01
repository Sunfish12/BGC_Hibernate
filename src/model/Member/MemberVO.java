package model.Member;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import model.GroupRoom.GroupRoomVO;
import model.MemberFavoredType.MemberFavoredTypeVO;
import model.TabuUsernameTable.TabuUsernameTableVO;

public class MemberVO implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String username;
	private int memberId;
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
	private Set<GroupRoomVO> groupRooms = new HashSet<GroupRoomVO>(0);
	private MemberFavoredTypeVO memberFavoredType;
	private Set<TabuUsernameTableVO> tabuUsernameTablesForToTabuUsername = new HashSet<TabuUsernameTableVO>(
			0);
	private Set<TabuUsernameTableVO> tabuUsernameTablesForTabuUsername = new HashSet<TabuUsernameTableVO>(
			0);

	public MemberVO() {
	}

	public MemberVO(String username, int memberId, byte[] pswd, String email,
			String lastname, String firstname, String idCard) {
		this.username = username;
		this.memberId = memberId;
		this.pswd = pswd;
		this.email = email;
		this.lastname = lastname;
		this.firstname = firstname;
		this.idCard = idCard;
	}

	public MemberVO(String username, int memberId, byte[] pswd, String email,
			String lastname, String firstname, String gender,
			Serializable nickname, Date birthday, String idCard, Date joinDate,
			String phone, String memberAddress, String imgFileName,
			byte[] memberImage, Boolean isGroupBan, Boolean isCommentBan,
			Date notBanTime, Date banTime, Set<GroupRoomVO> groupRooms,
			MemberFavoredTypeVO memberFavoredType,
			Set<TabuUsernameTableVO> tabuUsernameTablesForToTabuUsername,
			Set<TabuUsernameTableVO> tabuUsernameTablesForTabuUsername) {
		this.username = username;
		this.memberId = memberId;
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
		this.groupRooms = groupRooms;
		this.memberFavoredType = memberFavoredType;
		this.tabuUsernameTablesForToTabuUsername = tabuUsernameTablesForToTabuUsername;
		this.tabuUsernameTablesForTabuUsername = tabuUsernameTablesForTabuUsername;
	}

	@Override
	public String toString() {
		return "[" + memberId + "," + username + "," + email + "," + lastname
				+ "," + firstname + "," + gender + "," + nickname + ","
				+ birthday + "," + idCard + "," + joinDate + "," + phone + ","
				+ memberAddress + "," + imgFileName + "," + isGroupBan + ","
				+ isCommentBan + "," + notBanTime + "," + banTime + "]";
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

	public static double convertDouble(String data) {
		double result = 0;
		try {
			result = Double.parseDouble(data);
		} catch (NumberFormatException e) {
			e.printStackTrace();
			result = -1000;
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

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public int getMemberId() {
		return this.memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
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

	public Set<GroupRoomVO> getGroupRooms() {
		return this.groupRooms;
	}

	public void setGroupRooms(Set<GroupRoomVO> groupRooms) {
		this.groupRooms = groupRooms;
	}

	public MemberFavoredTypeVO getMemberFavoredType() {
		return this.memberFavoredType;
	}

	public void setMemberFavoredType(MemberFavoredTypeVO memberFavoredType) {
		this.memberFavoredType = memberFavoredType;
	}

	public Set<TabuUsernameTableVO> getTabuUsernameTablesForToTabuUsername() {
		return this.tabuUsernameTablesForToTabuUsername;
	}

	public void setTabuUsernameTablesForToTabuUsername(
			Set<TabuUsernameTableVO> tabuUsernameTablesForToTabuUsername) {
		this.tabuUsernameTablesForToTabuUsername = tabuUsernameTablesForToTabuUsername;
	}

	public Set<TabuUsernameTableVO> getTabuUsernameTablesForTabuUsername() {
		return this.tabuUsernameTablesForTabuUsername;
	}

	public void setTabuUsernameTablesForTabuUsername(
			Set<TabuUsernameTableVO> tabuUsernameTablesForTabuUsername) {
		this.tabuUsernameTablesForTabuUsername = tabuUsernameTablesForTabuUsername;
	}

}
