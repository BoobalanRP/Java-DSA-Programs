package day10;
//Input (stdin)

//3
//4
//5
//6
//
//Output (stdout)
//The sum of the even numbers in the array is 10

import java.util.Scanner;

public class SumOfEvenNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int total = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				total += arr[i];
			}
		}
		System.out.print("The sum of the even numbers in the array is " + total);

	}

}
