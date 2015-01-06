package model;

import java.util.List;

public interface MemberDAO_interface {
	public abstract Member findByPrimeKey(Integer memberId);

	public abstract List<Member> getAll();

	public abstract void insert(Member bean);

	public abstract void update(Member bean);

	public abstract void delete(Integer memberId);
}
