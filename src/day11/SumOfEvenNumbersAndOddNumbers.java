package day11;
//Input (stdin)
//5
//2
//3
//6
//8
//-1
//
//Output (stdout)
//The sum of the even numbers in the array is 16
//The sum of the odd numbers in the array is 2
import java.util.Scanner;

public class SumOfEvenNumbersAndOddNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int total = 0;
		int total1 = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				total += arr[i];
			} else {
				total1 += arr[i];
			}
		}
		System.out.println("The sum of the even numbers in the array is " + total);
		System.out.print("The sum of the odd numbers in the array is " + total1);

	}

}
