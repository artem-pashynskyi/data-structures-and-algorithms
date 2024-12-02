package leetcode.integers;

public class CanPlaceFlowers {

    public static void main(String[] args) {
        System.out.println(canPlaceFlowers(new int[]{1,0,0,0,1}, 1));
    }

    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int emptySlots = 0;
        for(int i = 0 ; i < flowerbed.length ; i++) {
            if(flowerbed[i] == 0
                    && (i == 0 || flowerbed[i-1] == 0)
                    && (i == flowerbed.length-1 || flowerbed[i+1] == 0)) {
                emptySlots++;
                i++;
            }
        }
        return emptySlots >= n;
    }
}
