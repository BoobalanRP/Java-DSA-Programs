package day08;

//Write a program to generate the following series 95.0, 115.5, 138.0,..., 189.0
//Input format:
//The input containing an integer which denotes 'n'
//
//Output format:
//Print the series and refer the sample output for formatting
//
//Sample Input:
//5
//
//Sample Output:
//95.0 115.5 138.0 162.5 189.0

import java.util.Scanner;

public class SeriesXI {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		float value = 20.5f;
		float initial = 95.0f;
		System.out.print(initial + " ");
		initial += value;
		System.out.print(initial + " ");
		for (int i = 1; i < num - 1; i++) {
			initial += value + (2.0f * i);
			System.out.print(initial + " ");
		}

	}

}
