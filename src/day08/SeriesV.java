package day08;

import java.util.Scanner;

//Write a program to generate the following series --- 121,225,361,...
//Input format:
//The input containing an integer which denotes 'n'
//Output format:

//Print the series and refer the sample output for formatting.

//Sample Input:

//4

//Sample Output:
//
//121 225 361 529
public class SeriesV {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int value = 121;
		int power = 32;
		for (int i = 0; i < num; i++) {
			if (i == 0) {
				System.out.print(value + " ");
			} else {
				if (i == 1) {
					value += 104;
					System.out.print(value + " ");
				} else {
					power = 32 * (i - 1);
					value += 104 + power;
					System.out.print(value + " ");
				}
			}
		}

	}

}
