package freshwork_interview;

import java.util.Scanner;

public class MinimumNumberOfOperations {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = "aabbs";
		String b = "bbaas";
		char[] arr1 = a.toCharArray();
		char[] arr2 = b.toCharArray();

		int count = 0, n = Math.min(a.length(), b.length());

		for (int i = 0; i < n; i++) {
			if (arr1[i] != arr2[i]) {
				int k = i;
				while (k < a.length() - 1 && arr1[k] != arr2[i]) {
					char temp = arr1[k];
					arr1[k] = arr1[k + 1];
					arr1[k + 1] = temp;
					k++;
					count++;
				}

			}
		}

		count += Math.abs(a.length() - b.length());

		System.out.println(count);

	}

}
