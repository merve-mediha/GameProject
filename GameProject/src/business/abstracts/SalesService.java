package business.abstracts;

import entity.concretes.Campaign;
import entity.concretes.Game;
import entity.concretes.Player;

public interface SalesService {
	void sell(Game game, Player player, Campaign campaign);
}
