package model.StoreScore;

import model.StoreInformation.StoreInformationVO;

public class StoreScoreVO implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int storeId;
	private StoreInformationVO storeInformation;
	private String username;
	private Double storeScore;
	private String storeScoreReason;

	public StoreScoreVO() {
	}

	public StoreScoreVO(StoreInformationVO storeInformation) {
		this.storeInformation = storeInformation;
	}

	public StoreScoreVO(StoreInformationVO storeInformation, String username,
			Double storeScore, String storeScoreReason) {
		this.storeInformation = storeInformation;
		this.username = username;
		this.storeScore = storeScore;
		this.storeScoreReason = storeScoreReason;
	}

	@Override
	public String toString() {
		return "[" + storeId + "," + username + "," + storeScore + ","
				+ storeScoreReason + "]";
	}

	public static double ConvertDouble(String data) {
		double result = 0;
		try {
			result = Double.parseDouble(data);
		} catch (NumberFormatException e) {
			e.printStackTrace();
			result = -1000;
		}
		return result;
	}

	public static int ConvertInt(String data) {
		int result = 0;
		try {
			result = Integer.parseInt(data);
		} catch (NumberFormatException e) {
			result = -1000;
			e.printStackTrace();
		}
		return result;
	}

	public int getStoreId() {
		return this.storeId;
	}

	public void setStoreId(int storeId) {
		this.storeId = storeId;
	}

	public StoreInformationVO getStoreInformation() {
		return this.storeInformation;
	}

	public void setStoreInformation(StoreInformationVO storeInformation) {
		this.storeInformation = storeInformation;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Double getStoreScore() {
		return this.storeScore;
	}

	public void setStoreScore(Double storeScore) {
		this.storeScore = storeScore;
	}

	public String getStoreScoreReason() {
		return this.storeScoreReason;
	}

	public void setStoreScoreReason(String storeScoreReason) {
		this.storeScoreReason = storeScoreReason;
	}

}
