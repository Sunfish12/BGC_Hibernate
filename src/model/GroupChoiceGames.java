package model;

// Generated 2015/1/6 �U�� 07:36:07 by Hibernate Tools 3.4.0.CR1

/**
 * GroupChoiceGames generated by hbm2java
 */
public class GroupChoiceGames implements java.io.Serializable {

	private int choiceGamesSerialNumber;
	private GroupRoom groupRoom;
	private BoardGameKind boardGameKind;
	private String boardGameName;

	public GroupChoiceGames() {
	}

	public GroupChoiceGames(int choiceGamesSerialNumber) {
		this.choiceGamesSerialNumber = choiceGamesSerialNumber;
	}

	public GroupChoiceGames(int choiceGamesSerialNumber, GroupRoom groupRoom,
			BoardGameKind boardGameKind, String boardGameName) {
		this.choiceGamesSerialNumber = choiceGamesSerialNumber;
		this.groupRoom = groupRoom;
		this.boardGameKind = boardGameKind;
		this.boardGameName = boardGameName;
	}

	public int getChoiceGamesSerialNumber() {
		return this.choiceGamesSerialNumber;
	}

	public void setChoiceGamesSerialNumber(int choiceGamesSerialNumber) {
		this.choiceGamesSerialNumber = choiceGamesSerialNumber;
	}

	public GroupRoom getGroupRoom() {
		return this.groupRoom;
	}

	public void setGroupRoom(GroupRoom groupRoom) {
		this.groupRoom = groupRoom;
	}

	public BoardGameKind getBoardGameKind() {
		return this.boardGameKind;
	}

	public void setBoardGameKind(BoardGameKind boardGameKind) {
		this.boardGameKind = boardGameKind;
	}

	public String getBoardGameName() {
		return this.boardGameName;
	}

	public void setBoardGameName(String boardGameName) {
		this.boardGameName = boardGameName;
	}

}