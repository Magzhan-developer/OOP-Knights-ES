package Models;
import java.util.*;
public class Course {
    private String title;
    private String courseId;
    private int credits;
    private List<Semester> availableSemesters; // List of semesters when the course is available

    public Course(String title , String courseId, int credits) {
        this.title = title;
        this.courseId = courseId;
        this.credits = credits;
        this.availableSemesters = new ArrayList<>();
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getCourseId() {
        return courseId;
    }
    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }
    public int getCredits() {
        return credits;
    }
    public void setCredits(int credits) {
        this.credits = credits;
    }
    public void addAvailableSemester(Semester semester) {
        if (!availableSemesters.contains(semester)) {
            availableSemesters.add(semester);
        }
    }
    public void removeAvailableSemester(Semester semester) {
        availableSemesters.remove(semester);
    }

    public void printAvailableSemesters() {
        System.out.println("Available Semesters are : ");
        for (Semester semester : availableSemesters) {
            System.out.println(semester + "  ");
        }
    }

    @Override
    public String toString() {
        return "Course{" +
                "Title'" + title + '\'' +
                ", courseId='" + courseId + '\'' +
                ", credits=" + credits +
                '}';
    }
}
