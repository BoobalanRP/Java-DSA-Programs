package dsa_day02_searching_and_sorting;

import java.util.Arrays;
import java.util.Scanner;

public class AlternateSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		Arrays.sort(arr);
		int count = 0;
		int mid = (int) Math.ceil(n / 2);
		if (n % 2 == 1) {
			for (int i = 1; i < n; i += 2) {
				System.out.print(arr[arr.length - 1 - count] + " ");
				System.out.print(arr[count] + " ");
				count++;
			}
			System.out.print(arr[mid]);
		} else if (n % 2 == 0) {
			for (int i = 1; i <= n; i += 2) {
				System.out.print(arr[arr.length - 1 - count] + " ");
				System.out.print(arr[count] + " ");
				count++;
			}
		}

	}

}

//import java.util.Arrays;
//import java.util.Scanner;
//
//public class Main {
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        // Read the size of the array
//        int size = scanner.nextInt();
//
//        // Read the elements of the array
//        int[] array = new int[size];
//        for (int i = 0; i < size; i++) {
//            array[i] = scanner.nextInt();
//        }
//
//    
//
//        // Sort the array
//        Arrays.sort(array);
//
//        // Create an output array
//        int[] outputArray = new int[size];
//
//        // Fill the output array with first maximum and first minimum in alternating order
//        int start = 0;
//        int end = size - 1;
//        for (int i = 0; i < size; i++) {
//            if (i % 2 == 0) {
//                outputArray[i] = array[end--];
//            } else {
//                outputArray[i] = array[start++];
//            }
//        }
//
//        // Print the output array
//        for (int num : outputArray) {
//            System.out.print(num + " ");
//        }
//    }
//}

//Input (stdin)
//6
//8 5 6 1 3 4
//
//Output (stdout)
//8 1 6 3 5 4
