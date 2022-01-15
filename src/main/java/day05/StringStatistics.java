package day05;

import java.util.*;

public class StringStatistics {



    private Map<Character, Integer> howManyCharacterIsInTheString(String input) {

        Map<Character, Integer> map = new TreeMap<>();

        // HashMap - sorrend kupacok alapján ; TreeMap - sorrend ASCII alapján, Linked.. - input sorrend alapján

        char[] ch = new char[input.length()];

        for (int i = 0; i < ch.length; i++) {
            ch[i] = input.charAt(i);
        }

        for (int i = 0; i < ch.length; i++) {
            if (map.containsKey(ch[i])) {
                System.out.println(map.get(ch[i]) + "hello");
                map.put(ch[i], map.get(ch[i]) + 1);
            } else {
                map.put(ch[i], 1);
            }
        }



        System.out.println(map);

        /*
        List<Character> employeeByKey = new ArrayList<>(map.keySet());
        Collections.sort(employeeByKey);
        System.out.println(employeeByKey);
         */



        return map;
    }


    public static void main(String[] args) {
        StringStatistics stringStatistics = new StringStatistics();
        stringStatistics.howManyCharacterIsInTheString("sszzzzziasix");
    }

}

