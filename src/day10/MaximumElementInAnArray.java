package day10;

import java.util.Arrays;
import java.util.Scanner;
//Sample Input 1:
//
//5
//
//2
//
//3
//
//6
//
//8
//
//1
//
//
//
//Sample Output 1:
//
//8 is the maximum element in the array
public class MaximumElementInAnArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int val = sc.nextInt();
		int[] array = new int[val];

		for (int i = 0; i < val; i++) {
			array[i] = sc.nextInt();
		}
		for (int i = 0; i < val; i++) {
			for (int j = i + 1; j < val; j++) {
				if (array[i] > array[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		int value = array[array.length - 1];

//		int value = Arrays.stream(array).max().getAsInt();
		System.out.print(value + " is the maximum element in the array");
	}

}
