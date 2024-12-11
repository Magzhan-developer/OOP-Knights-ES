import java.util.*;

public class Finance_Manager extends Manager {

	//docs to see the list of transactions
	public ArrayList<String> docs = new ArrayList<String>();
	
	public Finance_Manager (String name, String username, String password, String userId, String employeeId) {
		super(name, username, password, userId, employeeId);
	}

	public void sendSalary(Object obj) {
		if (obj instanceof Student) {
			obj.salary +=42500;
			docs.add(obj.studentId);
		}

		else if(obj instanceof Teacher) {
			obj.salary += 857400;
			docs.add(obj.employeeId);
		}
		else if(obj instanceof Professor) {
			obj.salary += 1200000;
			docs.add(obj.employeeId);
		}
		else if(obj instanceof Manager) {
			obj.salary += 425000;
			docs.add(obj.employeeId);
		}
		
	}

	public ArrayList<String> sendReport() {
		return docs;
	}
	
}
