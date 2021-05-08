package GameBackendJava.Concrete;

import GameBackendJava.Abstract.BaseGameProducktManager;
import GameBackendJava.Entities.Campaign;
import GameBackendJava.Entities.GameProduct;
import GameBackendJava.Entities.User;

public class GameProductManager extends BaseGameProducktManager{
	
	@Override
	public void buy(User user,GameProduct game, Campaign campaign) {
		
		game.setPrice(game.getPrice()-(game.getPrice()/campaign.getDiscountRate()));
		
		super.buy(user, game, campaign);
	}
}
