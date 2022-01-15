package day05;

import javax.swing.plaf.IconUIResource;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class StringStatistics {

    private Map<Character, Integer> howManyCharacterIsInTheString(String input){

        Map<Character, Integer> map = new LinkedHashMap<>();

        int counter=0;

        char[] ch = new char[input.length()];

        for (int i=0; i<ch.length; i++) {
            ch[i] = input.charAt(i);
        }

        for (int i=0; i< ch.length; i++){
            if (map.containsKey(ch[i])) {
                System.out.println(map.get(ch[i])+"hello");
                counter=map.get(ch[i])+1;
                map.put(ch[i], counter);
            } else {
                map.put(ch[i],1);
            }
        }
        System.out.println(map);
        return map;
        }


    public static void main(String[] args) {
        StringStatistics stringStatistics = new StringStatistics();
        stringStatistics.howManyCharacterIsInTheString("sszzzzziasi");
    }

}

