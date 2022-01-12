package catalog;

import java.util.ArrayList;
import java.util.List;

public class CatalogItem {

    List<Feature> features = new ArrayList<>();
    int price;
    String registrationNumber;

    public CatalogItem(String registrationNumber, int price, Feature... features ) {
        this.features = List.of(features);
        this.price = price;
        this.registrationNumber = registrationNumber;
    }




    public List<Feature> getFeatures() {
        return features;
    }

    public int getPrice() {
        return price;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }



}
