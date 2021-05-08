package GameBackendJava.Abstract;

import GameBackendJava.Entities.Campaign;
import GameBackendJava.Entities.GameProduct;
import GameBackendJava.Entities.User;

public abstract class BaseGameProducktManager implements GameProductService{

	@Override
	public void buy(User user,GameProduct game, Campaign campaign) {
		System.out.println(user.getFirstName() + " adl� kullan�c� " + game.getProductName() + " adl� oyunu sat�n ald� : "+game.getPrice()+"tl");
		
	}

}
