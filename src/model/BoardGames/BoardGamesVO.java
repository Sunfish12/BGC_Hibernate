package model.BoardGames;

import java.util.HashSet;
import java.util.Set;

import model.BoardGameKind.BoardGameKindVO;
import model.BoardGamesImage.BoardGamesImageVO;
import model.StoreMember.StoreMemberVO;

public class BoardGamesVO implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int boardGamesId;
	private BoardGameKindVO boardGameKind;
	private StoreMemberVO storeMember;
	private String storeName;
	private String boardGameName;
	private String boardGameNumber;
	private String imgFileName;
	private byte[] boardGameImage;
	private String boardGameExplan;
	private Set<BoardGamesImageVO> boardGamesImages = new HashSet<BoardGamesImageVO>(
			0);

	public BoardGamesVO() {
	}

	public BoardGamesVO(int boardGamesId) {
		this.boardGamesId = boardGamesId;
	}

	public BoardGamesVO(int boardGamesId, BoardGameKindVO boardGameKind,
			StoreMemberVO storeMember, String storeName, String boardGameName,
			String boardGameNumber, String imgFileName, byte[] boardGameImage,
			String boardGameExplan, Set<BoardGamesImageVO> boardGamesImages) {
		this.boardGamesId = boardGamesId;
		this.boardGameKind = boardGameKind;
		this.storeMember = storeMember;
		this.storeName = storeName;
		this.boardGameName = boardGameName;
		this.boardGameNumber = boardGameNumber;
		this.imgFileName = imgFileName;
		this.boardGameImage = boardGameImage;
		this.boardGameExplan = boardGameExplan;
		this.boardGamesImages = boardGamesImages;
	}

	@Override
	public String toString() {
		return "[" + boardGamesId + "," + storeName + "," + boardGameName + ","
				+ boardGameNumber + "," + imgFileName + "," + boardGameExplan
				+ "]";
	}

	public int getBoardGamesId() {
		return this.boardGamesId;
	}

	public void setBoardGamesId(int boardGamesId) {
		this.boardGamesId = boardGamesId;
	}

	public BoardGameKindVO getBoardGameKind() {
		return this.boardGameKind;
	}

	public void setBoardGameKind(BoardGameKindVO boardGameKind) {
		this.boardGameKind = boardGameKind;
	}

	public StoreMemberVO getStoreMember() {
		return this.storeMember;
	}

	public void setStoreMember(StoreMemberVO storeMember) {
		this.storeMember = storeMember;
	}

	public String getStoreName() {
		return this.storeName;
	}

	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}

	public String getBoardGameName() {
		return this.boardGameName;
	}

	public void setBoardGameName(String boardGameName) {
		this.boardGameName = boardGameName;
	}

	public String getBoardGameNumber() {
		return this.boardGameNumber;
	}

	public void setBoardGameNumber(String boardGameNumber) {
		this.boardGameNumber = boardGameNumber;
	}

	public String getImgFileName() {
		return this.imgFileName;
	}

	public void setImgFileName(String imgFileName) {
		this.imgFileName = imgFileName;
	}

	public byte[] getBoardGameImage() {
		return this.boardGameImage;
	}

	public void setBoardGameImage(byte[] boardGameImage) {
		this.boardGameImage = boardGameImage;
	}

	public String getBoardGameExplan() {
		return this.boardGameExplan;
	}

	public void setBoardGameExplan(String boardGameExplan) {
		this.boardGameExplan = boardGameExplan;
	}

	public Set<BoardGamesImageVO> getBoardGamesImages() {
		return this.boardGamesImages;
	}

	public void setBoardGamesImages(Set<BoardGamesImageVO> boardGamesImages) {
		this.boardGamesImages = boardGamesImages;
	}

}
