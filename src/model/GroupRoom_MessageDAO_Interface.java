package model;

import java.util.List;

public interface GroupRoom_MessageDAO_Interface {
	public abstract GroupRoom_MessageVO findByPrimeKey(Integer groupRoomMessageSerialNumber);

	public abstract List<GroupRoom_MessageVO> getAll();

	public abstract void insert(GroupRoom_MessageVO bean);

	public abstract void update(GroupRoom_MessageVO bean);

	public abstract void delete(Integer groupRoomMessageSerialNumber);
}
