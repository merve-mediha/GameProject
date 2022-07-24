package business.abstracts;

import java.util.List;
import java.util.Optional;

import entity.concretes.Game;

public interface GameService {
	void add(Game game);
	void update(Game game);
	void delete(Game game);
	Optional<Game> getById(int id);
	List<Game> getAll();
}
