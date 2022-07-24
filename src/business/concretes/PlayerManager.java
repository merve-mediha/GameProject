package business.concretes;

import java.rmi.RemoteException;
import java.util.List;
import java.util.Optional;

import business.abstracts.PersonCheckService;
import business.abstracts.PlayerService;
import dataAccess.abstracts.BaseRepository;
import entity.concretes.Player;

public class PlayerManager implements PlayerService {
	private final BaseRepository<Player> baseRepository;
	private PersonCheckService personCheckService;

	

	 public PlayerManager(BaseRepository<Player> baseRepository, PersonCheckService personCheckService) {
		this.baseRepository = baseRepository;
		this.personCheckService = personCheckService;
	}

	@Override
	    public void add(Player player) throws NumberFormatException, RemoteException {
	            if (personCheckService.checkIfRealPerson(player)) {
	                baseRepository.add(player);
	            }else{
	                System.out.println("Not a valid person");
	            }
	        } 

	    

	    @Override
	    public void update(Player player) throws NumberFormatException, RemoteException {
	            if (personCheckService.checkIfRealPerson(player)) {
	                baseRepository.update(player);
	            }else{
	                System.out.println("Not a valid person");
	            }
	        } 
	    

	    @Override
	    public void delete(Player player) {
	        getById(player.getId()).ifPresent(player1 -> baseRepository.delete(player));

	    }

	    @Override
	    public Optional<Player> getById(int id) {
	        return baseRepository.getById(id);
	    }

	    @Override
	    public List<Player> getAll() {
	        return baseRepository.getAll();
	    }
	
}
