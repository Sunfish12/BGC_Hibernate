package model.StoreMember;

import java.util.List;

public interface StoreMemberDAO_Interface {
	public abstract StoreMemberVO findByPrimeKey(String storeUsername);

	public abstract List<StoreMemberVO> getAll();

	public abstract void insert(StoreMemberVO bean);

	public abstract void update(StoreMemberVO bean);

	public abstract void delete(String storeUsername);
}
