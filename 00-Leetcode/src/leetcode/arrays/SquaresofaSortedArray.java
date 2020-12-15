package leetcode.arrays;

public class SquaresofaSortedArray {
    /*
        Input: nums = [-4,-1,0,3,10]
        Output: [0,1,9,16,100]
        Explanation: After squaring, the array becomes [16,1,0,9,100].
        After sorting, it becomes [0,1,9,16,100].
     */
    public int[] sortedSquares(int[] nums) {
        for(int i = 0 ; i < nums.length ; i++) {
            nums[i] = nums[i] * nums[i];
        }
        for(int i = 0 ; i < nums.length ; i++) {
            for(int j = i + 1 ; j < nums.length ; j++) {
                if(nums[j] < nums[i]) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        return nums;
    }
}
