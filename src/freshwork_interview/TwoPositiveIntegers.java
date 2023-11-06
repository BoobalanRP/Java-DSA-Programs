package freshwork_interview;
		/*
		 * You are given two positive integers a and b. You also have a number x, which is
		initially set to 0. At first, you can add a to x any number of times. After that, you can
		divide x by b any number of times as long as x is divisible by b. Print YES if you can
		make x equal to 1, otherwise print NO.
		Input
		First line contains a single integer T - the number of test cases.
		Each of the next T lines contains two integer a and b.
		Output
		For each test, print YES if you can make x = 1 with the operations, otherwise NO.
		Constraints
		1 <= T <= 106
		1 <= A, B <= 109
		Input
		4
		3 10
		9 6
		7 30
		8 12
		Output
		NO
		YES
		NO
		YES
		Explanation
		Test case 2: We initially have x set to 0. Add a=9 to x for 4 times to make x equal to 36.
		And then divide x by b= 6 for 2 times to make x equal to 1.
		Test case 4: We initially have x set to 0. Add a=8 to x for 18 times to make x equal to
		144. And then divide x by b=12 for 2 times to make x equal to 1.
		 */

import java.util.*;
import java.lang.*;

public class TwoPositiveIntegers {
	public static void main(String args[]) {

		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		for (int x = 0; x < t; x++) {
			int a = s.nextInt();
			int b = s.nextInt();
			if (b % a == 0)
				System.out.println("YES");
			else if (b == 1)
				System.out.println("NO");
			else {
				String ans = "NO";
				for (int i = 2; i < 30; i++) {
					if (Math.pow(b, i) % a == 0) {
						ans = "YES";
						break;
					}
				}
				System.out.println(ans);
			}
		}
	}
}
