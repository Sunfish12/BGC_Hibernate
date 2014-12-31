package model.BoardGameKind;

import java.util.List;

public interface BoardGameKindDAO_Interface {
	public abstract BoardGameKindVO findByPrimeKey(String boardGameStyle);

	public abstract List<BoardGameKindVO> getAll();

	public abstract void insert(BoardGameKindVO bean);

	public abstract void update(BoardGameKindVO bean);

	public abstract void delete(String boardGameStyle);
}
