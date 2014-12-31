package model.Administrator;

import java.util.List;
import java.io.InputStream;

public interface AdministratorDAO {
	public abstract AdministratorVO select(String adminUsername); // select
																	// only one

	public abstract List<AdministratorVO> select(); // select all

	public abstract AdministratorVO insert(AdministratorVO bean,
			InputStream is, long size); // insert one

	public abstract AdministratorVO update(AdministratorVO bean,
			InputStream is, long size); // update one

	public abstract boolean delete(String adminUsername);
}
