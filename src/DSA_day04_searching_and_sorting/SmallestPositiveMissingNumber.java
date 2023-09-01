package dsa_day04_searching_and_sorting;

import java.util.Scanner;

public class SmallestPositiveMissingNumber {

	static int solution(int[] A) {
		int n = A.length;
		// Let this 1e6 be the maximum element provided in
		// the array;
		int N = 1000010;

		// To mark the occurrence of elements
		boolean[] present = new boolean[N];

		int maxele = Integer.MIN_VALUE;

		// Mark the occurrences
		for (int i = 0; i < n; i++) {

			// Only mark the required elements
			// All non-positive elements and the elements
			// greater n + 1 will never be the answer
			// For example, the array will be {1, 2, 3} in
			// the worst case and the result will be 4 which
			// is n + 1
			if (A[i] > 0 && A[i] <= n)
				present[A[i]] = true;

			// find the maximum element so that if all the
			// elements are in order can directly return the
			// next number
			maxele = Math.max(maxele, A[i]);
		}

		// Find the first element which didn't
		// appear in the original array
		for (int i = 1; i < N; i++)
			if (!present[i])
				return i;

		// If the original array was of the
		// type {1, 2, 3} in its sorted form
		return maxele + 1;
	}

	// Driver Code
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println(solution(arr));
	}

}

//import java.util.*;
//
//class Main {
//    public static void main(String args[]) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int arr[] = new int[n];
//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//        }
//        
//        int result = findSmallestMissing(arr, n);
//        System.out.println(result);
//    }
//    
//    public static int findSmallestMissing(int arr[], int n) {
//        for (int i = 0; i < n; i++) {
//            while (arr[i] > 0  && arr[i] != arr[arr[i] - 1]) {
//                int temp = arr[i];
//                arr[i] = arr[temp - 1];
//                arr[temp - 1] = temp;
//            }
//        }
//        
//        for (int i = 0; i < n; i++) {
//            if (arr[i] != i + 1) {
//                return i + 1;
//            }
//        }
//        
//        return n + 1;
//    }
//}
