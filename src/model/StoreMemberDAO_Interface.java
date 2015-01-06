package model;

import java.util.List;

public interface StoreMemberDAO_Interface {
	public abstract StoreMember findByPrimeKey(Integer storeMemberId);

	public abstract List<StoreMember> getAll();

	public abstract void insert(StoreMember bean);

	public abstract void update(StoreMember bean);

	public abstract void delete(Integer storeMemberId);
}
