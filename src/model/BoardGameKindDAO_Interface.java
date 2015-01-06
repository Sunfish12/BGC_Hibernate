package model;

import java.util.List;

public interface BoardGameKindDAO_Interface {
	public abstract BoardGameKind findByPrimeKey(Integer boardGameSerialNumber);

	public abstract List<BoardGameKind> getAll();

	public abstract void insert(BoardGameKind bean);

	public abstract void update(BoardGameKind bean);

	public abstract void delete(Integer boardGameSerialNumber);
}
