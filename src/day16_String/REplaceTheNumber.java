package day16_String;

import java.util.Scanner;

public class REplaceTheNumber {

	public static void main(String[] args) {
		int[] arr = { 4, 5, 6, 7, 4, 7, 8, 1 };
		int[] arr2 = new int[arr.length - 1];
		Scanner sc = new Scanner(System.in);
		int val = sc.nextInt();
		int num = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == val) {
				num = i;
				break;
			}
		}

		int arr2Index = 0;

		for (int j = 0; j < arr.length; j++) {
			if (num == j) {
				continue;
			} else {
				arr2[arr2Index] = arr[j];
				arr2Index++;
			}
		}

		for (int j = 0; j < arr2.length; j++) {
			System.out.println(arr2[j]);
		}

	}

}
