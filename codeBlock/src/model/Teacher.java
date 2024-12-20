import java.util.ArrayList;
import java.util.List;

enum Title {
    TUTOR,
    LECTOR,
    SENIOR_LECTOR,
    PROFESSOR
}

public class Teacher extends Employee {
    private Title title;
    private List<Course> courses;
    private String name;
    private String surname;

    public Teacher(String username, String password,
                   String name, String surname,
                   int salary, Title title, String employeeId) {
        super(username, password, salary, employeeId);
        this.title = title;
        this.name = name;
        this.surname = surname;
        this.courses = new ArrayList<>();
    }
    public Teacher(String username, String password,int salary, String employeeId) {
        super(username, password, salary, employeeId);
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }

    public Title getTitle() {
        return title;
    }

    public void setTitle(Title title) {
        this.title = title;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void addCourse(Course course) {
        if (!courses.contains(course)) {
            courses.add(course);
            course.setTeacher(this);
            System.out.println("Курс " + course.getName() + " успешно добавлен.");
        } else {
            System.out.println("Курс уже добавлен.");
        }
    }

    public void viewCourses() {
        if (courses.isEmpty()) {
            System.out.println("У вас пока нет курсов.");
        } else {
            System.out.println("Курсы, которые ведет преподаватель:");
            for (Course course : courses) {
                System.out.println(course.getName());
            }
        }
    }


    public void manageCourse(Course course, String newTitle, int newCredits) {
        if (courses.contains(course)) {
            course.setTitle(newTitle);
            course.setCredits(newCredits);
            System.out.println("Информация о курсе обновлена.");
        } else {
            System.out.println("Вы не ведете этот курс.");
        }
    }

    public void viewStudents(Course course) {
        if (courses.contains(course)) {
            List<Student> students = course.getEnrolledStudents();
            if (students.isEmpty()) {
                System.out.println("На курс " + course.getName() + " пока никто не зарегистрировался.");
            } else {
                System.out.println("Студенты, зарегистрированные на курс " + course.getName() + ":");
                for (Student student : students) {
                    System.out.println(student.getName() + " " + student.getSurname() + " (" + student.getStudentId() + ")");
                }
            }
        } else {
            System.out.println("Вы не ведете этот курс.");
        }
    }

    public void putMarks(Course course) {
        Scanner scanner = new Scanner(System.in);

        if (course.getTeacher().equals(this)) {
            System.out.println("Выберите урок для выставления оценок:");
            for (int i = 0; i < course.getLessons().size(); i++) {
                System.out.println((i + 1) + ". " + course.getLessons().get(i).getTopic());
            }

            int lessonIndex = scanner.nextInt() - 1;
            if (lessonIndex < 0 || lessonIndex >= course.getLessons().size()) {
                System.out.println("Ошибка: урок не найден.");
                return;
            }

            Lesson lesson = course.getLessons().get(lessonIndex);

            System.out.println("Выберите студента для выставления оценки:");
            for (int i = 0; i < course.getEnrolledStudents().size(); i++) {
                Student student = course.getEnrolledStudents().get(i);
                System.out.println((i + 1) + ". " + student.getName() + " " + student.getSurname());
            }

            int studentIndex = scanner.nextInt() - 1;
            if (studentIndex < 0 || studentIndex >= course.getEnrolledStudents().size()) {
                System.out.println("Ошибка: студент не найден.");
                return;
            }

            Student student = course.getEnrolledStudents().get(studentIndex);

            System.out.println("Введите оценку: ");
            int mark = scanner.nextInt();

            Journal journal = course.getJournal();
            journal.addMark(student, course, lesson, mark);

            System.out.println("Оценка для студента " + student.getName() + " " + student.getSurname() +
                    " за урок \"" + lesson.getTopic() + "\" успешно добавлена.");
        } else {
            System.out.println("Ошибка: вы не ведете этот курс.");
        }
    }
}