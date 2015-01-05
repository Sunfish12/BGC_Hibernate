package model;

import java.util.HashSet;
import java.util.Set;

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
