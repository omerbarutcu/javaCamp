package kodlamaIoHomework;

public class UserManager {

	public void add(User user) {
		System.out.println(user.getFirstName()+" kullan�c�s� olu�turuldu.");
	}
	public void delete(User user) {
		System.out.println(user.getFirstName()+" kullan�c�s� silindi.");
	}
}
