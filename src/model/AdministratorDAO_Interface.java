package model;

import java.util.List;

public interface AdministratorDAO_Interface {
	public abstract AdministratorVO findByPrimeKey(Integer administratorId);

	public abstract List<AdministratorVO> getAll();

	public abstract void insert(AdministratorVO bean);

	public abstract void update(AdministratorVO bean);

	public abstract void delete(Integer administratorId);
}
