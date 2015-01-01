package model.GroupChoiceGames;

import model.BoardGameKind.BoardGameKindVO;
import model.GroupRoom.GroupRoomVO;

public class GroupChoiceGamesVO implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int choiceGamesSerialNumber;
	private BoardGameKindVO boardGameKind;
	private GroupRoomVO groupRoom;
	private String boardGameName;

	public GroupChoiceGamesVO() {
	}

	public GroupChoiceGamesVO(int choiceGamesSerialNumber) {
		this.choiceGamesSerialNumber = choiceGamesSerialNumber;
	}

	public GroupChoiceGamesVO(int choiceGamesSerialNumber,
			BoardGameKindVO boardGameKind, GroupRoomVO groupRoom,
			String boardGameName) {
		this.choiceGamesSerialNumber = choiceGamesSerialNumber;
		this.boardGameKind = boardGameKind;
		this.groupRoom = groupRoom;
		this.boardGameName = boardGameName;
	}

	public String toString() {
		return "[" + choiceGamesSerialNumber + "," + boardGameName + "]";
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

	public int getChoiceGamesSerialNumber() {
		return this.choiceGamesSerialNumber;
	}

	public void setChoiceGamesSerialNumber(int choiceGamesSerialNumber) {
		this.choiceGamesSerialNumber = choiceGamesSerialNumber;
	}

	public BoardGameKindVO getBoardGameKind() {
		return this.boardGameKind;
	}

	public void setBoardGameKind(BoardGameKindVO boardGameKind) {
		this.boardGameKind = boardGameKind;
	}

	public GroupRoomVO getGroupRoom() {
		return this.groupRoom;
	}

	public void setGroupRoom(GroupRoomVO groupRoom) {
		this.groupRoom = groupRoom;
	}

	public String getBoardGameName() {
		return this.boardGameName;
	}

	public void setBoardGameName(String boardGameName) {
		this.boardGameName = boardGameName;
	}

}
