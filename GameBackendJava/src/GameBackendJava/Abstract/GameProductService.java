package GameBackendJava.Abstract;

import GameBackendJava.Entities.Campaign;
import GameBackendJava.Entities.GameProduct;
import GameBackendJava.Entities.User;

public interface GameProductService {

	void buy(User user,GameProduct game,Campaign campaign);
}
