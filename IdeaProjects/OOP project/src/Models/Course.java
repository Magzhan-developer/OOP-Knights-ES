package Models;

public class Course {
    private String title; // Name of the course
    private String courseId; // Unique code for the course
    private int credits;
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
