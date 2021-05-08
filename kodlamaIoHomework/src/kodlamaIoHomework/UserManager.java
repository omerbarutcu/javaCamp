package kodlamaIoHomework;

public class UserManager {

	public void add(User user) {
		System.out.println(user.getFirstName()+" kullanýcýsý oluþturuldu.");
	}
	public void delete(User user) {
		System.out.println(user.getFirstName()+" kullanýcýsý silindi.");
	}
}
