package model.StoreScore;

import java.io.InputStream;
import java.util.List;

public interface StoreScoreDAO {
	public abstract StoreScoreVO select(Integer storeId);

	public abstract List<StoreScoreVO> select();

	public abstract StoreScoreVO insert(StoreScoreVO ssbean);

	public abstract StoreScoreVO update(StoreScoreVO ssbean);

	public abstract boolean delete(Integer storeId);
}
