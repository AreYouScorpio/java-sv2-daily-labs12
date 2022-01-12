package catalog;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Catalog {

    List<CatalogItem> catalogItems = new ArrayList<>();

    public List<CatalogItem> getCatalogItems() {
        return catalogItems;
    }

    public void addItem(CatalogItem c){
        catalogItems.add(c);
    }

    public void deleteItemByRegistrationNumber(String s) {
        List<CatalogItem> listToDelete = new ArrayList<>();
        for (CatalogItem actual : catalogItems) {
            if (actual.registrationNumber.equals(s)) listToDelete.add(actual);
        }
        for (CatalogItem actual : listToDelete) {
            catalogItems.remove(actual);
        }
    }

    public List<CatalogItem> getAudioLibraryItems() {
        List<CatalogItem> audio = new ArrayList<>();
        for (CatalogItem actual : catalogItems) {
            if (actual.hasAudioFeature()) audio.add(actual);
        }
        return audio;
    }


    public List<CatalogItem> getPrintedLibraryItems() {
        List<CatalogItem> print = new ArrayList<>();
        for (CatalogItem actual : catalogItems) {
            if (actual.hasPrintedFeature()) print.add(actual);
        }
        return print;
    }

    public int getAllPageNumber() {
        int result=0;
        List<CatalogItem> print = new ArrayList<>();
        for (CatalogItem actual : catalogItems) {
            if (actual.hasPrintedFeature()) result+=actual.numberOfPagesAtOneItem();
        }
        return result;
    }

    public int getFullLength() {
        int result=0;
        List<CatalogItem> audio = new ArrayList<>();
        for (CatalogItem actual : catalogItems) {
            if (actual.hasAudioFeature()) result+=actual.fullLengthAtOneItem();
        }
        return result;
    }

}
