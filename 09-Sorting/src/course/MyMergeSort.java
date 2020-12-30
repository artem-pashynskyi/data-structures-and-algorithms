package course;

public class MyMergeSort {

    public void sort(int[] array) {
        if(array.length < 2)
            return;
        int middle = array.length / 2;

        int[] leftArray = new int[middle];
        for(int i = 0; i < middle; i++)
            leftArray[i] = array[i];

        int[] rightArray = new int[array.length - middle];
        for (int i = middle; i < array.length; i++)
            rightArray[i - middle] = array[i];

        sort(leftArray);
        sort(rightArray);

        merge(leftArray, rightArray, array);
    }

    private void merge(int[] left, int[] right, int[] result) {
        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {
            if(left[i] <= right[j])
                result[k++] = left[i++];
            else
                result[k++] = right[j++];
        }

        while (i < left.length)
            result[k++] = left[i++];

        while (j < right.length)
            result[k++] = right[j++];
    }

}
