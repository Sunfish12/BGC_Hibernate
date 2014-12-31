package model.TabuUsernameTable;

import java.io.InputStream;
import java.util.List;

public interface TabuUsernameTableDAO {
	public abstract TabuUsernameTableVO select(String tabuId);

	public abstract List<TabuUsernameTableVO> select();

	public abstract TabuUsernameTableVO insert(TabuUsernameTableVO bean);

	public abstract TabuUsernameTableVO update(TabuUsernameTableVO bean);

	public abstract boolean delete(String tabuId);

}
