package dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import dataAccess.abstracts.BaseRepository;
import entity.concretes.Game;

public class GameRepository implements BaseRepository<Game> {

	List<Game> games = new ArrayList<Game>();
	
	@Override
	public void add(Game entity) {
		games.add(entity);
		System.out.println("Oyun eklendi: "+entity.getName());
		
	}

	@Override
	public void update(Game entity) {
		System.out.println("Oyun güncellendi: "+entity.getName());
		
	}

	@Override
	public void delete(Game entity) {
		 getById(entity.getId()).ifPresent(game-> games.remove(entity));
		 System.out.println("Oyun silindi: "+entity.getName());
	}

	@Override
	public Optional<Game> getById(int id) {
		return games.stream().filter(game->game.getId()==id).findAny();
	}

	@Override
	public List<Game> getAll() {
		return games;
	}

}
