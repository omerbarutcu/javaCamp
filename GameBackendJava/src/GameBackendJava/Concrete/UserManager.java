package GameBackendJava.Concrete;

import GameBackendJava.Abstract.BaseUserManager;
import GameBackendJava.Abstract.UserCheckService;
import GameBackendJava.Entities.User;

public class UserManager extends BaseUserManager{
	private UserCheckService userCheckService;

	public UserManager(UserCheckService userCheckService) {
		
		this.userCheckService = userCheckService;
	}

	@Override
	public void Add(User user) {
		if (userCheckService.CheckIfRealPerson(user)) {
			super.Add(user);
			
		}else {
			System.out.println("Geçersiz kullanýcý");
		}
	}

	@Override
	public void Delete(User user) {
		super.Delete(user);
		
	}

	@Override
	public void Update(User user) {
		if (userCheckService.CheckIfRealPerson(user)) {
			super.Add(user);
			
		}else {
			System.out.println("Geçersiz kullanýcý");
		}		
		
	}

}
