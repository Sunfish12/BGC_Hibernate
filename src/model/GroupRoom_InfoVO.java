package model;

public class GroupRoom_InfoVO implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int groupPictureSerialNumber;
	private GroupRoomVO groupRoom;
	private byte[] groupPicture;
	private String imgFileName;

	public GroupRoom_InfoVO() {
	}

	public GroupRoom_InfoVO(int groupPictureSerialNumber) {
		this.groupPictureSerialNumber = groupPictureSerialNumber;
	}

	public GroupRoom_InfoVO(int groupPictureSerialNumber, GroupRoomVO groupRoom,
			byte[] groupPicture, String imgFileName) {
		this.groupPictureSerialNumber = groupPictureSerialNumber;
		this.groupRoom = groupRoom;
		this.groupPicture = groupPicture;
		this.imgFileName = imgFileName;
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
