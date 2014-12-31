package model.Administrator;

import java.util.List;

public interface AdministratorDAO_Interface {
	public abstract AdministratorVO findByPrimeKey(String adminUsername); // select
																	// only one

	public abstract List<AdministratorVO> getAll(); // select all

	public abstract void insert(AdministratorVO bean); // insert one

	public abstract void update(AdministratorVO bean); // update one

	public abstract void delete(String adminUsername);
}
