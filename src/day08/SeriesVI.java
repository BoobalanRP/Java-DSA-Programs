package day08;
//Write a program to generate the following series --- 0,2,8,14,...,34

import java.util.Scanner;

//Input format:
//
//The input containing an integer which denotes 'n'
//Output format:
//
//Print the series and refer the sample output for formatting.
//
//Sample Input:
//6
//
//Sample Output:
//0 2 8 14 24 34

public class SeriesVI {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, i, pr = 0;

		n = sc.nextInt();
		for (i = 1; i <= n; i++) {
			if (i % 2 == 0) {
				pr = (int) (Math.pow(i, 2) - 2);
				System.out.print(pr + " ");
			} else {
				pr = (int) (Math.pow(i, 2) - 1);
				System.out.printf(pr + " ");
			}
		}
		sc.close();

	}

}
