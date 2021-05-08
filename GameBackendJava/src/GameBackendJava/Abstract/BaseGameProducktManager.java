package GameBackendJava.Abstract;

import GameBackendJava.Entities.Campaign;
import GameBackendJava.Entities.GameProduct;
import GameBackendJava.Entities.User;

public abstract class BaseGameProducktManager implements GameProductService{

	@Override
	public void buy(User user,GameProduct game, Campaign campaign) {
		System.out.println(user.getFirstName() + " adlý kullanýcý " + game.getProductName() + " adlý oyunu satýn aldý : "+game.getPrice()+"tl");
		
	}

}
