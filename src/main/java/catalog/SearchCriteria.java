package catalog;

public class SearchCriteria {
    String contributor;
    String title;

    private SearchCriteria(String title, String contributor) {
        this.contributor = contributor;
        this.title = title;
    }

    public String getContributor() {
        return contributor;
    }

    public String getTitle() {
        return title;
    }


    public static SearchCriteria createByBoth(String a, String b) {
        if (a==null || b==null) throw new IllegalArgumentException();
        return new SearchCriteria(a, b);
    }

    public static SearchCriteria createByContributor(String a) {
        if (a==null) throw new IllegalArgumentException();
        return new SearchCriteria(null, a);
    }

    public static SearchCriteria createByTitle(String b) {
        if (b==null) throw new IllegalArgumentException();
        return new SearchCriteria(b, null);
    }

    public boolean hasContributor(){
        return contributor!=null;
    }
     public boolean hasTitle(){
        return title!=null;
    }



}
