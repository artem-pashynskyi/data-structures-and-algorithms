package mosh;

public class Main {
    public static void main(String[] args) {
        System.out.println(StringUtils.countVowels("Hello world!"));
        System.out.println(StringUtils.reverse("World"));
        System.out.println(StringUtils.reverseWords("Trees are beautiful"));
        System.out.println(StringUtils.areRotations("ABCD", "BCDA"));
        System.out.println(StringUtils.removeDuplicates("Trees are beautiful"));
        System.out.println(StringUtils.getMaxOccuringCharUsingHashTable("Trees are beautiful"));
        System.out.println(StringUtils.getMaxOccuringCharUsingASCIIArray("Trees are beautiful"));
        System.out.println(StringUtils.capitalize("today is a great day"));
        System.out.println(StringUtils.areAnagramsUsingSorting("ABCD", "DBCA"));
        System.out.println(StringUtils.areAnagramsUsingCount("ABCD", "DBCA"));
        System.out.println(StringUtils.areAnagramsUsingStringBuilder("ABCD", "DBCA"));
        System.out.println(StringUtils.isPalindrome("level"));
    }
}
