package model.MemberFavoredType;

import java.util.List;

public interface MemberFavoredTypeDAO_Interface {
	public abstract MemberFavoredTypeVO findByPrimeKey(String username);

	public abstract List<MemberFavoredTypeVO> getAll();

	public abstract void insert(MemberFavoredTypeVO bean);

	public abstract void update(MemberFavoredTypeVO bean);

	public abstract void delete(String username);

}
