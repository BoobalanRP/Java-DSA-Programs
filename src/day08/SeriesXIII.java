

package day08;

import java.util.Scanner;

//Write a program to generate the following series 5, 16, 49, 104, 181...
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
//5 16 49 104 181

public class SeriesXIII {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int a = 5;
		int b = 16;
		int value = 0;
		int value1 = 0;
		System.out.print(a + " " + b + " ");

		for (int i = 3; i <= (x + x) - 2; i += 2) {
			value1 += i * 11;
			value = b + value1;
			System.out.print(value + " ");
		}

	}

}
