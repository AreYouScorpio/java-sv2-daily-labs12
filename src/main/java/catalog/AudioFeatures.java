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
        if (title==null || title.isBlank()) throw new IllegalArgumentException();
        else if (length<1) throw new IllegalArgumentException();
        else {
            this.length = length;
        this.performers = performers;
        this.title = title;}
    }

    public AudioFeatures (String title, int length, List<String> performers, List<String> composer) {
        if (title==null || title.isBlank()) throw new IllegalArgumentException();
        else if (length<1) throw new IllegalArgumentException();
        else {
        this.composer = composer;
        this.length = length;
        this.performers = performers;
        this.title = title;
    }}




    @Override
    public List<String> getContributors() {
        return performers;
    }

    @Override
    public String getTitle() {
        return title;
    }




}
