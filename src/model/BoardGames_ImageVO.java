package model;

public class BoardGames_ImageVO implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int storeImageId;
	private BoardGamesVO boardGames;
	private String imgFileName;
	private byte[] boardGameImages;

	public BoardGames_ImageVO() {
	}

	public BoardGames_ImageVO(int storeImageId) {
		this.storeImageId = storeImageId;
	}

	public BoardGames_ImageVO(int storeImageId, BoardGamesVO boardGames,
			String imgFileName, byte[] boardGameImages) {
		this.storeImageId = storeImageId;
		this.boardGames = boardGames;
		this.imgFileName = imgFileName;
		this.boardGameImages = boardGameImages;
	}

	public int getStoreImageId() {
		return this.storeImageId;
	}

	public void setStoreImageId(int storeImageId) {
		this.storeImageId = storeImageId;
	}

	public BoardGamesVO getBoardGames() {
		return this.boardGames;
	}

	public void setBoardGames(BoardGamesVO boardGames) {
		this.boardGames = boardGames;
	}

	public String getImgFileName() {
		return this.imgFileName;
	}

	public void setImgFileName(String imgFileName) {
		this.imgFileName = imgFileName;
	}

	public byte[] getBoardGameImages() {
		return this.boardGameImages;
	}

	public void setBoardGameImages(byte[] boardGameImages) {
		this.boardGameImages = boardGameImages;
	}

}
