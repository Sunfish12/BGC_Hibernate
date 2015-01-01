package model.StoreInformationImage;

import model.StoreInformation.StoreInformationVO;

public class StoreInformationImageVO implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int storeImageId;
	private StoreInformationVO storeInformation;
	private String boardGameHelp;
	private String imgFileName;
	private byte[] areaImage;

	public StoreInformationImageVO() {
	}

	public StoreInformationImageVO(int storeImageId) {
		this.storeImageId = storeImageId;
	}

	public StoreInformationImageVO(int storeImageId,
			StoreInformationVO storeInformation, String boardGameHelp,
			String imgFileName, byte[] areaImage) {
		this.storeImageId = storeImageId;
		this.storeInformation = storeInformation;
		this.boardGameHelp = boardGameHelp;
		this.imgFileName = imgFileName;
		this.areaImage = areaImage;
	}

	public static int ConverInt(String data) {
		Integer result = 0;
		try {
			result = Integer.parseInt(data);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			result = -1000;
		}
		return result;
	}

	public int getStoreImageId() {
		return this.storeImageId;
	}

	public void setStoreImageId(int storeImageId) {
		this.storeImageId = storeImageId;
	}

	public StoreInformationVO getStoreInformation() {
		return this.storeInformation;
	}

	public void setStoreInformation(StoreInformationVO storeInformation) {
		this.storeInformation = storeInformation;
	}

	public String getBoardGameHelp() {
		return this.boardGameHelp;
	}

	public void setBoardGameHelp(String boardGameHelp) {
		this.boardGameHelp = boardGameHelp;
	}

	public String getImgFileName() {
		return this.imgFileName;
	}

	public void setImgFileName(String imgFileName) {
		this.imgFileName = imgFileName;
	}

	public byte[] getAreaImage() {
		return this.areaImage;
	}

	public void setAreaImage(byte[] areaImage) {
		this.areaImage = areaImage;
	}

}
