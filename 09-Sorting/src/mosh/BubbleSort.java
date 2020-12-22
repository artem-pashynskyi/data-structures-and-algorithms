package mosh;

public class BubbleSort {
    public void sort(int[] array) {
        boolean isSorted;
        for(int i = 0 ; i < array.length ; i++) {
            isSorted = true;
            for(int j = 0 ; j < array.length-1-i; j++)
                if(array[j] >= array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    isSorted = false;
                }
            if(isSorted)
                return;
        }
    }
}
