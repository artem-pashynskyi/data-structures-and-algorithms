package course;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        var array = new int[] {8,2,4,1,3};
        System.out.println("***Bubble Sort***");
        System.out.println(Arrays.toString(MyBubbleSort.sort(array)));
        var array2 = new int[] {8,2,4,1,3};
        System.out.println("***Selection Sort***");
        System.out.println(Arrays.toString(MySelectionSort.sort(array2)));
        var array3 = new int[] {8,2,4,1,3};
        System.out.println("***Insertion Sort***");
        System.out.println(Arrays.toString(MyInsertionSort.sort(array3)));
        var array4 = new int[] {8,2,4,1,3};
        System.out.println("***Merge Sort***");
        MyMergeSort myMergeSort = new MyMergeSort();
        myMergeSort.sort(array4);
        System.out.println(Arrays.toString(array4));
    }
}
