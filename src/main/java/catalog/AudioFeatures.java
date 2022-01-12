package catalog;

import java.util.List;

public class AudioFeatures implements Feature {


    public int getLength() {
        return length;
    }


    List<String> composer;
    int length;
    List<String> performers;
    String title;

    public AudioFeatures (String title, int length, List<String> performers) {
        this.length = length;
        this.performers = performers;
        this.title = title;
    }

    public AudioFeatures (String title, int length, List<String> performers, List<String> composer) {
        this.composer = composer;
        this.length = length;
        this.performers = performers;
        this.title = title;
    }



    @Override
    public List<String> getContributors() {
        return performers;
    }

    @Override
    public String getTitle() {
        return title;
    }




}
