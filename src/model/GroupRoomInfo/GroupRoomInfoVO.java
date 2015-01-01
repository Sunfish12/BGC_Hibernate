package model.GroupRoomInfo;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import model.GroupRoom.GroupRoomVO;

public class GroupRoomInfoVO implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int groupPictureSerialNumber;
	private GroupRoomVO groupRoom;
	private byte[] groupPicture;
	private String imgFileName;

	public GroupRoomInfoVO() {
	}

	public GroupRoomInfoVO(int groupPictureSerialNumber) {
		this.groupPictureSerialNumber = groupPictureSerialNumber;
	}

	public GroupRoomInfoVO(int groupPictureSerialNumber, GroupRoomVO groupRoom,
			byte[] groupPicture, String imgFileName) {
		this.groupPictureSerialNumber = groupPictureSerialNumber;
		this.groupRoom = groupRoom;
		this.groupPicture = groupPicture;
		this.imgFileName = imgFileName;
	}

	public String toString() {
		return "[" + imgFileName + "," + groupPictureSerialNumber + "]";
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

	public int getGroupPictureSerialNumber() {
		return this.groupPictureSerialNumber;
	}

	public void setGroupPictureSerialNumber(int groupPictureSerialNumber) {
		this.groupPictureSerialNumber = groupPictureSerialNumber;
	}

	public GroupRoomVO getGroupRoom() {
		return this.groupRoom;
	}

	public void setGroupRoom(GroupRoomVO groupRoom) {
		this.groupRoom = groupRoom;
	}

	public byte[] getGroupPicture() {
		return this.groupPicture;
	}

	public void setGroupPicture(byte[] groupPicture) {
		this.groupPicture = groupPicture;
	}

	public String getImgFileName() {
		return this.imgFileName;
	}

	public void setImgFileName(String imgFileName) {
		this.imgFileName = imgFileName;
	}

}
