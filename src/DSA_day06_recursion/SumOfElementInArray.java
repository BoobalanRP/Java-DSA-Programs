package DSA_day06_recursion;

import java.util.Scanner;

public class SumOfElementInArray {

	public static int sumOfElement(int arr[], int n) {
		if (n < 0) {
			return 0;
		} else {
			return arr[n] + sumOfElement(arr, n - 1);
		}
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int sum = sumOfElement(arr, n - 1);
		System.out.println("The sum of the elements in the array is " + sum);
	}
}

//Input (stdin)
//6
//2
//5
//7
//1
//4
//2
//
//Output (stdout)
//The sum of the elements in the array is 21