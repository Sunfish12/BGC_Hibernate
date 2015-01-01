package model.GroupRoom;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import model.GroupChoiceGames.GroupChoiceGamesVO;
import model.GroupRoomInfo.GroupRoomInfoVO;
import model.GroupRoomMessage.GroupRoomMessageVO;
import model.Joiner_Info.Joiner_InfoVO;
import model.Member.MemberVO;
import model.StoreMember.StoreMemberVO;

public class GroupRoomVO implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int groupSerialNumber;
	private MemberVO member;
	private StoreMemberVO storeMember;
	private String storeName;
	private Date groupStartTime;
	private Date groupEndTime;
	private String groupRoomName;
	private Integer groupSuggestNumber;
	private Integer groupLowerLimit;
	private Integer groupUpperLimit;
	private Date groupGameTime;
	private Date reserveGroupStartTime;
	private Date reserveGroupEndTime;
	private Integer roomState;
	private String imgFileName;
	private byte[] privateGroupImage;
	private Set<Joiner_InfoVO> joinerInfos = new HashSet<Joiner_InfoVO>(0);
	private Set<GroupRoomInfoVO> groupRoomInfos = new HashSet<GroupRoomInfoVO>(
			0);
	private Set<GroupRoomMessageVO> groupRoomMessages = new HashSet<GroupRoomMessageVO>(
			0);
	private Set<GroupChoiceGamesVO> groupChoiceGameses = new HashSet<GroupChoiceGamesVO>(
			0);

	public GroupRoomVO() {
	}

	public GroupRoomVO(int groupSerialNumber) {
		this.groupSerialNumber = groupSerialNumber;
	}

	public GroupRoomVO(int groupSerialNumber, MemberVO member,
			StoreMemberVO storeMember, String storeName, Date groupStartTime,
			Date groupEndTime, String groupRoomName,
			Integer groupSuggestNumber, Integer groupLowerLimit,
			Integer groupUpperLimit, Date groupGameTime,
			Date reserveGroupStartTime, Date reserveGroupEndTime,
			Integer roomState, String imgFileName, byte[] privateGroupImage,
			Set<Joiner_InfoVO> joinerInfos,
			Set<GroupRoomInfoVO> groupRoomInfos,
			Set<GroupRoomMessageVO> groupRoomMessages,
			Set<GroupChoiceGamesVO> groupChoiceGameses) {
		this.groupSerialNumber = groupSerialNumber;
		this.member = member;
		this.storeMember = storeMember;
		this.storeName = storeName;
		this.groupStartTime = groupStartTime;
		this.groupEndTime = groupEndTime;
		this.groupRoomName = groupRoomName;
		this.groupSuggestNumber = groupSuggestNumber;
		this.groupLowerLimit = groupLowerLimit;
		this.groupUpperLimit = groupUpperLimit;
		this.groupGameTime = groupGameTime;
		this.reserveGroupStartTime = reserveGroupStartTime;
		this.reserveGroupEndTime = reserveGroupEndTime;
		this.roomState = roomState;
		this.imgFileName = imgFileName;
		this.privateGroupImage = privateGroupImage;
		this.joinerInfos = joinerInfos;
		this.groupRoomInfos = groupRoomInfos;
		this.groupRoomMessages = groupRoomMessages;
		this.groupChoiceGameses = groupChoiceGameses;
	}

	public String toString() {

		return "[" + groupSerialNumber + "," + storeName + "," + groupStartTime
				+ "," + groupEndTime + "," + groupRoomName + ","
				+ groupSuggestNumber + "," + groupLowerLimit + ","
				+ groupUpperLimit + "," + groupGameTime + ","
				+ reserveGroupStartTime + "," + reserveGroupEndTime + ","
				+ roomState + "," + imgFileName + "," + privateGroupImage + "]";
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

	public int getGroupSerialNumber() {
		return this.groupSerialNumber;
	}

	public void setGroupSerialNumber(int groupSerialNumber) {
		this.groupSerialNumber = groupSerialNumber;
	}

	public MemberVO getMember() {
		return this.member;
	}

	public void setMember(MemberVO member) {
		this.member = member;
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

	public Date getGroupStartTime() {
		return this.groupStartTime;
	}

	public void setGroupStartTime(Date groupStartTime) {
		this.groupStartTime = groupStartTime;
	}

	public Date getGroupEndTime() {
		return this.groupEndTime;
	}

	public void setGroupEndTime(Date groupEndTime) {
		this.groupEndTime = groupEndTime;
	}

	public String getGroupRoomName() {
		return this.groupRoomName;
	}

	public void setGroupRoomName(String groupRoomName) {
		this.groupRoomName = groupRoomName;
	}

	public Integer getGroupSuggestNumber() {
		return this.groupSuggestNumber;
	}

	public void setGroupSuggestNumber(Integer groupSuggestNumber) {
		this.groupSuggestNumber = groupSuggestNumber;
	}

	public Integer getGroupLowerLimit() {
		return this.groupLowerLimit;
	}

	public void setGroupLowerLimit(Integer groupLowerLimit) {
		this.groupLowerLimit = groupLowerLimit;
	}

	public Integer getGroupUpperLimit() {
		return this.groupUpperLimit;
	}

	public void setGroupUpperLimit(Integer groupUpperLimit) {
		this.groupUpperLimit = groupUpperLimit;
	}

	public Date getGroupGameTime() {
		return this.groupGameTime;
	}

	public void setGroupGameTime(Date groupGameTime) {
		this.groupGameTime = groupGameTime;
	}

	public Date getReserveGroupStartTime() {
		return this.reserveGroupStartTime;
	}

	public void setReserveGroupStartTime(Date reserveGroupStartTime) {
		this.reserveGroupStartTime = reserveGroupStartTime;
	}

	public Date getReserveGroupEndTime() {
		return this.reserveGroupEndTime;
	}

	public void setReserveGroupEndTime(Date reserveGroupEndTime) {
		this.reserveGroupEndTime = reserveGroupEndTime;
	}

	public Integer getRoomState() {
		return this.roomState;
	}

	public void setRoomState(Integer roomState) {
		this.roomState = roomState;
	}

	public String getImgFileName() {
		return this.imgFileName;
	}

	public void setImgFileName(String imgFileName) {
		this.imgFileName = imgFileName;
	}

	public byte[] getPrivateGroupImage() {
		return this.privateGroupImage;
	}

	public void setPrivateGroupImage(byte[] privateGroupImage) {
		this.privateGroupImage = privateGroupImage;
	}

	public Set<Joiner_InfoVO> getJoinerInfos() {
		return this.joinerInfos;
	}

	public void setJoinerInfos(Set<Joiner_InfoVO> joinerInfos) {
		this.joinerInfos = joinerInfos;
	}

	public Set<GroupRoomInfoVO> getGroupRoomInfos() {
		return this.groupRoomInfos;
	}

	public void setGroupRoomInfos(Set<GroupRoomInfoVO> groupRoomInfos) {
		this.groupRoomInfos = groupRoomInfos;
	}

	public Set<GroupRoomMessageVO> getGroupRoomMessages() {
		return this.groupRoomMessages;
	}

	public void setGroupRoomMessages(Set<GroupRoomMessageVO> groupRoomMessages) {
		this.groupRoomMessages = groupRoomMessages;
	}

	public Set<GroupChoiceGamesVO> getGroupChoiceGameses() {
		return this.groupChoiceGameses;
	}

	public void setGroupChoiceGameses(Set<GroupChoiceGamesVO> groupChoiceGameses) {
		this.groupChoiceGameses = groupChoiceGameses;
	}

}
