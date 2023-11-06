package dsa_day01_sorting;

import java.util.*;
import java.util.Scanner;

public class MergeSortedArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		List<Integer> arr1 = new ArrayList<Integer>();
		List<Integer> arr2 = new ArrayList<Integer>();
		for (int i = 0; i < num; i++) {
			arr1.add(sc.nextInt());
		}
		int num2 = sc.nextInt();
		for (int i = 0; i < num2; i++) {
			arr2.add(sc.nextInt());
		}
		arr1.addAll(arr2);
		Collections.sort(arr1);
		for (int i : arr1) {
			System.out.print(i + " ");
		}
	}

}

//Input (stdin)
//2
//1
//3
//2
//0
//9
//
//Output (stdout)
//0 1 3 9


//import java.util.Scanner;
//import java.util.Arrays;
//import java.util.HashMap;
//
//public class Main
//{
//	public static void main(String[] args) {
//	    Scanner sc = new Scanner(System.in);
//		int n1 = sc.nextInt();
//		int []arr1 = new int[n1];
//		for(int i=0;i<n1;i++){
//		    arr1[i] = sc.nextInt();
//		}
//		int n2 = sc.nextInt();
//		int []arr2 = new int[n2];
//		for(int i=0;i<n2;i++){
//		    arr2[i] = sc.nextInt();
//		}
//		int[] arr3 = new int[n1+n2];
//		
//		int i = 0, j = 0, k = 0;
//        while (i<n1 && j <n2){
//            if (arr1[i] < arr2[j])
//                arr3[k++] = arr1[i++];
//            else
//                arr3[k++] = arr2[j++];
//        }
//        while (i < n1)
//            arr3[k++] = arr1[i++];
//        while (j < n2)
//            arr3[k++] = arr2[j++];
//		
//		for(int z=0;z<n1+n2;z++){
//		    System.out.print(arr3[z] + " ");
//		}
//	}
//}


//import java.util.Scanner;
//
//public class Main {
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        int m = sc.nextInt();
//        int[] arr1 = new int[m];
//        for (int i = 0; i < m; i++) {
//            arr1[i] = sc.nextInt();
//        }
//
//        int n = sc.nextInt();
//        int[] arr2 = new int[n];
//        for (int i = 0; i < n; i++) {
//            arr2[i] = sc.nextInt();
//        }
//
//        int[] mergedArray = mergeSortedArrays(arr1, arr2);
//
//        for (int i = 0; i < mergedArray.length; i++) {
//            System.out.print(mergedArray[i]);
//            if (i < mergedArray.length - 1) {
//                System.out.print(" ");
//            }
//        }
//
//        sc.close();
//    }
//
//    static int[] mergeSortedArrays(int[] arr1, int[] arr2) {
//        int m = arr1.length;
//        int n = arr2.length;
//        int[] merged = new int[m + n];
//
//        int i = 0, j = 0, k = 0;
//
//        while (i < m && j < n) {
//            if (arr1[i] <= arr2[j]) {
//                merged[k++] = arr1[i++];
//            } else {
//                merged[k++] = arr2[j++];
//            }
//        }
//
//        while (i < m) {
//            merged[k++] = arr1[i++];
//        }
//
//        while (j < n) {
//            merged[k++] = arr2[j++];
//        }
//
//        return merged;
//    }
//}



//public class Main {
//    public static void main(String args[]) {
//        int[] array = {8, 2, 5, 3, 4, 7, 6, 1};
//        mergeSort(array);
//        for(int i = 0; i < array.length; i++) {
//            System.out.print(array[i] + " ");
//        }
//    }
//    private static void mergeSort(int[] array) {
//        int length = array.length;
//        if (length <= 1) return; // Base case
//        int middle = length / 2;
//        int[] leftArray = new int[middle];
//        int[] rightArray = new int[length - middle];
//        int i = 0; // Index for leftArray
//        int j = 0; // Index for rightArray
//        // Split the array into leftArray and rightArray
//        for (; i < length; i++) {
//            if (i < middle) {
//                leftArray[i] = array[i];
//            } else {
//                rightArray[j] = array[i];
//                j++;
//            }
//        }
//        mergeSort(leftArray); // Recursively sort leftArray
//        mergeSort(rightArray); // Recursively sort rightArray
//        merge(leftArray, rightArray, array); // Merge the sorted leftArray and rightArray
//    }
//    private static void merge(int[] leftArray, int[] rightArray, int[] array) {
//        int leftSize = leftArray.length;
//        int rightSize = rightArray.length;
//        int i = 0, l = 0, r = 0; // Indices
//        // Merge the sorted leftArray and rightArray
//        while (l < leftSize && r < rightSize) {
//            if (leftArray[l] < rightArray[r]) {
//                array[i] = leftArray[l];
//                i++;
//                l++;
//            } else {
//                array[i] = rightArray[r];
//                i++;
//                r++;
//            }
//        }
//        // Copy any remaining elements from leftArray and rightArray
//        while (l < leftSize) {
//            array[i] = leftArray[l];
//            i++;
//            l++;
//        }
//        while (r < rightSize) {
//            array[i] = rightArray[r];
//            i++;
//            r++;
//        }
//    }
//}


 class Main {
    public static void merge(int[] a, int start, int mid, int end) {
        int i = start, j = mid + 1, k = start;
        int[] array = new int[a.length];
        
        while (i <= mid && j <= end) {
            if (a[i] < a[j]) {
                array[k++] = a[i++];
            } else {
                array[k++] = a[j++];
            }
        }
        while (i <= mid) {
            array[k++] = a[i++];
        }
        while (j <= end) {
            array[k++] = a[j++];
        }
        
        for (int y = start; y <= end; y++) {
            a[y] = array[y];
        }
    }

    public static void merge_sort(int[] a, int start, int end) {
        if (start < end) {
            int mid = (start + end) / 2;
            merge_sort(a, start, mid);
            merge_sort(a, mid + 1, end);
            merge(a, start, mid, end);
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a[] = new int[n];

        for (int i = 0; i < n; i++)
            a[i] = s.nextInt();
        
        // Merge Sort
        merge_sort(a, 0, n - 1);
        
        for (int y = 0; y < n; y++) {
            System.out.print(a[y] + " "); // Print with a space separator
        }
    }
}

 