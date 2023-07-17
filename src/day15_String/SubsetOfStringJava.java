package day15_String;

import java.util.*;

public class SubsetOfStringJava {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String a = input.nextLine().toLowerCase();
		int n = a.length();
		int l = (n * (n + 1)) / 2;
		String[] arr = new String[l];
		int count = 0;
		for (int k = 0; k < n; k++) {
			for (int i = 0, j = 1 + k; j <= n; i++, j++) {
				arr[count] = a.substring(i, j);
				count++;
			}
		}
		System.out.println("Sorted Substring");
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

}
//Input (stdin)
//java
//
//Output (stdout)
//Sorted Substring
//a
//a
//av
//ava
//j
//ja
//jav
//java
//v
//va