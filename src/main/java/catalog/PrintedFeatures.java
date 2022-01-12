package catalog;

import java.util.Collections;
import java.util.List;

public class PrintedFeatures implements Feature {

    public List<String> getAuthors() {
        return authors;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    List<String> authors;
    int numberOfPages;
    String title;


    @Override
    public List<String> getContributors() {

        return authors ;
    }

    @Override
    public String getTitle() {
        return title;
    }

    public PrintedFeatures(String title , int numberOfPages, List<String> authors) {
        if (title==null || title.isBlank()) throw new IllegalArgumentException("Empty title");
        else
        {
            this.authors = authors;
        this.numberOfPages = numberOfPages;
        this.title = title;}
    }
}
