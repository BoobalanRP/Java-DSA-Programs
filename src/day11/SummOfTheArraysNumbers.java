package day11;

//Input (stdin)
//2
//4
//5
//8
//9
//
//Output (stdout)
//12
//14
import java.util.Scanner;

public class SummOfTheArraysNumbers {

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
