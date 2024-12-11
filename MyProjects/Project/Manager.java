import java.util.*;

class Manager extends Employee{

	//Bank account for salary
	private int salary;

	private ArrayList<Course> courses = new ArrayList<Course>();

	public Manager(String name, String username, String password, String userId, String employeeId, int salary) {
		super(name, username, password, userId, employeeId);
		this.salary = salary;
	}

	public void approveStudentReg() {
		System.out.println("Student registration is approved!");
	}

	public void asssignCourse(Course course, Teacher teacher) {
		course.setTeacher = teacher;
	}

	public List<Student> viewInfoStudent() {
		return Students; //Assuming there is array of Students
	}	

	public List<Teacher> viewInfoTeacher() {
		return Teachers; //Assuming there is array of Teachers
	}

	public void addCourse(Course course) {
		courses.add(course);
		System.out.println("New course has been added");
	}

	public void readStudentsMessages() {
		Message.showDetails();
	}
	
}

