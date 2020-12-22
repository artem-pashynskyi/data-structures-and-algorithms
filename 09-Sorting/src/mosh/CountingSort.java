package mosh;

public class CountingSort {
    //{5,1,7,2,6,4}
    public void sort(int[] array, int max) {
        int[] counts = new int[max + 1];
        for(int item : array)
            counts[item]++;

        int k = 0;
        for(int i = 0; i < counts.length; i++)
            for(int j = 0; j < counts[i]; j++)
                array[k++] = i;
    }
}
