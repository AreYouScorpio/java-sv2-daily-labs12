package day05;

import java.util.LinkedHashMap;
import java.util.Map;

public class StringStatistics {

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
        return map;
    }


    public static void main(String[] args) {
        StringStatistics stringStatistics = new StringStatistics();
        stringStatistics.howManyCharacterIsInTheString("sszzzzziasix");
    }

}

