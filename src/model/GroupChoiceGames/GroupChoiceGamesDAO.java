package model.GroupChoiceGames;

import java.io.InputStream;
import java.util.List;

public interface GroupChoiceGamesDAO {
	public abstract GroupChoiceGamesVO select(Integer choiceGamesSerialNumber);

	public abstract List<GroupChoiceGamesVO> select();

	public abstract GroupChoiceGamesVO insert(GroupChoiceGamesVO bean);

	public abstract GroupChoiceGamesVO update(GroupChoiceGamesVO bean);

	public abstract boolean delete(String choiceGamesSerialNumber);
}
