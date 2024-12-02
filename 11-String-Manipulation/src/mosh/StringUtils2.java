package mosh;

import java.util.*;

public class StringUtils2 {

    public static int countVowels(String str) {
        if(str.isEmpty()) {
            return 0;
        }
        var counter = 0;
        List<Character> vowels = Arrays.asList('a', 'e', 'i', 'o', 'u');
        var strArray = str.toCharArray();
        for(var letter : strArray) {
            if(vowels.contains(letter)) {
                counter++;
            }
        }
        return counter;
    }

    public static String reverse(String str) {
        if(str.isEmpty()) {
            return str;
        }
        var result = new StringBuilder();
        for(var i  = str.length() - 1; i >= 0; i--) {
            result.append(str.charAt(i));
        }
        return result.toString();
    }

    public static String reverseWords(String sentence) {
        if(sentence.isEmpty()) {
            return sentence;
        }
        var splitSentence = sentence.trim().split(" ");
        var result = new StringBuilder();
        for(var i = splitSentence.length - 1; i >= 0; i--) {
            result.append(splitSentence[i]);
            if(i != 0)
                result.append(" ");
        }
        return result.toString();
    }

    //ABCD -> BCDA
    //ABCDABCD
    public static boolean areRotations(String str1, String str2) {
        if(str1.length() != str2.length()) {
            return false;
        }
        return (str1 + str1).contains(str2);
    }

    //Trees are beautiful
    //Tres abutifl
    public static String removeDuplicates(String str) {
        if(str.isEmpty()) {
            return str;
        }
        String result = "";
        List<Character> set = new ArrayList<>();
        for(var i : str.toCharArray()) {
            if(!set.contains(i)) {
                set.add(i);
                result += i;
            }
        }
        return result;
    }

    //Trees are beautiful
    //e
    public static Character getMaxOccurringCharUsingHashTable(String str) {
        if(str.isEmpty()) {
            throw new IllegalArgumentException();
        }
        Map<Character, Integer> map = new HashMap<>();
        for(var i : str.toCharArray()) {
            var count = map.containsKey(i) ? map.get(i) + 1 : 1;
            map.put(i, count);
        }

        var maxValue = 0;
        char resultChar = 0;
        for(Map.Entry<Character, Integer> entry : map.entrySet()) {
            if(entry.getValue() > maxValue) {
                maxValue = entry.getValue();
                resultChar = entry.getKey();
            }
        }

        return resultChar;
    }

    //today is a great day
    public static String capitalize(String sentence) {
        if(sentence.isEmpty()) {
            return sentence;
        }
        String[] words = sentence.trim().split(" ");
        for(var i = 0; i < words.length; i++) {
            words[i] = words[i].substring(0, 1).toUpperCase() + words[i].substring(1).toLowerCase();
        }
        var result = String.join(" ", words);
        return result;
    }

    //ABCD - DCBA
    //first = ['A', 'B', 'C', 'D']
    //sorted second = ['A', 'B', 'C', 'D']
    public static boolean areAnagramsUsingSorting(String first, String second) {
        if(first.isEmpty() || second.isEmpty() || first.length() != second.length()) {
            return false;
        }
        char[] firstArr = first.trim().toCharArray();
        char[] secondArr = second.trim().toCharArray();
        Arrays.sort(firstArr);
        Arrays.sort(secondArr);
        return Arrays.equals(firstArr, secondArr);
    }

    public static boolean areAnagramsUsingCount(String first, String second) {
        if(first.isEmpty() || second.isEmpty() || first.length() != second.length()) {
            return false;
        }
        char[] firstArr = first.trim().toCharArray();
        char[] secondArr = second.trim().toCharArray();
        var count = 0;
        for(var i : firstArr) {
            count += i;
        }
        for(var i : secondArr) {
            count -= i;
        }
        return count == 0;
    }

    public static boolean areAnagramsUsingStringBuilder(String first, String second) {
        if(first.isEmpty() || second.isEmpty() || first.length() != second.length()) {
            return false;
        }
        StringBuilder firstStringBuilder = new StringBuilder(first);
        char[] secondArray = second.toCharArray();
        for(var i : secondArray) {
            var index = firstStringBuilder.indexOf(i + "");
            if(index != -1) {
                firstStringBuilder.deleteCharAt(index);
            } else {
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindrome(String word) {
        if(word.isEmpty()) {
            return false;
        }
        int i = 0;
        int j = word.length() - 1;
        while (i < j) {
            if(word.charAt(i++) != word.charAt(j--)) {
                return false;
            }
        }
        return true;
    }

}
