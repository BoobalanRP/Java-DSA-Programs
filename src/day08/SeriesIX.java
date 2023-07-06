package day08;
//Series IX

//Write a program to generate the following series 2, 15, 41, 80,...
//Input format:
//The input containing an integer which denotes 'n'
//
//Output format:
//Print the series and refer the sample output for formatting.
//
//Sample Input:
//5
//
//Sample Output:
//
//2 15 41 80 132

import java.util.Scanner;

public class SeriesIX {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		int value = 2;
		for (int i = 1; i <= num; i++) {
			System.out.print(value + " ");
			value += i * 13;

		}
	}

}
