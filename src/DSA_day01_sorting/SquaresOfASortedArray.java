package DSA_day01_sorting;

import java.util.Arrays;
import java.util.Scanner;

public class SquaresOfASortedArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] arr = new int[num];
		for (int i = 0; i < num; i++) {
			int val = sc.nextInt();
			arr[i] = val * val;

		}
		Arrays.sort(arr);

		for (int i = 0; i < num; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}

//Input (stdin)
//5
//-2 -1 0 3 5
//
//Output (stdout)
//0 1 4 9 25