package leetcode.arrays;

public class PairsofSongsWithTotalDurationsDivisibleby60 {
    public static void main(String[] args) {
        System.out.println(PairsofSongsWithTotalDurationsDivisibleby60.numPairsDivisibleBy60(new int[]{30,20,150,100,40}));
    }

    //[60,60,30,20,150,100,40]
    public static int numPairsDivisibleBy60(int[] time) {
        int[] arr = new int[60];
        int count = 0;
        for(int i : time) {
            if(i % 60 == 0)
                count += arr[0];
            else
                count += arr[60 - i % 60];
            arr[i % 60]++;
        }
        return count;
    }
}
