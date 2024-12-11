import java.util.*;

public class Message {

	public String author;
	public Date sendDate;

	public Message(String author, Date sendDate) {
		this.author = author;
		this.sendDate = sendDate;
	}

	public void showDetails() {
		System.out.println("Author: " + author + " Send Date: " + sendDate);
	}
	
}
