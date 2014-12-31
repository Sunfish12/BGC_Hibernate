package model.BoardGames;

import java.io.InputStream;
import java.util.List;

public interface BoardGamesDAO {
	public abstract BoardGamesVO findByPrimeKey(Integer boardGamesId);

	public abstract List<BoardGamesVO> getAll();

	public abstract BoardGamesVO insert(BoardGamesVO bean, InputStream is,
			long size, String filename);

	public abstract BoardGamesVO update(BoardGamesVO bean, InputStream is,
			long size, String filename);

	public abstract boolean delete(Integer boardGamesId);
}
