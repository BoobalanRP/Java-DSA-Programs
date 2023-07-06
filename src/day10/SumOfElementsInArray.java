package day10;
//
//SAMPLE INPUT:
//
//	 3
//
//	 1
//
//	 2
//
//	 3
//
//
//
//	SAMPLE OUTPUT:
//
//	6
//


import java.util.Scanner;

public class SumOfElementsInArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int val = sc.nextInt();
		int[] array = new int[val];
		int value = 0;
		for (int i = 0; i < val; i++) {
			array[i] = sc.nextInt();
			value += array[i];

		}
		System.out.println(value);

	}

}
