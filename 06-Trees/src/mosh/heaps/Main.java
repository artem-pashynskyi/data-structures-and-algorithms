package mosh.heaps;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        var heap = new Heap();
        heap.insert(10);
        heap.insert(5);
        heap.insert(17);
        heap.insert(4);
        heap.insert(22);
        heap.remove();
        System.out.println("Done");

        System.out.println("***Heap Sort***");
        int[] numbers = {5,3,10,1,4,2};
        Heap heap2 = new Heap();
        for(int number : numbers)
            heap2.insert(number);
        for(int i = numbers.length - 1 ; i >= 0 ; i--)
            numbers[i] = heap2.remove();
        System.out.println(Arrays.toString(numbers));

        //***Exercises***
        System.out.println("***heapify***");
        int[] numbers2 = {5,3,8,4,1,2};
        Exercises.heapify(numbers2);
        System.out.println(Arrays.toString(numbers2));

        System.out.println("***kthLargestNumber***");
        int[] numbers3 = {5,3,8,4,1,2};
        System.out.println(Exercises.getKthLargestNumber(numbers3, 2));
    }
}
