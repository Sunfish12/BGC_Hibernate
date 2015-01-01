package model.BoardGamesImage;

import model.BoardGames.BoardGamesVO;

public class BoardGamesImageVO implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int storeImageId;
	private BoardGamesVO boardGames;
	private String imgFileName;
	private byte[] boardGameImages;

	public BoardGamesImageVO() {
	}

	public BoardGamesImageVO(int storeImageId) {
		this.storeImageId = storeImageId;
	}

	public BoardGamesImageVO(int storeImageId, BoardGamesVO boardGames,
			String imgFileName, byte[] boardGameImages) {
		this.storeImageId = storeImageId;
		this.boardGames = boardGames;
		this.imgFileName = imgFileName;
		this.boardGameImages = boardGameImages;
	}

	@Override
	public String toString() {
		return "[" + storeImageId + "," + imgFileName + "]";
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
