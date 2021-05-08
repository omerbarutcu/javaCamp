package GameBackendJava.Concrete;

import GameBackendJava.Abstract.UserCheckService;
import GameBackendJava.Entities.User;

public class UserCheckManager implements UserCheckService{

	@Override
	public boolean CheckIfRealPerson(User user) {
		
		return false;
	}

}
