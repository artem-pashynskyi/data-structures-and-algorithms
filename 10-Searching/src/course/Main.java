package course;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[]{1,2,3,4,5,6,89,100,110,111,112};
        System.out.println("***binarySearchRec***");
        System.out.println(MyBinarySearchRec.binarySearchRec(array, 112));
        System.out.println("***binarySearchIter***");
        System.out.println(MyBinarySearchIter.binarySearchIter(array, 112));
        System.out.println("***ternarySearch***");
        System.out.println(MyTernarySearch.ternarySearch(array, 112));
        System.out.println("***jumpSearch***");
        System.out.println(MyJumpSearch.jumpSearch(array, 112));
        System.out.println("***exponentialSearch***");
        System.out.println(MyExponentialSearch.exponentialSearch(array, 1));
    }
}
