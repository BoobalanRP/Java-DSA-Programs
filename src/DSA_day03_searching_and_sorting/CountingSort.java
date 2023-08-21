package DSA_day03_searching_and_sorting;

import java.util.*;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int max = 0;
		for (int i = 0; i < n; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		int stepOne[] = new int[max + 1];
		for (int i = 0; i < n; i++) {
			stepOne[arr[i]]++;
		}

		for (int i = 1; i <= max; i++) {
			stepOne[i] = stepOne[i - 1] + stepOne[i];
		}

		int finalArray[] = new int[n];
		for (int i = 0; i < n; i++) {

			finalArray[stepOne[arr[i]] - 1] = arr[i];
			stepOne[arr[i]] = stepOne[arr[i]] - 1;
		}
		for (int i = 0; i < n; i++) {
			System.out.print(finalArray[i] + " ");
		}

	}
}

//Input (stdin)
//13
//1 1 8 3 4 6 2 9 2 3 5 6 2
//
//Output (stdout)
//1 1 2 2 2 3 3 4 5 6 6 8 9