package GameBackendJava.Abstract;

import GameBackendJava.Entities.User;

public abstract class BaseUserManager implements UserService{

	@Override
	public void Add(User user) {
		System.out.println("Kaydedildi : "+user.getFirstName());
		
	}

	@Override
	public void Delete(User user) {
		System.out.println("Silindi : "+user.getFirstName());
		
	}

	@Override
	public void Update(User user) {
		System.out.println("Güncellendi : "+user.getFirstName());
		
	}

}
