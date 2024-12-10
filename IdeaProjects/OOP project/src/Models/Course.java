package Models;
import java.util.List;
public class Course {
    private String title;
    private String courseId;
    private int credits;
    private List<Semester> availableSemesters; // List of semesters when the course is available

    public Course(String title , String courseId, int credits) {
        this.title = title;
        this.courseId = courseId;
        this.credits = credits;

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

    @Override
    public String toString() {
        return "Course{" +
                "Title'" + title + '\'' +
                ", courseId='" + courseId + '\'' +
                ", credits=" + credits +
                '}';
    }
}
