package day18_Recursion;

import java.util.Scanner;

class EvenMain {
	public static int SumOfTheEvenNumberInArray(int[] arr1, int val, int index) {

		if (val == 0) {
			return 0;
		} else {
			if (arr1[index] % 2 == 0) {
				return arr1[index] + SumOfTheEvenNumberInArray(arr1, val - 1, index + 1);
			} else {
				return SumOfTheEvenNumberInArray(arr1, val - 1, index + 1);
			}
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
		int sum = SumOfTheEvenNumberInArray(arr, n, inde);
		System.out.print("Sum of even numbers " + sum);
	}
}

//
//Input (stdin)
//4
//23
//54
//67
//98
//
//Output (stdout)
//Sum of even numbers 152
