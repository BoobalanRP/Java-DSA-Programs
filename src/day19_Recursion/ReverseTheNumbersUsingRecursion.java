package day19_Recursion;

import java.util.Scanner;

public class ReverseTheNumbersUsingRecursion {

	public static void reverseArray(int[] arr, int num) {
		if (num == 0) {
			return;
		}

		System.out.print(arr[num - 1] + " ");

		reverseArray(arr, num - 1);
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int[] arr = new int[n1];
		for (int i = 0; i < n1; i++) {
			arr[i] = sc.nextInt();
		}

		reverseArray(arr, n1);
	}

}

//Input (stdin)
//7
//1092 4888 881 9101 1617 2643 8305
//
//Output (stdout)
//8305 2643 1617 9101 881 4888 1092