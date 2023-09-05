package dsa_day12_BitwiseOperations;

import java.util.Scanner;

public class SwapTwoBitsAtTheGivenPositionsInTheBinary {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		int[] arr = new int[32];
		int i = 31;
		while (a != 0) {
			arr[i] = a % 2;
			a = a / 2;
			i--;
		}
		String res = "";
		for (int j = 24; j < 32; j++)
			res += arr[j] + "";

		int temp = arr[31 - b];
		arr[31 - b] = arr[31 - c];
		arr[31 - c] = temp;
		String res1 = "";
		for (int j = 0; j < 32; j++)
			res1 += arr[j] + "";

		int[] arr1 = new int[32];
		for (int k = 31, j = 0; k >= 0; k--, j++)
			arr1[j] = (int) Math.pow(2, k);

		int ans = 0;
		for (int j = 0; j < res1.length(); j++)
			if (res1.charAt(j) == '1')
				ans += arr1[j];

		System.out.println(ans);
		System.out.println(res);
	}

}

//Input (stdin)
//31
//2 6
//
//Output (stdout)
//91
//00011111