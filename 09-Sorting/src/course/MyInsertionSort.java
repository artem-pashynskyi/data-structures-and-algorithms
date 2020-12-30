package course;

public class MyInsertionSort {
    //{8,4,2,1,3}
    //     j i
    public static int[] sort(int[] array) {
        for(int i = 1; i < array.length; i++) {
            int current = array[i];
            int j = i - 1;
            while(j >= 0 && array[j] > current) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = current;
        }
        return array;
    }

}
