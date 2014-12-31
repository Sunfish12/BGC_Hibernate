package model.StoreInformation;

import java.io.InputStream;
import java.util.List;

public interface StoreInformationDAO {
	public abstract StoreInformationVO findByPrimeKey(String storeId);

	public abstract List<StoreInformationVO> getAll();

	public abstract StoreInformationVO insert(StoreInformationVO bean,
			InputStream is, long size, String filename);

	public abstract StoreInformationVO update(StoreInformationVO bean,
			InputStream is, long size, String filename);

	public abstract boolean delete(String storeId);
}
