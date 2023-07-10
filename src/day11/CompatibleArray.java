package day11;
//Input (stdin)
//5
//2
//3
//6
//8
//1
//5
//1
//1
//1
//1
//2
//
//Output (stdout)
//Incompatible

import java.util.Scanner;

public class CompatibleArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int[] arr1 = new int[n1];
		for (int i = 0; i < n1; i++) {
			arr1[i] = sc.nextInt();
		}

		int n2 = sc.nextInt();
		int[] arr2 = new int[n2];
		for (int i = 0; i < n2; i++) {
			arr2[i] = sc.nextInt();
		}
		boolean condition = false;
		if (arr1.length == arr2.length) {
			for (int i = 0; i < arr1.length; i++) {
				if (arr1[i] >= arr2[i]) {
					condition = true;
				} else {
					condition = false;
				}
			}
		}
		if (condition) {
			System.out.print("Compatible");
		} else {
			System.out.print("Incompatible");
		}

	}

}
