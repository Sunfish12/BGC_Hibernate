package model.RentalTime;

import java.util.List;

public interface RentalTimeDAO_Interface {
	public abstract RentalTimeVO findByPrimeKey(Integer storeId);

	public abstract List<RentalTimeVO> getAll();

	public abstract void insert(RentalTimeVO rtbean);

	public abstract void update(RentalTimeVO rtbean);

	public abstract void delete(Integer storeId);
}
