package model;

import java.util.List;

public interface GroupRoomDAO_Interface {
	public abstract GroupRoomVO findByPrimeKey(Integer groupSerialNumber);

	public abstract List<GroupRoomVO> getAll();

	public abstract void insert(GroupRoomVO bean);

	public abstract void update(GroupRoomVO bean);

	public abstract void delete(Integer groupSerialNumber);
}
