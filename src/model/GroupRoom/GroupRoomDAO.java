package model.GroupRoom;

import java.io.InputStream;
import java.util.List;

public interface GroupRoomDAO {
	public abstract GroupRoomVO select(String groupUsername);

	public abstract List<GroupRoomVO> select();

	public abstract GroupRoomVO insert(GroupRoomVO bean, InputStream is,
			long size);

	public abstract GroupRoomVO update(GroupRoomVO bean, InputStream is,
			long size);

	public abstract boolean delete(String groupUsername);
}
