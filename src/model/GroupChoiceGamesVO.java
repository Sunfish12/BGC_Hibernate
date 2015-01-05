package model;

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
