package kodlamaIoHomework;

public class StudentManager {

	public void add(Student student) {
		System.out.println(student.getFirstName()+" öğrencisi oluşturuldu.");
	}
	public void delete(Student student) {
		System.out.println(student.getFirstName()+" öğrencisi silindi.");
	}
}
