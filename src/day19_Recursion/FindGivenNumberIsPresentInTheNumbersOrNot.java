package day19_Recursion;

import java.util.Scanner;

public class FindGivenNumberIsPresentInTheNumbersOrNot {

	public static boolean NumberPresent(int arr1[], int a1, int a2) {
		if (a1 < 0) {
			return false;
		}

		if (arr1[a1] == a2) {
			return true;
		} else {
			return NumberPresent(arr1, a1 - 1, a2);
		}
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();

		int[] arr = new int[n1];
		for (int i = 0; i < n1; i++) {
			arr[i] = sc.nextInt();
		}
		int n2 = sc.nextInt();
		boolean val = NumberPresent(arr, n1 - 1, n2);

		if (val) {
			System.out.println(n2);
		} else {
			System.out.println("The number is not present in the list");
		}
	}
}
