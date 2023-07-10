package day11;

//Input (stdin)
//4
//6
//7
//8
//3
//
//Output (stdout)
//Sorted array is:
//3
//6
//7
//8
import java.util.Scanner;

public class AscendingOrder {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr1 = new int[n];

		for (int i = 0; i < n; i++) {
			arr1[i] = sc.nextInt();
		}

		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (arr1[i] > arr1[j]) {
					int temp = arr1[i];
					arr1[i] = arr1[j];
					arr1[j] = temp;
				}
			}
		}

		System.out.println("Sorted array is:");
		for (int i = 0; i < n; i++) {
			System.out.println(arr1[i]);
		}

	}

}
