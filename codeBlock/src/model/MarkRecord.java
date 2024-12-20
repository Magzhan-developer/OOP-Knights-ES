import java.util.Date;

public class MarkRecord {
    private Student student;
    private Course course;
    private Lesson lesson;
    private int mark;
    private Date lessonDate;

    public MarkRecord(Student student, Course course, Lesson lesson, int mark) {
        this.student = student;
        this.course = course;
        this.lesson = lesson;
        this.mark = mark;
        this.lessonDate = lesson.getDate();
    }

    public Student getStudent() {
        return student;
    }

    public Course getCourse() {
        return course;
    }

    public Lesson getLesson() {
        return lesson;
    }

    public int getMark() {
        return mark;
    }

    public Date getLessonDate() {
        return lessonDate;
    }
}