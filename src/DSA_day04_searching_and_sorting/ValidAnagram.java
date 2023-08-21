package DSA_day04_searching_and_sorting;

import java.util.*;

class ValidAnagram {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String w1 = sc.next();
		String w2 = sc.next();
		char[] arr1 = w1.toCharArray();
		char[] arr2 = w2.toCharArray();
		Arrays.sort(arr1);
		Arrays.sort(arr2);

		if (arr1.length == arr2.length) {
			boolean value = true;
			for (int i = 0; i < arr1.length; i++) {
				if (arr1[i] != arr2[i]) {
					value = false;
					break;
				}
			}
			if (value) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		} else {
			System.out.println("No");
		}
	}
}

//Input (stdin)
//anagram
//nagaram
//
//Output (stdout)
//Yes