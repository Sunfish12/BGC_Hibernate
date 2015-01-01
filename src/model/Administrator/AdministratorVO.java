package model.Administrator;

public class AdministratorVO implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String adminUsername;
	private byte[] adminPswd;
	private String imgFileName;
	private byte[] adminMemberImage;

	public AdministratorVO() {
	}

	public AdministratorVO(String adminUsername) {
		this.adminUsername = adminUsername;
	}

	public AdministratorVO(String adminUsername, byte[] adminPswd,
			String imgFileName, byte[] adminMemberImage) {
		this.adminUsername = adminUsername;
		this.adminPswd = adminPswd;
		this.imgFileName = imgFileName;
		this.adminMemberImage = adminMemberImage;
	}
	
	@Override
	public String toString() {
		return "[" + adminUsername + "," + adminPswd + "," + imgFileName + ","
				+ adminMemberImage + "]";
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
