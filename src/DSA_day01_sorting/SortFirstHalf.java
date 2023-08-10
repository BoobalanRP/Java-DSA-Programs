package DSA_day01_sorting;

import java.util.Scanner;

public class SortFirstHalf {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int middle = 0;
		if (n % 2 == 0) {
			middle = n / 2;
		} else {
			middle = (n / 2) + 1;
		}
		for (int i = 0; i < middle - 1; i++) {
			for (int j = 0; j < middle - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}

		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}

//Input (stdin)
//5
//5 4 3 2 1
//
//Output (stdout)
//3 4 5 2 1