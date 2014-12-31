package model.GroupChoiceGames;

import java.util.List;

public interface GroupChoiceGamesDAO_Interface {
	public abstract GroupChoiceGamesVO findByPrimeKey(Integer choiceGamesSerialNumber);

	public abstract List<GroupChoiceGamesVO> getAll();

	public abstract void insert(GroupChoiceGamesVO bean);

	public abstract void update(GroupChoiceGamesVO bean);

	public abstract void delete(String choiceGamesSerialNumber);
}
