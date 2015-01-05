package model;

import java.util.List;

public interface StoreMemberDAO_Interface {
	public abstract StoreMemberVO findByPrimeKey(Integer storeMemberId);

	public abstract List<StoreMemberVO> getAll();

	public abstract void insert(StoreMemberVO bean);

	public abstract void update(StoreMemberVO bean);

	public abstract void delete(Integer storeMemberId);
}
