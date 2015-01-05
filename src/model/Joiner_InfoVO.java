package model;

import java.util.Date;

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
