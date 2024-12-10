package Models;

public class Student extends User {
    private String specialty;
    public Student(String username, String password) {
        super(username, password);
    }
    public Student(String username, String password, String specialty) {
        super(username, password);
        this.setSpecialty(specialty);
    }
    public String getSpecialty() {
        return specialty;
    }
    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    @Override
    public String toString() {
        return this.getUsername();
    }
}
