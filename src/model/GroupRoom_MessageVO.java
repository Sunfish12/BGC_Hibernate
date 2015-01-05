package model;

import java.util.Date;

public class GroupRoom_MessageVO implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int groupRoomMessageSerialNumber;
	private GroupRoomVO groupRoom;
	private String messageUsername;
	private String messageContents;
	private Date messageTime;

	public GroupRoom_MessageVO() {
	}

	public GroupRoom_MessageVO(int groupRoomMessageSerialNumber) {
		this.groupRoomMessageSerialNumber = groupRoomMessageSerialNumber;
	}

	public GroupRoom_MessageVO(int groupRoomMessageSerialNumber,
			GroupRoomVO groupRoom, String messageUsername,
			String messageContents, Date messageTime) {
		this.groupRoomMessageSerialNumber = groupRoomMessageSerialNumber;
		this.groupRoom = groupRoom;
		this.messageUsername = messageUsername;
		this.messageContents = messageContents;
		this.messageTime = messageTime;
	}

	public int getGroupRoomMessageSerialNumber() {
		return this.groupRoomMessageSerialNumber;
	}

	public void setGroupRoomMessageSerialNumber(int groupRoomMessageSerialNumber) {
		this.groupRoomMessageSerialNumber = groupRoomMessageSerialNumber;
	}

	public GroupRoomVO getGroupRoom() {
		return this.groupRoom;
	}

	public void setGroupRoom(GroupRoomVO groupRoom) {
		this.groupRoom = groupRoom;
	}

	public String getMessageUsername() {
		return this.messageUsername;
	}

	public void setMessageUsername(String messageUsername) {
		this.messageUsername = messageUsername;
	}

	public String getMessageContents() {
		return this.messageContents;
	}

	public void setMessageContents(String messageContents) {
		this.messageContents = messageContents;
	}

	public Date getMessageTime() {
		return this.messageTime;
	}

	public void setMessageTime(Date messageTime) {
		this.messageTime = messageTime;
	}

}
