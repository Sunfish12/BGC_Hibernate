package model.GroupRoomMessage;

import java.util.List;

public interface GroupRoomMessageDAO_Interface {
	public abstract GroupRoomMessageVO findByPrimeKey(String groupSerialNumber);

	public abstract List<GroupRoomMessageVO> getAll();

	public abstract void insert(GroupRoomMessageVO bean);

	public abstract void update(GroupRoomMessageVO bean);

	public abstract void delete(Integer groupRoomMessageSerialNumber);
}
