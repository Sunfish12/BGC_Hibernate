package model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class GroupRoomVO implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int groupSerialNumber;
	private StoreMemberVO storeMember;
	private MemberVO member;
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
	private Set<GroupRoom_InfoVO> groupRoomInfos = new HashSet<GroupRoom_InfoVO>(0);
	private Set<GroupRoom_MessageVO> groupRoomMessages = new HashSet<GroupRoom_MessageVO>(
			0);
	private Set<GroupChoiceGamesVO> groupChoiceGameses = new HashSet<GroupChoiceGamesVO>(
			0);

	public GroupRoomVO() {
	}

	public GroupRoomVO(int groupSerialNumber) {
		this.groupSerialNumber = groupSerialNumber;
	}

	public GroupRoomVO(int groupSerialNumber, StoreMemberVO storeMember,
			MemberVO member, String storeName, Date groupStartTime,
			Date groupEndTime, String groupRoomName,
			Integer groupSuggestNumber, Integer groupLowerLimit,
			Integer groupUpperLimit, Date groupGameTime,
			Date reserveGroupStartTime, Date reserveGroupEndTime,
			Integer roomState, String imgFileName, byte[] privateGroupImage,
			Set<Joiner_InfoVO> joinerInfos, Set<GroupRoom_InfoVO> groupRoomInfos,
			Set<GroupRoom_MessageVO> groupRoomMessages,
			Set<GroupChoiceGamesVO> groupChoiceGameses) {
		this.groupSerialNumber = groupSerialNumber;
		this.storeMember = storeMember;
		this.member = member;
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

	public int getGroupSerialNumber() {
		return this.groupSerialNumber;
	}

	public void setGroupSerialNumber(int groupSerialNumber) {
		this.groupSerialNumber = groupSerialNumber;
	}

	public StoreMemberVO getStoreMember() {
		return this.storeMember;
	}

	public void setStoreMember(StoreMemberVO storeMember) {
		this.storeMember = storeMember;
	}

	public MemberVO getMember() {
		return this.member;
	}

	public void setMember(MemberVO member) {
		this.member = member;
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

	public Set<GroupRoom_InfoVO> getGroupRoomInfos() {
		return this.groupRoomInfos;
	}

	public void setGroupRoomInfos(Set<GroupRoom_InfoVO> groupRoomInfos) {
		this.groupRoomInfos = groupRoomInfos;
	}

	public Set<GroupRoom_MessageVO> getGroupRoomMessages() {
		return this.groupRoomMessages;
	}

	public void setGroupRoomMessages(Set<GroupRoom_MessageVO> groupRoomMessages) {
		this.groupRoomMessages = groupRoomMessages;
	}

	public Set<GroupChoiceGamesVO> getGroupChoiceGameses() {
		return this.groupChoiceGameses;
	}

	public void setGroupChoiceGameses(Set<GroupChoiceGamesVO> groupChoiceGameses) {
		this.groupChoiceGameses = groupChoiceGameses;
	}

}
