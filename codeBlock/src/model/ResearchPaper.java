package codeBlock.src.model;

import java.util.Date;
import java.util.List;

public class ResearchPaper {
    public String author;
    public List<String> references;
    public List<String> citations;
    public Date publishedDate;
    public List<String> keyWords;

    public ResearchPaper(String author,List<String> references,List<String> citations){
        this.author = author;
        this.references = references;
        this.citations = citations;
    }

}
