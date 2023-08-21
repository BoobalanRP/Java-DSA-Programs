package DSA_day02_searching_and_sorting;

public class MergeSort {
    public static void main(String args[]) {
        int[] array = {8, 2, 5, 3, 4, 7, 6, 1};
        mergeSort(array);
        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
    private static void mergeSort(int[] array) {
        int length = array.length;
        if (length <= 1) return; // Base case
        int middle = length / 2;
        int[] leftArray = new int[middle];
        int[] rightArray = new int[length - middle];
        int i = 0; // Index for leftArray
        int j = 0; // Index for rightArray
        // Split the array into leftArray and rightArray
        for (; i < length; i++) {
            if (i < middle) {
                leftArray[i] = array[i];
            } else {
                rightArray[j] = array[i];
                j++;
            }
        }
        
        
        mergeSort(leftArray); // Recursively sort leftArray
        mergeSort(rightArray); // Recursively sort rightArray
        merge(leftArray, rightArray, array); // Merge the sorted leftArray and rightArray
    }
    private static void merge(int[] leftArray, int[] rightArray, int[] array) {
        int leftSize = leftArray.length;
        int rightSize = rightArray.length;
        int i = 0, l = 0, r = 0; // Indices
        // Merge the sorted leftArray and rightArray
        while (l < leftSize && r < rightSize) {
            if (leftArray[l] < rightArray[r]) {
                array[i] = leftArray[l];
                i++;
                l++;
            } else {
                array[i] = rightArray[r];
                i++;
                r++;
            }
        }
        // Copy any remaining elements from leftArray and rightArray
        while (l < leftSize) {
            array[i] = leftArray[l];
            i++;
            l++;
        }
        while (r < rightSize) {
            array[i] = rightArray[r];
            i++;
            r++;
        }
    }
}