package model.RentalTime;

import java.io.InputStream;
import java.util.List;

public interface RentalTimeDAO {
	public abstract RentalTimeVO select(Integer storeId);

	public abstract List<RentalTimeVO> select();

	public abstract RentalTimeVO insert(RentalTimeVO rtbean);

	public abstract RentalTimeVO update(RentalTimeVO rtbean);

	public abstract boolean delete(Integer storeId);
}
