package catalog;

import java.util.List;

public class PrintedFeatures implements Feature {

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
}
