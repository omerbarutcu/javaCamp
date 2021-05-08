package kodlamaIoHomework;

public class Instructor extends User{

	private int instructorId;
	private String departmentName;
	
	public Instructor() {}
	
	
	public Instructor(int instructorId, String departmentName) {
		super();
		this.instructorId = instructorId;
		this.departmentName = departmentName;
	}


	public int getInstructorId() {
		return instructorId;
	}
	public void setInstructorId(int instructorId) {
		this.instructorId = instructorId;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
}
