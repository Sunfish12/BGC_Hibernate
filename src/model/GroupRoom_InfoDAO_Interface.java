package model;

import java.util.List;

public interface GroupRoom_InfoDAO_Interface {
	public abstract GroupRoom_InfoVO findByPrimeKey(String groupSerialNumber);

	public abstract List<GroupRoom_InfoVO> getAll();

	public abstract void insert(GroupRoom_InfoVO bean);

	public abstract void update(GroupRoom_InfoVO bean);

	public abstract void delete(Integer groupSerialNumber);
}
