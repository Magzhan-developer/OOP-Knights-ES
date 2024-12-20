import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Journal {
    private List<MarkRecord> records;

    public Journal() {
        records = new ArrayList<>();
    }

    public void addMark(Student student, Course course, Lesson lesson, int mark) {
        records.add(new MarkRecord(student, course, lesson, mark));
    }

    public void viewMarks(Student student) {
        System.out.println("Выберите курс для просмотра оценок:");
        List<Course> courses = student.getEnrolledCourses();
        for (int i = 0; i < courses.size(); i++) {
            System.out.println((i + 1) + ". " + courses.get(i).getName());
        }

        Scanner scanner = new Scanner(System.in);
        int courseChoice = scanner.nextInt() - 1;
        if (courseChoice < 0 || courseChoice >= courses.size()) {
            System.out.println("Ошибка: курс не найден.");
            return;
        }

        Course selectedCourse = courses.get(courseChoice);

        System.out.println("Оценки для курса: " + selectedCourse.getName());
        for (MarkRecord record : records) {
            if (record.getCourse().equals(selectedCourse) && record.getStudent().equals(student)) {
                System.out.println("Урок: " + record.getLesson().getTopic() + ", Оценка: " + record.getMark() + ", Дата: " + record.getLesson().getDate());
            }
        }
    }
}