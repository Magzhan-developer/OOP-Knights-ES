import java.util.*;
 
class News extends Researcher{
	public String topic;
	public ArrayList<ResearchPaper> newsList = new ArrayList<ResearchPaper>();

	public void updateCatalog(ResearchPaper r) {

		newsList.add(r);
		
	}
	
}
