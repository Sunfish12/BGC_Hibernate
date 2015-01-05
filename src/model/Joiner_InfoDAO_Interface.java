package model;

import java.util.List;

public interface Joiner_InfoDAO_Interface {
	public abstract Joiner_InfoVO findByPrimeKey(String groupSerialNumber);

	public abstract List<Joiner_InfoVO> getAll();

	public abstract void insert(Joiner_InfoVO bean);

	public abstract void update(Joiner_InfoVO bean);

	public abstract void delete(Integer joiner_InfoSerialNumber);
}
