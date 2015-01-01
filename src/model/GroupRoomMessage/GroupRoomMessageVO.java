package model.GroupRoomMessage;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import model.GroupRoom.GroupRoomVO;

public class GroupRoomMessageVO implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int groupRoomMessageSerialNumber;
	private GroupRoomVO groupRoom;
	private String messageUsername;
	private String messageContents;
	private Date messageTime;

	public GroupRoomMessageVO() {
	}

	public GroupRoomMessageVO(int groupRoomMessageSerialNumber) {
		this.groupRoomMessageSerialNumber = groupRoomMessageSerialNumber;
	}

	public GroupRoomMessageVO(int groupRoomMessageSerialNumber,
			GroupRoomVO groupRoom, String messageUsername,
			String messageContents, Date messageTime) {
		this.groupRoomMessageSerialNumber = groupRoomMessageSerialNumber;
		this.groupRoom = groupRoom;
		this.messageUsername = messageUsername;
		this.messageContents = messageContents;
		this.messageTime = messageTime;
	}

	public String toString() {
		return "[" + groupRoomMessageSerialNumber + "," + messageUsername + ","
				+ messageContents + "," + messageTime + "]";
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
