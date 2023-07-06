package day10;
//Input (stdin)
//2
//3
//6
//1
//2
//
//Output (stdout)
//4
//8
import java.util.Scanner;

public class SumOfTwoArrays {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr1 = new int[n];
		int[] arr2 = new int[n];
		for (int i = 0; i < n; i++) {
			arr1[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++) {
			arr2[i] = sc.nextInt();
		}

		for (int i = 0; i < n; i++) {
			int value = 0;
			value = arr1[i] + arr2[i];
			System.out.println(value);
		}

	}

}
