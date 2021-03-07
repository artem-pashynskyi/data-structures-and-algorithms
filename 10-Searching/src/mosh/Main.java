package mosh;

public class Main {
    public static void main(String[] args) {
        Search search = new Search();
        int[] numbers = {7,1,3,6,5};
        int[] numbersSorted = {1,3,5,6,7};

        System.out.println("***Linear Search***");
        System.out.println(search.linearSearch(numbers, 7));

        System.out.println("***Binary Search Recursive***");
        System.out.println(search.binarySearchRec(numbersSorted, 3));

        System.out.println("***Binary Search Iterative***");
        System.out.println(search.binarySearchIter(numbersSorted, 7));

        System.out.println("***Ternary Search***");
        System.out.println(search.ternarySearchRec(numbersSorted, 5));

        System.out.println("***Jump Search***");
        System.out.println(search.jumpSearch(numbersSorted, 7));

        System.out.println("***Exponential Search***");
        System.out.println(search.exponentialSearch(numbersSorted, 7));
    }
}
