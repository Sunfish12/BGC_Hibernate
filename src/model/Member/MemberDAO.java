package model.Member;

import java.io.InputStream;
import java.util.List;

public interface MemberDAO {
	public abstract MemberVO findByPrimeKey(String username);

	public abstract List<MemberVO> getAll();

	public abstract MemberVO insert(MemberVO bean, InputStream is, long size, String filename);

	public abstract MemberVO update(MemberVO bean, InputStream is, long size, String filename);

	public abstract boolean delete(String Username);
}
