package day10;

//Input (stdin)
//3
//6
//9
//2
//
//Output (stdout)
//The mode of the array is none
import java.util.Scanner;

public class ArrayMode {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr1 = new int[n];
		for (int i = 0; i < n; i++) {
			arr1[i] = sc.nextInt();
		}
		int count = 0;
		int value = 0;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (arr1[i] == arr1[j]) {
					count++;
					value = arr1[i];
				}
			}
		}
		if (count >= 1) {
			System.out.print("Mode=" + value);
		} else {
			System.out.print("The mode of the array is none");
		}
	}

}
