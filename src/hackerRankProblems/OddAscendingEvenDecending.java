package hackerRankProblems;

import java.util.Collections;
import java.util.*;
import java.util.Scanner;

public class OddAscendingEvenDecending {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] mat = new int[n];

		for (int i = 0; i < n; i++) {
			mat[i] = sc.nextInt();
		}

		List<Integer> arr1 = new ArrayList<Integer>();
		List<Integer> arr2 = new ArrayList<Integer>();

		for (int i = 0; i < mat.length; i++) {
			if (mat[i] % 2 == 0) {
				arr1.add(mat[i]);
			} else {
				arr2.add(mat[i]);
			}
		}

		Collections.sort(arr1, Collections.reverseOrder());
		Collections.sort(arr2);

		for (int i : arr2) {
			System.out.print(i + " ");
		}
		for (int i : arr1) {
			System.out.print(i + " ");
		}

	}

}
