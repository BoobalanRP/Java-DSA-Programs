package day08;

import java.util.Scanner;

//Write a program to generate the following series 4, 5, 9, 18, 34,...
//Input format:
//The input containing an integer which denotes 'n'
//
//Output format:
//Print the series and refer the sample output for formatting.
//
//
//Sample Input:
//6
//
//Sample Output:
//4 5 9 18 34 59

public class SeriesVIII {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		int value = 4;
		for (int i = 1; i <= num; i++) {
			System.out.print(value + " ");
			value += i * i;

		}

	}

}
