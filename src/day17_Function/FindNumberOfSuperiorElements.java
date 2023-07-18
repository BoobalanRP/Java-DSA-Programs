package day17_Function;

import java.util.*;

class Superior {
	public static int FindNumberOfSuperiorElements(int[] arr, int n) {
		int superiorCount = 1;
		int maxElement = arr[n - 1];

		for (int i = n - 2; i >= 0; i--) {
			if (arr[i] > maxElement) {
				superiorCount++;
				maxElement = arr[i];
			}
		}

		return superiorCount;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		int result = FindNumberOfSuperiorElements(arr, n);
		System.out.println(result);
	}
}

//Input (stdin)
//6
//7 9 5 2 8 7
//
//Output (stdout)
//3