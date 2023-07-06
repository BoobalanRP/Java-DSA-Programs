package day08;
//Write a program to generate the following series 2, 5, 11, 23, 47, 95, 191........... 
//Input format: The input containing an integer which denotes 'n' Output format: 
//	Print the series and refer the sample output for formatting
//
//Case 1
//Input (stdin)
//5
//
//Output (stdout)
//2 5 11 23 47

import java.util.Scanner;

public class SeriesXIV {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int term = 2;
		System.out.print(term + " ");
		for (int i = 1; i < n; i++) {
			term = term * 2 + 1;
			System.out.print(term + " ");
		}
	}

}
