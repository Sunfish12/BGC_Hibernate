package model.BoardGames;

import java.util.List;

public interface BoardGamesDAO_Interface {
	public abstract BoardGamesVO findByPrimeKey(Integer boardGamesId);

	public abstract List<BoardGamesVO> getAll();

	public abstract void insert(BoardGamesVO bean);

	public abstract void update(BoardGamesVO bean);

	public abstract void delete(Integer boardGamesId);
}
