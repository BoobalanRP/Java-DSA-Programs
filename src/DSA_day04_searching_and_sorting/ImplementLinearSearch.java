package DSA_day04_searching_and_sorting;

import java.util.Scanner;

public class ImplementLinearSearch {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int num = sc.nextInt();
		boolean value = false;
		int result = -1;
		for (int i = 0; i < n; i++) {
			if (num == arr[i]) {
				value = true;
				result = i;
			}
		}
		if (value) {
			System.out.println(result);
		} else {
			System.out.println(result);
		}

	}

}
//Input (stdin)
//4
//23 45 48 56
//56
//
//Output (stdout)
//3