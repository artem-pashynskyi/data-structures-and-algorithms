package course;

public class MyBubbleSort {
    public static int[] sort(int[] array) {
        for(int i = 0; i < array.length; i++) {
            boolean isSorted = false;
            for(int j = 0; j < array.length - 1 - i; j++) {
                if(array[j] >= array[j + 1]) {
                    swap(array, j, j+1);
                    isSorted = true;
                }
            }
            if(!isSorted)
                return array;
        }
        return array;
    }

    private static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

}
