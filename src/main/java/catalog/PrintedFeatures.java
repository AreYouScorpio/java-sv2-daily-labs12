package catalog;

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
        return null;
    }

    @Override
    public String getTitle() {
        return null;
    }

    public PrintedFeatures(String title, int numberOfPages, List<String> authors){

    }
}
