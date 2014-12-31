package model.TabuUsernameTable;

import java.util.List;

public interface TabuUsernameTableDAO_Interface {
	public abstract TabuUsernameTableVO findByPrimeKey(String tabuId);

	public abstract List<TabuUsernameTableVO> getAll();

	public abstract void insert(TabuUsernameTableVO bean);

	public abstract void update(TabuUsernameTableVO bean);

	public abstract void delete(String tabuId);

}
