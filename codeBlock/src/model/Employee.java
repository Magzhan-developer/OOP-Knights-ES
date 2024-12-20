import java.util.ArrayList;
import java.util.List;

public abstract class Employee extends User {
    private int salary;
    private String employeeId;
    private List<Message> messageBox;
    public Employee(String username, String password, int salary, String employeeId) {
        super(username, password);
        this.salary = salary;
        this.employeeId= employeeId;
        this.messageBox = new ArrayList<>();
    }

    public int getSalary() {
        return salary;
    }

    public void sendComplaint(Employee employee, String complaint) {
        Message message = new Message(this.getUsername(), employee.getUsername(), "Complaint: " + complaint);
        employee.receiveMessage(message);
        System.out.println("Complaint sent to " + employee.getUsername());
    }

    public void sendMessage(Employee employee, String content) {
        Message message = new Message(this.getUsername(), employee.getUsername(), content);
        employee.receiveMessage(message);
        System.out.println("Message sent to " + employee.getUsername());
    }

    public void receiveMessage(Message message) {
        messageBox.add(message);
    }

    public void viewMessages() {
        System.out.println("Messages: " );
        if (messageBox.isEmpty()) {
            System.out.println("No messages.");
        } else {
            for (Message message : messageBox) {
                System.out.println(message);
            }
        }
    }
}