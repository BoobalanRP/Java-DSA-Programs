package day10;
//SAMPLE INPUT:
//
//3
//
//3
//
//1
//2
//3
//1
//2
//3
//
//
//SAMPLE OUTPUT:
//
//Same


import java.util.Scanner;

public class SameorNot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int[] arr1 = new int[n1];
		int[] arr2 = new int[n2];
		for (int i = 0; i < n1; i++) {
			arr1[i] = sc.nextInt();
		}
		for (int i = 0; i < n1; i++) {
			arr2[i] = sc.nextInt();
		}
		boolean value = true;
		for (int i = 0; i < n1; i++) {

			if (arr1[i] == arr2[i]) {
				value = false;
			} else {
				value = true;
			}
		}
		if (value) {
			System.out.println("Not Same");
		} else {
			System.out.println("Same");
		}

	}

}
