package business.abstracts;

import java.rmi.RemoteException;
import java.util.List;
import java.util.Optional;

import entity.concretes.Player;

public interface PlayerService {
	void add(Player player) throws NumberFormatException, RemoteException;
	void update(Player player) throws NumberFormatException, RemoteException;
	void delete(Player player);
	Optional<Player> getById(int id);
	List<Player> getAll();
}
