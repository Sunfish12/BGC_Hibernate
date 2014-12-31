package model.GroupRoomInfo;

import java.util.List;

public interface GroupRoomInfoDAO_Interface {
	public abstract GroupRoomInfoVO findByPrimeKey(String groupSerialNumber);

	public abstract List<GroupRoomInfoVO> getAll();

	public abstract void insert(GroupRoomInfoVO bean);

	public abstract void update(GroupRoomInfoVO bean);

	public abstract void delete(Integer groupSerialNumber);
}
