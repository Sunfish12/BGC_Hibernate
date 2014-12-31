package model.StoreInformationImage;

import java.io.InputStream;
import java.util.List;

public interface StoreInformationImageDAO {
	public abstract StoreInformationImageVO select(Integer storeImageId);

	public abstract List<StoreInformationImageVO> select();

	public abstract StoreInformationImageVO update(
			StoreInformationImageVO sibean, InputStream is, long size,
			String filename);

	public abstract StoreInformationImageVO insert(
			StoreInformationImageVO sibean, InputStream is, long size,
			String filename);

	public abstract boolean delete(Integer storeImageId);
}
