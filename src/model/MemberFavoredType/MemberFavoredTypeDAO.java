package model.MemberFavoredType;

import java.io.InputStream;
import java.util.List;

public interface MemberFavoredTypeDAO {
	public abstract MemberFavoredTypeVO select(String username);

	public abstract List<MemberFavoredTypeVO> select();

	public abstract MemberFavoredTypeVO insert(MemberFavoredTypeVO bean);

	public abstract MemberFavoredTypeVO update(MemberFavoredTypeVO bean);

	public abstract boolean delete(String username);

}
