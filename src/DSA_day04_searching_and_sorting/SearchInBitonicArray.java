package DSA_day04_searching_and_sorting;

import java.util.*;

class SearchInBitonicArray {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] array = new int[n];
		for (int i = 0; i < n; i++) {
			array[i] = sc.nextInt();
		}
		int val = -1;
		Arrays.sort(array);
		for (int i = 1; i <= n; i++) {
			if (array[i - 1] == m) {
				val = i - 1;
			}
		}
		System.out.println(val);
	}
}

//
//Input (stdin)
//5 21
//-12 15 23 21 10
//
//Output (stdout)
//3
//
//Input (stdin)
//4 10
//-10 -8 5 1
//
//Output (stdout)
//-1