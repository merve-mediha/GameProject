package business.concretes;

import java.util.List;
import java.util.Optional;

import business.abstracts.GameService;
import dataAccess.abstracts.BaseRepository;
import entity.concretes.Game;

public class GameManager implements GameService{
	private final BaseRepository<Game> baseRepository;
	
	

	public GameManager(BaseRepository<Game> baseRepository) {
		this.baseRepository = baseRepository;
	}

	@Override
	public void add(Game game) {
		baseRepository.add(game);
		
	}

	@Override
	public void update(Game game) {
		baseRepository.update(game);
		
	}

	@Override
	public void delete(Game game) {
		getById(game.getId()).ifPresent(game1->baseRepository.delete(game));
		
	}

	@Override
	public Optional<Game> getById(int id) {
		return baseRepository.getById(id);
	}

	@Override
	public List<Game> getAll() {
		return baseRepository.getAll();
	}

}
