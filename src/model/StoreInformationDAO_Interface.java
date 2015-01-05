package model;

import java.util.List;

public interface StoreInformationDAO_Interface {
	public abstract StoreInformationVO findByPrimeKey(Integer storeId);

	public abstract List<StoreInformationVO> getAll();

	public abstract void insert(StoreInformationVO bean);

	public abstract void update(StoreInformationVO bean);

	public abstract void delete(Integer storeId);
}
