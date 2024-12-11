import java.util.*;

class Course extends Teacher{

	public String name;
	private String courseId;
	private Teacher instructor;
	public Date coursePublishedDate;
	public boolean courseStatus = false;

	public Course(String name, String courseId, Teacher instructor, Date coursePublishedDate, boolean courseStatus) {
		this.name = name;
		this.courseId = courseId;
		this.instructor = instructor;
		this.coursePublishedDate = coursePublishedDate;
		this.courseStatus = courseStatus;
	}

	public void startCourse() {
		this.courseStatus = true;
		System.out.println("Course" + name + " has started!");
	}

	public String getName() {
		return name;
	}

	public String getCourseId() {
		return courseId;
	}

	public Teacher getInstructor() {
		return instructor;
	}

	public Date getCoursePublishedDate() {
		return coursePublishedDate;
	}

	public boolean getCourseStatus() {
		return courseStatus;
	}
	
	public String toString() {
		return "Course Name: " + name + " Course Id: " + courseId + " Instructor: " + instructor + " Course Publised Date: " + coursePublishedDate + " Course Status: " + courseStatus;
	}
	
}
