package business.concretes;

import business.abstracts.PlayerService;
import business.abstracts.SalesService;
import entity.concretes.Campaign;
import entity.concretes.Game;
import entity.concretes.Player;

public class SalesManager implements SalesService{
	PlayerService playerService;
	
	

	public SalesManager(PlayerService playerService) {
		this.playerService = playerService;
	}



	@Override
	public void sell(Game game, Player player, Campaign campaign) {
		double lastPrice = game.getPrice()-(game.getPrice()*campaign.getDiscountRate());
		if(playerService.getById(player.getId()).isPresent()) {
			System.out.println("Satýþ detayý : "+player.getFirstName()+" "+player.getLastName()
			+"\n"+game.getName()+" oyununu satýn aldý \n"+"fiyat: "+game.getPrice()+" TL\n"+campaign.getName()+" kampanyasý"+"\t indirim oraný: "+campaign.getDiscountRate()+"\n son fiyat : "+lastPrice);
		}
	}
	
}
