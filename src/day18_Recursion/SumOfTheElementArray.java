package day18_Recursion;

import java.util.Scanner;

class ArrayMain {
	public static int SumOfTheElementArray(int[] arr1, int val, int index) {

		if (val == 0) {
			return 0;
		} else {
			return arr1[index] + SumOfTheElementArray(arr1, val - 1, index + 1);
		}

	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		int inde = 0;
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int sum = SumOfTheElementArray(arr, n, inde);

		System.out.print("The sum of the elements in the array is " + sum);

	}
}

//Input (stdin)
//6
//2
//5
//7
//1
//4
//2
//
//Output (stdout)
//The sum of the elements in the array is 21