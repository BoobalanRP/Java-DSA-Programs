package day09_pattern;
//Sample Input:

import java.util.Scanner;

//4
//
//Sample Output:
//1112
//3222
//3334
//5444

public class Pattern10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int count = 1;
		int value = 2;
		for (int i = 1; i <= x; i++) {
			if (i % 2 == 1) {

				for (int j = 1; j <= x - 1; j++) {
					System.out.print(count);

				}
				System.out.print(value++);
				count++;
			} else if (i % 2 == 0) {
				System.out.print(value++);
				for (int j = 1; j <= x - 1; j++) {
					System.out.print(count);
				}
				count++;

			}
			System.out.println();

		}

	}
}
