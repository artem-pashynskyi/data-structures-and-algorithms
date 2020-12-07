package mosh.heaps;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Exercises {

    public static void heapify(int[] array) {
        for(int i = 0 ; i < array.length / 2 - 1 ; i++)
            heapify(array, i);
    }

    private static void heapify(int[] array, int index) {
        int largestIndex = index;

        int leftIndex = index * 2 + 1;
        if(leftIndex < array.length && array[leftIndex] > array[largestIndex])
            largestIndex = leftIndex;

        int rightIndex = index * 2 + 2;
        if(rightIndex < array.length && array[rightIndex] > array[largestIndex])
            largestIndex = rightIndex;

        if(index == largestIndex)
            return;

        int temp = array[index];
        array[index] = array[largestIndex];
        array[largestIndex] = temp;

        heapify(array, largestIndex);
    }

    public static int getKthLargestNumber(int[] arr, int k) {
        PriorityQueue<Integer> heap = new PriorityQueue<>(Comparator.reverseOrder());
        for(int i : arr)
            heap.add(i);
        for(int i = 0 ; i < k-1 ; i++)
            heap.remove();
        if(heap.isEmpty())
            return -1;
        return heap.remove();
    }

}
