package GameBackendJava;


import java.time.LocalDate;

import GameBackendJava.Abstract.BaseCampaignManager;
import GameBackendJava.Abstract.BaseGameProducktManager;
import GameBackendJava.Abstract.BaseUserManager;
import GameBackendJava.Adapters.EDevletCheckManager;
import GameBackendJava.Concrete.CampaignManager;
import GameBackendJava.Concrete.GameProductManager;
import GameBackendJava.Concrete.UserManager;
import GameBackendJava.Entities.Campaign;
import GameBackendJava.Entities.GameProduct;
import GameBackendJava.Entities.User;

public class Main {

	public static void main(String[] args) {
		BaseUserManager baseUserManager = new UserManager(new EDevletCheckManager());
		BaseGameProducktManager baseGameProductManager = new GameProductManager();
		BaseCampaignManager baseCampaignManager = new CampaignManager();
		
		User user1 = new User(1, "Ömer", "Barutçu", "1231321321",LocalDate.of(1984, 4, 21));
		GameProduct game1 = new GameProduct(1, "DevArchitect", 580);
		Campaign campaign1 = new Campaign(1,"Bahar Ýndirimi", "%10 indirim", 10);
		
		baseUserManager.Add(user1);
		baseCampaignManager.Add(campaign1);
		baseGameProductManager.buy(user1, game1,campaign1);

	}

}
