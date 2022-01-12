package catalog;

import java.util.List;

public class Validators {

    public static boolean isBlank(String inputString) {
        if (inputString==null || inputString.isBlank()) {
            return true;
        } else return false;
    }

    public static boolean isEmpty(List<String> inputList) {
        if (inputList==null || inputList.isEmpty()) {
            return true;
        } else return false;
    }
}
