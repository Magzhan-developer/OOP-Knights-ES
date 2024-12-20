import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Student extends User {
    private Transcript transcript;
    private int yearofStudy;
    private String studentId;
    private String Major;
    private List<Course> registeredCourses;
    private List<Lesson> schedule;
    private int currentSemester;
    private String name;
    private String surname;
    private Map<Teacher, Integer> teacherRatings;
    private Journal journal;

    public Student(String username, String password,
                   String name, String surname, String studentId,
                   int yearOfStudy, String Major, int currentSemester) {
        super(username, password);
        this.yearofStudy = yearofStudy;
        this.studentId = studentId;
        this.Major = Major;
        this.name = name;
        this.surname = surname;
        this.transcript = new Transcript();
        this.schedule = new ArrayList<>();
        this.registeredCourses = new ArrayList<>();
        this.journal = new Journal();
        this.currentSemester = currentSemester;
    }
    public Student(String username, String password) {
        super(username, password);
    }

    public void viewCourses() {
        Course.displayAllCourses();
    }
    public String getMajor() {
        return Major;
    }
    public void setMajor(String Major) {
        this.Major = Major;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setSurname(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
    public String getId() {
        return studentId;
    }
    public void setId() {
        this.studentId = studentId;
    }
    public void setCurrentSemester() {
        this.currentSemester = currentSemester;
    }
    public int getCurrentSemester() {
        return currentSemester;
    }


    public void registerForCourses(Course course) {
        if (course.getAvailableSemesters().contains(currentSemester)) {
            if (!registeredCourses.contains(course)) {
                course.addStudent(this);
                registeredCourses.add(course);
                System.out.println("Вы успешно зарегистрировались на курс: " + course.getName());
            } else {
                System.out.println("Вы уже зарегистрированы на этот курс.");
            }
        } else {
            System.out.println("Этот курс не доступен в текущем семестре.");
        }
    }

    public void viewMarks() {
        journal.viewMarks(this);
    }

    public Transcript viewTranscript() {
        return transcript;
    }

    public void rateTeachers() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Необходимо оценить всех преподавателей (оценка от 1 до 10):");

        for (Course course : registeredCourses) {
            Teacher teacher = course.getTeacher();
            if (teacher == null) {
                System.out.println("Преподаватель для курса " + course.getName() + " не назначен.");
                continue;
            }

            if (teacherRatings.containsKey(teacher)) {
                System.out.println("Вы уже оценили преподавателя " + teacher.getName() + " на " + teacherRatings.get(teacher) + " баллов.");
                continue;
            }

            System.out.println("Введите оценку для преподавателя " + teacher.getName() + ": ");
            int rating = scanner.nextInt();

            while (rating < 1 || rating > 10) {
                System.out.println("Оценка должна быть в пределах от 1 до 10. Попробуйте снова: ");
                rating = scanner.nextInt();
            }

            teacherRatings.put(teacher, rating);
            System.out.println("Вы успешно оценили преподавателя " + teacher.getName() + " на " + rating + " баллов.");
        }

        System.out.println("Вы успешно оценили всех преподавателей!");
    }

    public void viewTeacherRatings() {
        if (teacherRatings.isEmpty()) {
            System.out.println("Вы ещё не оценили преподавателей.");
        } else {
            System.out.println("Оценки преподавателей:");
            for (Map.Entry<Teacher, Integer> entry : teacherRatings.entrySet()) {
                System.out.println("Преподаватель: " + entry.getKey().getName() + ", Оценка: " + entry.getValue());
            }
        }
    }

    public void viewInfoAboutTeacherOfSpecificCourse(Course course) {
        if (course.displayAllCourses().contains(course)) {
            Teacher teacher = course.getTeacher();
            if (teacher != null) {
                System.out.println("Информация о преподавателе курса " + course.getName() + ":");
                System.out.println("Электронный адрес преподавателя: " + teacher.getUsername()+"@kbtu.kz");
                System.out.println("Должность: " + teacher.getTitle());
            } else {
                System.out.println("На данный момент преподаватель для курса " + course.getName() + " не назначен.");
            }
        } else {
            System.out.println("Вы не зарегистрированы на этот курс.");
        }
    }

    public List<Lesson> viewSchedule() {
        return schedule;
    }

    public void getTranscript() {
        transcript.printTranscript();
    }

}