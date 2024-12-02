package leetcode.strings;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        var result = LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring2("pwwkew");
        System.out.println(result);
    }

    //Time complexity : O(n3)
    public int lengthOfLongestSubstring(String s) {
        String result = "";
        for(int i = 0 ; i < s.length() ; i++) {
            for(int j = i + 1 ; j <= s.length() ; j++) {
                String sub = s.substring(i, j);
                if(isUnique(sub) && sub.length() > result.length()) {
                    result = sub;
                }
            }
        }
        return result.length();
    }

    private boolean isUnique(String str) {
        ArrayList<Character> list = new ArrayList<Character>();
        for(int i = 0 ; i < str.length() ; i++) {
            if(list.contains(str.charAt(i)))
                return false;
            list.add(str.charAt(i));
        }
        return true;
    }

    //pwwkew
    //i j
    //Time complexity : O(n)
    public static int lengthOfLongestSubstring2(String s) {
        int n = s.length();
        Set<Character> set = new HashSet<>();
        int ans = 0, i = 0, j = 0;
        while (i < n && j < n) {
            // try to extend the range [i, j]
            if (!set.contains(s.charAt(j))){
                set.add(s.charAt(j++));
                ans = Math.max(ans, j - i);
            } else {
                set.remove(s.charAt(i++));
            }
        }
        return ans;
    }

}
