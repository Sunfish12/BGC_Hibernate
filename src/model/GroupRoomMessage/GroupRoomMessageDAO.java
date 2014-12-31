package model.GroupRoomMessage;

import java.io.InputStream;
import java.util.List;

public interface GroupRoomMessageDAO {
	public abstract GroupRoomMessageVO select(String groupSerialNumber);

	public abstract List<GroupRoomMessageVO> select();

	public abstract GroupRoomMessageVO insert(GroupRoomMessageVO bean);

	public abstract GroupRoomMessageVO update(GroupRoomMessageVO bean);

	public abstract boolean delete(Integer groupRoomMessageSerialNumber);
}
