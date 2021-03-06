package catalog;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.collections.ListUtils;

public class AudioFeatures implements Feature {


    public int getLength() {
        return length;
    }


    List<String> composer;
    int length;
    List<String> performers;
    String title;

    public AudioFeatures(String title, int length, List<String> performers) {
        if (title == null || title.isBlank()) throw new IllegalArgumentException();
        else if (performers == null || performers.isEmpty()) throw new IllegalArgumentException();
        else if (length < 1) throw new IllegalArgumentException();
        else {
            this.length = length;
            this.performers = performers;
            this.title = title;
        }
    }

    public AudioFeatures(String title, int length, List<String> performers, List<String> composer) {
        if (title == null || title.isBlank()) throw new IllegalArgumentException();
        else if (performers == null || performers.isEmpty()) throw new IllegalArgumentException();
        else if (length < 1) throw new IllegalArgumentException();
        else {
            this.composer = composer;
            this.length = length;
            this.performers = performers;
            this.title = title;
        }
    }


    @Override
    public List<String> getContributors() {


        List<String> result = new ArrayList<>();
        if (composer != null) result.addAll(composer);
        if (performers != null) result.addAll(performers);
        return result;


    }

    @Override
    public String getTitle() {
        return title;
    }


}
