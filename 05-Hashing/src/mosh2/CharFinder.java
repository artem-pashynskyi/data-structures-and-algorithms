package mosh2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CharFinder {

    //a green apple
    public static char firstNonRepeatedChar(String input) {
        if(input == null) {
            throw new IllegalArgumentException();
        }
        Map<Character, Integer> map = new HashMap<>();
        for(char ch : input.toCharArray()) {
            var count = map.containsKey(ch) ? map.get(ch) : 0;
            map.put(ch, count + 1);
        }
        for(char ch : input.toCharArray()) {
            if(map.get(ch) == 1) {
                return ch;
            }
        }
        return 0;
    }

    public static char firstRepeatedChar(String input) {
        Set<Character> set = new HashSet<>();
        for(var ch : input.toCharArray()) {
            if(set.contains(ch)) {
                return ch;
            }
            set.add(ch);
        }
        return 0;
    }

}
