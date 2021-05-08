package GameBackendJava.Adapters;

import GameBackendJava.Abstract.UserCheckService;
import GameBackendJava.Entities.User;

public class EDevletCheckManager implements UserCheckService{

	@Override
	public boolean CheckIfRealPerson(User user) {
		// E devlet sorgusu yapýlacak
		return true;
	}

}
