package day17_Function;

import java.util.Scanner;

public class TotalTax {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		int ans = 0;
		for (int i = 0; i < num; i++) {
			int temp = in.nextInt();
			temp -= 1000;
			if (temp > 0) {
				ans += (temp * (0.10));
			}
		}
		System.out.println(ans);

	}

}
//Input (stdin)
//4
//2000 2000 1000 1000
//
//Output (stdout)
//200