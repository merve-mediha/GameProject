import java.rmi.RemoteException;

import business.abstracts.GameService;
import business.abstracts.PersonCheckService;
import business.abstracts.PlayerService;
import business.abstracts.SalesService;
import business.concretes.GameManager;
import business.concretes.PlayerManager;
import business.concretes.SalesManager;
import core.adapters.MernisServisAdapter;
import dataAccess.concretes.GameRepository;
import dataAccess.concretes.PlayerRepository;
import entity.concretes.Campaign;
import entity.concretes.Game;
import entity.concretes.Player;

public class Main {

	public static void main(String[] args) throws NumberFormatException, RemoteException {
		PersonCheckService personCheckService=new  MernisServisAdapter();
        PlayerService playerService=new PlayerManager(new PlayerRepository(),personCheckService);
        Player player1=new Player(1,"Mediha Merve","Demiraslan",1997,"279499888888998");

        playerService.add(player1);
        System.out.println(playerService.getAll());

        Game game=new Game(1,"pubg","mobil oyun", 100, new Campaign(1,"Yaz indirimi",0.10));

        SalesService salesService=new SalesManager(playerService);
        salesService.sell(game,player1,game.getCampaign());

        GameService gameService=new GameManager(new GameRepository());
        gameService.add(game);
        System.out.println(gameService.getAll());
	}

}
