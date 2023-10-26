package dsa_day02_searching_and_sorting;

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


//import java.util.*;
//
//public class Main {
//    public static void merge(int[] a, int start, int mid, int end) {
//        int i = start, j = mid + 1, k = start;
//        int[] array = new int[a.length];
//        
//        while (i <= mid && j <= end) {
//            if (a[i] < a[j]) {
//                array[k++] = a[i++];
//            } else {
//                array[k++] = a[j++];
//            }
//        }
//        while (i <= mid) {
//            array[k++] = a[i++];
//        }
//        while (j <= end) {
//            array[k++] = a[j++];
//        }
//        
//        for (int y = start; y <= end; y++) {
//            a[y] = array[y];
//        }
//    }
//
//    public static void merge_sort(int[] a, int start, int end) {
//        if (start < end) {
//            int mid = (start + end) / 2;
//            merge_sort(a, start, mid);
//            merge_sort(a, mid + 1, end);
//            merge(a, start, mid, end);
//        }
//    }
//
//    public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);
//        int n = s.nextInt();
//        int a[] = new int[n];
//
//        for (int i = 0; i < n; i++)
//            a[i] = s.nextInt();
//        
//        // Merge Sort
//        merge_sort(a, 0, n - 1);
//        
//        for (int y = 0; y < n; y++) {
//            System.out.print(a[y] + " "); // Print with a space separator
//        }
//    }
//}