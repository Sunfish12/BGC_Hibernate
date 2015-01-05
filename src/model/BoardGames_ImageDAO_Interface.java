package model;

import java.util.List;

public interface BoardGames_ImageDAO_Interface {
	public abstract BoardGames_ImageVO findByPrimeKey(Integer storeImageId);

	public abstract List<BoardGames_ImageVO> getAll();

	public abstract void insert(BoardGames_ImageVO bean);

	public abstract void update(BoardGames_ImageVO bean);

	public abstract void delete(Integer storeImageId);
}
