import java.util.*;

class Messages extends Message{

	public ArrayList<Message> messages = new ArrayList<Message>();

	public Messages(String author, Date sendDate) {
		super(author, sendDate);
	}

	public void addMessage(Message message) {
		if(message!=null) {
			messages.add(message);
		}
	}

	public void printMessages() {
		for(Message message : messages) {
			message.showDetails();
		}
	}
	
}
