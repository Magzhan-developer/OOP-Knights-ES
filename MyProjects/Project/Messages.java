import java.util.*;

class Messages extends Message{

	public ArrayList<Message> messages = new ArrayList<Message>();

	public Messages(String author, Date sendDate) {
		super(author, sendDate);
	}

	messages.add(message);

	public void printMessages() {
		for(Message message : messages) {
			message.showDetails();
		}
	}
	
}
