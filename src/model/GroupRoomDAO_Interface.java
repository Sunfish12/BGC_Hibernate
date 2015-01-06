package model;

import java.util.List;

public interface GroupRoomDAO_Interface {
	public abstract GroupRoom findByPrimeKey(Integer groupSerialNumber);

	public abstract List<GroupRoom> getAll();

	public abstract void insert(GroupRoom bean);

	public abstract void update(GroupRoom bean);

	public abstract void delete(Integer groupSerialNumber);
}
