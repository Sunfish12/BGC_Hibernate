package model;

public class AdministratorVO implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int administratorId;
	private String adminUsername;
	private byte[] adminPswd;
	private String imgFileName;
	private byte[] adminMemberImage;

	public AdministratorVO() {
	}

	public AdministratorVO(int administratorId) {
		this.administratorId = administratorId;
	}

	public AdministratorVO(int administratorId, String adminUsername,
			byte[] adminPswd, String imgFileName, byte[] adminMemberImage) {
		this.administratorId = administratorId;
		this.adminUsername = adminUsername;
		this.adminPswd = adminPswd;
		this.imgFileName = imgFileName;
		this.adminMemberImage = adminMemberImage;
	}

	public int getAdministratorId() {
		return this.administratorId;
	}

	public void setAdministratorId(int administratorId) {
		this.administratorId = administratorId;
	}

	public String getAdminUsername() {
		return this.adminUsername;
	}

	public void setAdminUsername(String adminUsername) {
		this.adminUsername = adminUsername;
	}

	public byte[] getAdminPswd() {
		return this.adminPswd;
	}

	public void setAdminPswd(byte[] adminPswd) {
		this.adminPswd = adminPswd;
	}

	public String getImgFileName() {
		return this.imgFileName;
	}

	public void setImgFileName(String imgFileName) {
		this.imgFileName = imgFileName;
	}

	public byte[] getAdminMemberImage() {
		return this.adminMemberImage;
	}

	public void setAdminMemberImage(byte[] adminMemberImage) {
		this.adminMemberImage = adminMemberImage;
	}

}
