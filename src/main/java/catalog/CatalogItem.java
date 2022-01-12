package catalog;

import javax.swing.*;
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

public int numberOfPagesAtOneItem(){

        int pages=0;
        for(Feature f:features)
    {
        if(f instanceof PrintedFeatures)
        pages=  (((PrintedFeatures) f).getNumberOfPages());
    }
        return pages;
    }
public int fullLengthAtOneItem(){

        int length=0;
        for(Feature f:features)
    {
        if(f instanceof AudioFeatures)
        length+=  (((AudioFeatures) f).getLength());
    }
        return length;
    }

}


