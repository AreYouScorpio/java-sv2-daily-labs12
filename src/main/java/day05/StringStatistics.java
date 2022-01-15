package day05;

import java.util.*;

public class StringStatistics implements Comparator<Map> {

    @Override
    public int compare(Map o1, Map o2) {
        return o1.get()-o2.get();
    }

    private Map<Character, Integer> howManyCharacterIsInTheString(String input) {

        Map<Character, Integer> map = new LinkedHashMap<>();

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

