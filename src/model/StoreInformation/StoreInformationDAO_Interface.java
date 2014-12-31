package model.StoreInformation;

import java.util.List;

public interface StoreInformationDAO_Interface {
	public abstract StoreInformationVO findByPrimeKey(String storeId);

	public abstract List<StoreInformationVO> getAll();

	public abstract void insert(StoreInformationVO bean);

	public abstract void update(StoreInformationVO bean);

	public abstract void delete(String storeId);
}
