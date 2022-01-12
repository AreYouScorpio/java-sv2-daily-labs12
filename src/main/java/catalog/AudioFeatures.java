package catalog;

import java.util.List;

public class AudioFeatures implements Feature {
    public List<String> getComposer() {
        return composer;
    }

    public int getLength() {
        return length;
    }

    public List<String> getPerformers() {
        return performers;
    }

    List<String> composer;
    int length;
    List<String> performers;
    String title;

    public AudioFeatures (String title, int length, List<String> performers) {

    }

    public AudioFeatures (String title, int length, List<String> performers, List<String> composer) {

    }

    @Override
    public List<String> getContributors() {
        return null;
    }

    @Override
    public String getTitle() {
        return null;
    }




}
