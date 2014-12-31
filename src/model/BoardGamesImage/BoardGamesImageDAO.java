package model.BoardGamesImage;

import java.io.InputStream;
import java.util.List;

public interface BoardGamesImageDAO {
	public abstract BoardGamesImageVO findByPrimeKey(Integer storeImageId);

	public abstract List<BoardGamesImageVO> getAll();

	public abstract BoardGamesImageVO insert(BoardGamesImageVO bean,
			InputStream is, long size, String filename);

	public abstract BoardGamesImageVO update(BoardGamesImageVO bean,
			InputStream is, long size, String filename);

	public abstract boolean delete(Integer storeImageId);
}
