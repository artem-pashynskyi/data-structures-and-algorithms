package mosh;

public class QuickSort {

    public void sort(int[] array) {
        sort(array, 0, array.length - 1);
    }

    //{15,6,3,1,22,10,13}
  //b  i               p
    private void sort(int[] array, int start, int end) {
        if(start >= end)
            return;

        int boundary = partition(array, start, end);

        sort(array, start, boundary - 1);
        sort(array, boundary + 1, end);
    }

    private int partition(int[] array, int start, int end) {
        int boundary = start - 1;
        int pivot = array[end];
        for(int i = start; i <= end; i++)
            if(array[i] <= pivot) {
                boundary++;
                int temp = array[i];
                array[i] = array[boundary];
                array[boundary] = temp;
            }
        return boundary;
    }
}
