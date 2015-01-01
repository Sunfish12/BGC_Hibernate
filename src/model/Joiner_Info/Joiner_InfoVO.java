package model.Joiner_Info;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import model.GroupRoom.GroupRoomVO;

public class Joiner_InfoVO implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int joinerInfoSerialNumber;
	private GroupRoomVO groupRoom;
	private Date joinTime;
	private String username;

	public Joiner_InfoVO() {
	}

	public Joiner_InfoVO(int joinerInfoSerialNumber) {
		this.joinerInfoSerialNumber = joinerInfoSerialNumber;
	}

	public Joiner_InfoVO(int joinerInfoSerialNumber, GroupRoomVO groupRoom,
			Date joinTime, String username) {
		this.joinerInfoSerialNumber = joinerInfoSerialNumber;
		this.groupRoom = groupRoom;
		this.joinTime = joinTime;
		this.username = username;
	}

	public String toString() {
		return "[" + joinTime + ":" + username + "]";
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

	public int getJoinerInfoSerialNumber() {
		return this.joinerInfoSerialNumber;
	}

	public void setJoinerInfoSerialNumber(int joinerInfoSerialNumber) {
		this.joinerInfoSerialNumber = joinerInfoSerialNumber;
	}

	public GroupRoomVO getGroupRoom() {
		return this.groupRoom;
	}

	public void setGroupRoom(GroupRoomVO groupRoom) {
		this.groupRoom = groupRoom;
	}

	public Date getJoinTime() {
		return this.joinTime;
	}

	public void setJoinTime(Date joinTime) {
		this.joinTime = joinTime;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

}
