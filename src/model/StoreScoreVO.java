package model;

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
