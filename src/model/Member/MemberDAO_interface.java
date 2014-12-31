package model.Member;

import java.util.List;

public interface MemberDAO_interface {
	public abstract MemberVO findByPrimeKey(String username);

	public abstract List<MemberVO> getAll();

	public abstract void insert(MemberVO bean);

	public abstract void update(MemberVO bean);

	public abstract void delete(String Username);
}
