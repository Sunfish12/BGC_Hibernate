package model.Joiner_Info;

import java.io.InputStream;
import java.util.List;

public interface Joiner_InfoDAO {
	public abstract Joiner_InfoVO select(String groupSerialNumber);

	public abstract List<Joiner_InfoVO> select();

	public abstract Joiner_InfoVO insert(Joiner_InfoVO bean);

	public abstract Joiner_InfoVO update(Joiner_InfoVO bean);

	public abstract boolean delete(Integer joiner_InfoSerialNumber);
}
