package model.GroupRoomInfo;

import java.io.InputStream;
import java.util.List;

public interface GroupRoomInfoDAO {
	public abstract GroupRoomInfoVO select(String groupSerialNumber);

	public abstract List<GroupRoomInfoVO> select();

	public abstract GroupRoomInfoVO insert(GroupRoomInfoVO bean,
			InputStream is, long size);

	public abstract GroupRoomInfoVO update(GroupRoomInfoVO bean,
			InputStream is, long size);

	public abstract boolean delete(Integer groupSerialNumber);
}
