package leetcode.strings;

public class LongestPalindromicSubstring {
    public static void main(String[] args) {
        LongestPalindromicSubstring longestPalindromicSubstring = new LongestPalindromicSubstring();
        System.out.println(longestPalindromicSubstring.longestPalindrome("adrleveltff"));
    }

    int start;
    int palindromeLength;

    //Ex: adrleveltff
    public String longestPalindrome(String string) {
        int strLength = string.length();
        if(strLength < 2)
            return string;
        for(int i = 0 ; i < strLength ; i++) {
            checkPalindrome(string, i, i);
            checkPalindrome(string, i, i + 1);
        }
        return string.substring(start, start + palindromeLength);
    }

    private void checkPalindrome(String string, int begin, int end) {
        while (begin >= 0 && end < string.length() && string.charAt(begin) == string.charAt(end)) {
            begin--;
            end++;
        }
        if(palindromeLength < end - begin - 1) {
            start = begin + 1;
            palindromeLength = end - begin - 1;
        }
    }

}
