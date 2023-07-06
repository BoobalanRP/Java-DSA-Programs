package day08;

import java.util.Scanner;

//Write a program to generate the following series 2, 3, 8, 63, 3968
//Input format:
//The input containing an integer which denotes 'n'
//Output format:
//Print the series and refer the sample output for formatting
//Sample Input:
//5
//
//Sample Output:
//2 3 8 63 3968
public class SeriesX {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int value = 2;
		for (int i = 0; i < num; i++) {
			System.out.print(value + " ");
			value = (value * value) - 1;
		}
	}

}
