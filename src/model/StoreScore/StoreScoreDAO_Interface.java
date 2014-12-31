package model.StoreScore;

import java.util.List;

public interface StoreScoreDAO_Interface {
	public abstract StoreScoreVO findByPrimeKey(Integer storeId);

	public abstract List<StoreScoreVO> getAll();

	public abstract void insert(StoreScoreVO ssbean);

	public abstract void update(StoreScoreVO ssbean);

	public abstract void delete(Integer storeId);
}
