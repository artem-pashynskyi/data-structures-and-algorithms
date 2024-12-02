package mosh;

import java.util.*;

public class StringUtils {

    public static int countVowels(String str) {
        if(str == null)
            return 0;
        int count = 0;
        String vowels = "aeiou";
        for(char ch : str.toLowerCase().toCharArray())
            if(vowels.indexOf(ch) != -1)
                count++;
        return count;
    }

    public static String reverse(String str) {
        if(str == null)
            return "";
        StringBuilder reversed = new StringBuilder();
        for(int i = str.length()-1; i >= 0; i--)
            reversed.append(str.charAt(i));
        return reversed.toString();
    }

    public static String reverseWords(String sentence) {
        if(sentence == null)
            return "";
        String[] words = sentence.trim().split(" ");
        Collections.reverse(Arrays.asList(words));
        return String.join(" ", words);
//        for(int i = words.length - 1; i >= 0; i--)
//            reversed.append(words[i] + " ");
//        return reversed.toString().trim();
    }

    //ABCD -> BCDA
    //ABCDABCD
    public static boolean areRotations(String str1, String str2) {
        if(str1 == null && str2 == null)
            return false;
        return str1.length() == str2.length() && (str1 + str1).contains(str2);
    }

    public static String removeDuplicates(String str) {
        if(str == null)
            return "";
        StringBuilder result = new StringBuilder();
        Set<Character> seen = new HashSet<>();
        for(char ch : str.toCharArray())
            if(!seen.contains(ch)) {
                seen.add(ch);
                result.append(ch);
            }
        return result.toString();
    }

    public static Character getMaxOccurringCharUsingHashTable(String str) {
        if(str == null && str.isEmpty())
            throw new IllegalArgumentException();
        Map<Character, Integer> map = new HashMap<>();
        for(char ch : str.toCharArray()) {
            int count = map.containsKey(ch) ? map.get(ch) + 1 : 1;
            map.put(ch, count);
        }
        int max = 0;
        char result = 0;
        for(Map.Entry<Character, Integer> entry : map.entrySet()) {
           if(entry.getValue() > max) {
               max = entry.getValue();
               result = entry.getKey();
           }
        }
        return result;
    }

    public static Character getMaxOccuringCharUsingASCIIArray(String str) {
        if(str == null && str.isEmpty())
            throw new IllegalArgumentException();
        final int ASCII_SIZE = 256;
        int[] frequencies = new int[ASCII_SIZE];
        for(char ch : str.toCharArray()) {
            frequencies[ch]++;
        }
        int max = 0;
        char result = 0;
        for(int i = 0; i < frequencies.length; i++) {
            if(frequencies[i] > max) {
                max = frequencies[i];
                result = (char) i;
            }
        }
        return result;
    }

    public static String capitalize(String sentence) {
        if (sentence == null || sentence.trim().isEmpty())
            return "";
        String[] words = sentence
                            .trim()
                            .replaceAll(" +", " ")
                            .split(" ");
        for(int i = 0; i < words.length; i++)
            words[i] = words[i].substring(0, 1).toUpperCase() + words[i].substring(1).toLowerCase();
        return String.join(" ", words);
    }

    //ABCD - DCBA
    //first = ['A', 'B', 'C', 'D']
    //sorted second = ['A', 'B', 'C', 'D']
    public static boolean areAnagramsUsingSorting(String first, String second) {
        if(first.length() != second.length() || first == null || second == null)
            return false;
        char[] firstArr = first.toLowerCase().toCharArray();
        char[] secondArr = second.toLowerCase().toCharArray();
        Arrays.sort(firstArr);
        Arrays.sort(secondArr);
        return Arrays.equals(firstArr, secondArr);
    }

    public static boolean areAnagramsUsingCount(String first, String second) {
        if(first.length() != second.length() || first == null || second == null)
            return false;
        char[] firstArr = first.toLowerCase().toCharArray();
        char[] secondArr = second.toLowerCase().toCharArray();
        int count = 0;
        for(char ch : firstArr)
            count += ch;
        for(char ch : secondArr)
            count -= ch;
        return count == 0;
    }

    public static boolean areAnagramsUsingStringBuilder(String first, String second) {
        if(first.length() != second.length() || first == null || second == null)
            return false;
        StringBuilder stringBuilder = new StringBuilder(first.toLowerCase());
        char[] array = second.toLowerCase().toCharArray();
        for(char ch : array) {
            int index = stringBuilder.indexOf(""+ch);
            if(index == -1) {
                return false;
            } else {
                stringBuilder.deleteCharAt(index);
            }
        }
        return true;
    }

    public static boolean isPalindrome(String word) {
        if(word == null)
            return false;
        int left = 0;
        int right = word.length()-1;
        while (left < right)
            if(word.charAt(left++) != word.charAt(right--))
                return false;
        return true;
    }

}
