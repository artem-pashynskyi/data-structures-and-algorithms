package mosh;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("***Bubble Sort***");
        int[] array = new int[]{7,3,1,4,6,2,3};
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.sort(array);
        System.out.println(Arrays.toString(array));

        System.out.println("***Selection Sort***");
        int[] array2 = new int[]{7,3,1,4,6,2,3};
        SelectionSort selectionSort = new SelectionSort();
        selectionSort.sort(array2);
        System.out.println(Arrays.toString(array2));

        System.out.println("***Insertion Sort***");
        int[] array3 = new int[]{7,3,1,4,6,2,3};
        InsertionSort insertionSort = new InsertionSort();
        insertionSort.sort(array3);
        System.out.println(Arrays.toString(array3));

        System.out.println("***Merge Sort***");
        int[] array4 = new int[]{7,3,1,4,6,2,3};
        MergeSort mergeSort = new MergeSort();
        mergeSort.sort(array4);
        System.out.println(Arrays.toString(array4));

        System.out.println("***Quick Sort***");
        int[] array5 = new int[]{7,3,1,4,6,2,3};
        QuickSort quickSort = new QuickSort();
        quickSort.sort(array5);
        System.out.println(Arrays.toString(array5));

        System.out.println("***Counting Sort***");
        int[] array6 = new int[]{5,1,7,2,6,4};
        CountingSort countingSort = new CountingSort();
        countingSort.sort(array6, 7);
        System.out.println(Arrays.toString(array6));

        System.out.println("***Bucket Sort***");
        int[] array7 = new int[]{5,1,7,2,6,4};
        BucketSort bucketSort = new BucketSort();
        bucketSort.sort(array7, 3);
        System.out.println(Arrays.toString(array7));
    }
}
