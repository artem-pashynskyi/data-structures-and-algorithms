package leetcode.arrays;

public class RemoveDuplicatesfromSortedArrayII {

    public int removeDuplicates(int[] nums) {
        if(nums == null)
            return 0;
        if(nums.length < 2)
            return nums.length;

        int first = 1;
        int second = 2;

        //[1,1,1,2,2,3,3]
        //   i j

        while(second < nums.length) {
            if(nums[second] == nums[first] && nums[second] == nums[first - 1])
                second++;
            else {
                first++;
                nums[first] = nums[second];
                second++;
            }
        }
        return first + 1;
    }
}
