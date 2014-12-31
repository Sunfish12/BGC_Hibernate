package model.StoreMember;

import java.io.InputStream;
import java.util.List;

public interface StoreMemberDAO {
	public abstract StoreMemberVO findByPrimeKey(String storeUsername);

	public abstract List<StoreMemberVO> getAll();

	public abstract StoreMemberVO insert(StoreMemberVO bean,
			InputStream is, long size, String filename);

	public abstract StoreMemberVO update(StoreMemberVO bean,
			InputStream is, long size, String filename);

	public abstract boolean delete(String storeUsername);
}
