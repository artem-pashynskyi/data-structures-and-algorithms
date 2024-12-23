package mosh;

public class Search {

    public int linearSearch(int[] array, int target) {
        for (int i = 0; i < array.length; i++)
            if(array[i] == target)
                return i;
        return -1;
    }

    public int binarySearchRec(int[] array, int target) {
        return binarySearchRec(array, target, 0, array.length - 1);
    }

    private int binarySearchRec(int[] array, int target, int left, int right) {
        if(right < left)
            return -1;
        int middle = (left + right) / 2;
        if(array[middle] == target)
            return middle;
        if(array[middle] > target)
            return binarySearchRec(array, target, left, middle - 1);
        return binarySearchRec(array, target, middle + 1, right);
    }

    public int binarySearchIter(int[] array, int target) {
        int left = 0;
        int right = array.length-1;
        while (left <= right) {
            int middle = (left + right) / 2;
            if(target == array[middle])
                return middle;
            if(target < array[middle])
                right = middle-1;
            else if(target > array[middle])
                left = middle+1;
        }
        return -1;
    }

    public int ternarySearchRec(int[] array, int target) {
        return ternarySearchRec(array, target, 0, array.length - 1);
    }

    private int ternarySearchRec(int[] array, int target, int left, int right) {
        if(left > right)
            return -1;
        int partitionSize = (right - left) / 3;
        int mid1 = left + partitionSize;
        int mid2 = right - partitionSize;
        if(array[mid1] == target)
            return mid1;
        if(array[mid2] == target)
            return mid2;
        if(target < array[mid1])
            return ternarySearchRec(array, target, left, mid1 - 1);
        if(target > array[mid2])
            return ternarySearchRec(array, target, mid2 + 1, right);
        return ternarySearchRec(array, target, mid1 + 1, mid2 - 1);
    }

    //{1,3,5,6,7,8,10,15,17}
    public int jumpSearch(int[] array, int target) {
        int blockSize = (int) Math.sqrt(array.length);
        int start = 0;
        int next = blockSize;
        while (start < array.length && array[next - 1] < target) {
            start = next;
            next += blockSize;
            if(next > array.length)
                next = array.length;
        }
        for (int i = start; i < next; i++)
            if(array[i] == target)
                return i;
        return -1;
    }

    public int exponentialSearch(int[] array, int target) {
        int bound = 1;
        while (bound < array.length && array[bound] < target)
            bound *= 2;
        int left = bound / 2;
        int right = Math.min(bound, array.length - 1);
        return binarySearchRec(array, target, left, right);
    }

}
