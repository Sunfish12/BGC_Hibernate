package model.BoardGameKind;

import java.io.InputStream;
import java.util.List;

public interface BoardGameKindDAO {
	public abstract BoardGameKindVO findByPrimeKey(String boardGameStyle);

	public abstract List<BoardGameKindVO> getAll();

	public abstract BoardGameKindVO insert(BoardGameKindVO bean);

	public abstract BoardGameKindVO update(BoardGameKindVO bean);

	public abstract boolean delete(String boardGameStyle);
}
