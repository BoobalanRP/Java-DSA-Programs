package day11;
//Input (stdin)
//2
//1
//2
//1
//2
//
//Output (stdout)
//Yes
import java.util.Scanner;

public class ComparingTwoArray {

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

		boolean compatible = true;
		for (int i = 0; i < n; i++) {
			if (arr1[i] != arr2[i]) {
				compatible = false;
				break;
			}
		}

		if (compatible) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}

}
