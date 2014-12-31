package model.StoreInformationImage;

import java.util.List;

public interface StoreInformationImageDAO_Interface {
	public abstract StoreInformationImageVO findByPrimeKey(Integer storeImageId);

	public abstract List<StoreInformationImageVO> getAll();

	public abstract void update(
			StoreInformationImageVO sibean);

	public abstract void insert(
			StoreInformationImageVO sibean);

	public abstract void delete(Integer storeImageId);
}
