package kodlamaIoHomework;

public class UserManager {

	public void add(User user) {
		System.out.println(user.getFirstName()+" kullanıcısı oluşturuldu.");
	}
	public void delete(User user) {
		System.out.println(user.getFirstName()+" kullanıcısı silindi.");
	}
}
