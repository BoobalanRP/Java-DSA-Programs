package day10;
//Sample Input 1:

//5
//1
//2
//3
//3
//4
//
//
//Sample Output 1:
//
//There are 4 distinct elements in the array.

import java.util.Scanner;

public class FindDistinctNumbersInArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		int count = 0;
		for (int i = 0; i < n; i++) {
			boolean isDistinct = true;
			for (int j = i + 1; j < n; j++) {
				if (arr[i] == arr[j]) {
					isDistinct = false;
					break;
				}
			}
			if (isDistinct) {
				count++;
			}
		}

		System.out.print("There are " + count + " distinct element in the array.");
	}

}
