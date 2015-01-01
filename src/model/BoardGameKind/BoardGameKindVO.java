package model.BoardGameKind;

import java.util.HashSet;
import java.util.Set;

import model.BoardGames.BoardGamesVO;
import model.GroupChoiceGames.GroupChoiceGamesVO;

public class BoardGameKindVO implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String boardGameStyle;
	private Integer boardGameNumber;
	private Set<BoardGamesVO> boardGameses = new HashSet<BoardGamesVO>(0);
	private Set<GroupChoiceGamesVO> groupChoiceGameses = new HashSet<GroupChoiceGamesVO>(
			0);

	public BoardGameKindVO() {
	}

	public BoardGameKindVO(String boardGameStyle) {
		this.boardGameStyle = boardGameStyle;
	}

	public BoardGameKindVO(String boardGameStyle, Integer boardGameNumber,
			Set<BoardGamesVO> boardGameses,
			Set<GroupChoiceGamesVO> groupChoiceGameses) {
		this.boardGameStyle = boardGameStyle;
		this.boardGameNumber = boardGameNumber;
		this.boardGameses = boardGameses;
		this.groupChoiceGameses = groupChoiceGameses;
	}

	@Override
	public String toString() {
		return "[" + boardGameNumber + "," + boardGameStyle + "]";
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

	public String getBoardGameStyle() {
		return this.boardGameStyle;
	}

	public void setBoardGameStyle(String boardGameStyle) {
		this.boardGameStyle = boardGameStyle;
	}

	public Integer getBoardGameNumber() {
		return this.boardGameNumber;
	}

	public void setBoardGameNumber(Integer boardGameNumber) {
		this.boardGameNumber = boardGameNumber;
	}

	public Set<BoardGamesVO> getBoardGameses() {
		return this.boardGameses;
	}

	public void setBoardGameses(Set<BoardGamesVO> boardGameses) {
		this.boardGameses = boardGameses;
	}

	public Set<GroupChoiceGamesVO> getGroupChoiceGameses() {
		return this.groupChoiceGameses;
	}

	public void setGroupChoiceGameses(Set<GroupChoiceGamesVO> groupChoiceGameses) {
		this.groupChoiceGameses = groupChoiceGameses;
	}

}
