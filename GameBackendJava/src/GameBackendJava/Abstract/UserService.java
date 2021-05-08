package GameBackendJava.Abstract;

import GameBackendJava.Entities.User;

public interface UserService {

	void Add(User user);
	void Delete(User user);
	void Update(User user);
	
}
