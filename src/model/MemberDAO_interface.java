package model;

import java.util.List;

public interface MemberDAO_interface {
	public abstract MemberVO findByPrimeKey(Integer memberId);

	public abstract List<MemberVO> getAll();

	public abstract void insert(MemberVO bean);

	public abstract void update(MemberVO bean);

	public abstract void delete(Integer memberId);
}
