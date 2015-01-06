package model;

import java.util.List;

public interface BoardGamesDAO_Interface {
	public abstract BoardGames findByPrimeKey(Integer boardGamesId);

	public abstract List<BoardGames> getAll();

	public abstract void insert(BoardGames bean);

	public abstract void update(BoardGames bean);

	public abstract void delete(Integer boardGamesId);
}
