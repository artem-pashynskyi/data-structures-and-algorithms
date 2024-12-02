package leetcode.arrays;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        var nums = new int[]{3,2,4};
        var target = 6;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }

    //[3,2,4]
    // 6
    //[1,2]
    public static int[] twoSum(int[] nums, int target) {
        var map = new HashMap<Integer, Integer>();
        var size = nums.length;

        for(int i = 0; i < size; i++) {
            map.put(nums[i], i);
        }

        for(int i = 0; i < size; i++) {
            var temp = target - nums[i];
            if(map.containsKey(temp) && map.get(temp) != i) {
                return new int[] {i, map.get(temp)};
            }
        }

        return new int[0];
    }
}
