package model.GroupRoom;

import java.util.List;

public interface GroupRoomDAO_Interface {
	public abstract GroupRoomVO findByPrimeKey(String groupUsername);

	public abstract List<GroupRoomVO> getAll();

	public abstract void insert(GroupRoomVO bean);

	public abstract void update(GroupRoomVO bean);

	public abstract void delete(String groupUsername);
}
