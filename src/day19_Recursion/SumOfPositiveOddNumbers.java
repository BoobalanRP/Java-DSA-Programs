package day19_Recursion;

import java.util.Scanner;

public class SumOfPositiveOddNumbers {

	public static int sumOfArray(int arr[], int n2) {
		if (n2 == 0) {
			return 0;
		}

		int sum = 0;
		if (arr[n2 - 1] % 2 == 1) {
			sum += arr[n2 - 1];
		}

		return sum + sumOfArray(arr, n2 - 1);
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int[] arr = new int[n1];
		for (int i = 0; i < n1; i++) {
			arr[i] = sc.nextInt();
		}

		int val = sumOfArray(arr, n1);
		System.out.print("Sum = " + val);
	}

}

//Input (stdin)
//5
//1 2 3 4 5
//
//Output (stdout)
//Sum = 9
