package leetcode.arrays;

public class ValidMountainArray {
    public boolean validMountainArray(int[] arr) {
        int index = 0;

        while(index < arr.length - 1 && arr[index] < arr[index + 1])
            index++;

        if(index == 0 || index == arr.length - 1)
            return false;

        while(index < arr.length - 1 && arr[index] > arr[index + 1])
            index++;

        return index == arr.length - 1;
    }
}
