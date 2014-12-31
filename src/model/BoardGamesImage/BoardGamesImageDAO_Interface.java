package model.BoardGamesImage;

import java.util.List;

public interface BoardGamesImageDAO_Interface {
	public abstract BoardGamesImageVO findByPrimeKey(Integer storeImageId);

	public abstract List<BoardGamesImageVO> getAll();

	public abstract void insert(BoardGamesImageVO bean);

	public abstract void update(BoardGamesImageVO bean);

	public abstract void delete(Integer storeImageId);
}
