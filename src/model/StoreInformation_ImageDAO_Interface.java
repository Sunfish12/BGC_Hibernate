package model;

import java.util.List;

public interface StoreInformation_ImageDAO_Interface {
	public abstract StoreInformation_ImageVO findByPrimeKey(Integer storeImageId);

	public abstract List<StoreInformation_ImageVO> getAll();

	public abstract void update(StoreInformation_ImageVO sibean);

	public abstract void insert(StoreInformation_ImageVO sibean);

	public abstract void delete(Integer storeImageId);
}
