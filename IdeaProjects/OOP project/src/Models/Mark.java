package Models;

public class Mark {
    private double att1;
    private double att2;
    private double finalExam;

    public Mark(double attestation1, double attestation2, double finalExam) {
        this.att1 = validateGrade(attestation1);
        this.att2 = validateGrade(attestation2);
        this.finalExam = validateGrade(finalExam);
    }

    public double calculateTotalGrade() {
        return (att1 * 0.3) + (att2 * 0.3) + (finalExam * 0.4);
    }
    public double calculateGPA(int credits) {
        double totalGrade = calculateTotalGrade();
        double gpa = 0.0;
        if (totalGrade >= 90) {
            gpa = 4.0;
        } else if (totalGrade >= 80) {
            gpa = 3.0;
        } else if (totalGrade >= 70) {
            gpa = 2.0;
        } else if (totalGrade >= 60) {
            gpa = 1.0;
        }
        return gpa * credits;
    }
    private double validateGrade(double grade) {
        try {
            if (grade < 0 || grade > 100) {
                throw new IllegalArgumentException("Grade must be between 0 and 100.");
            }
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
            throw e;
        }
        return grade;
    }

    @Override
    public String toString() {
        return "attesation first: " + att1 +
                ", attestation second: " + att2 +
                ", finalExam is : " + finalExam +
                ", final gradee of semester course : " + calculateTotalGrade();
    }
}
