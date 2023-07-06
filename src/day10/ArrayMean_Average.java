package day10;

//Input (stdin)
//3
//2
//5
//8
//
//Output (stdout)
//The mean of the array is 5.00
import java.util.Scanner;

public class ArrayMean_Average {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr1 = new int[n];
		for (int i = 0; i < n; i++) {
			arr1[i] = sc.nextInt();
		}
		float total = 0.0f;
		for (int i = 0; i < n; i++) {
			total += arr1[i];
		}

		float mean = total / n;
		System.out.printf("The mean of the array is %.2f", mean);

	}

}
