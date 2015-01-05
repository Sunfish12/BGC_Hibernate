package model;

import java.util.List;

public interface Member_FavoredTypeDAO_Interface {
	public abstract Member_FavoredTypeVO findByPrimeKey(String username);

	public abstract List<Member_FavoredTypeVO> getAll();

	public abstract void insert(Member_FavoredTypeVO bean);

	public abstract void update(Member_FavoredTypeVO bean);

	public abstract void delete(String username);

}
