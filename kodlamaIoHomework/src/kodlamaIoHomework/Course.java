package kodlamaIoHomework;

public class Course {

	public Course(int courseId,String courseName,String description,String istructor,String photo,String percenteComplete) {
		this.courseId=courseId;
		this.courseName=courseName;
		this.description=description;
		this.instructor=istructor;
		this.percenteComplete=percenteComplete;
	}
	
	int courseId;
	String courseName;
	String description;
	String instructor;
	String photo;
	String percenteComplete;
	
}
