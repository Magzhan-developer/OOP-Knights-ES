package Models;
import java.util.SortedSet;
import java.util.*;
public class Lesson {
    private Teacher teacher;
    private Course course;
    private LessonType lessonType;
    private Language language;

    private SortedSet<Student> students;

    public Lesson(Teacher teacher, Course course, LessonType lessonType, Language language) {
        this.setTeacher(teacher);
        this.setCourse(course);
        this.setLanguage(language);
        this.setLessonType(lessonType);
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }
    public LessonType getLessonType() {
        return lessonType;
    }
    public void setLessonType(LessonType lessonType) {
        this.lessonType = lessonType;
    }
    public Language getLanguage() {
        return language;
    }

    public SortedSet<Student> getStudents() {
        return students;
    }

    public void setStudents(SortedSet<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Lesson{" +
                "teacher=" + teacher +
                ", course=" + course +
                ", lessonType=" + lessonType +
                ", language=" + language +
                ", students=" + students +
                '}';
    }
}
