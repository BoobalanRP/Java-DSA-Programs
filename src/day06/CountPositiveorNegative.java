package day06;
//
//Write a program to that allows the user to enter 'n' numbers and finds the number of positive numbers entered and the number of negative numbers entered using a while loop. 
//Input Format: Input consists of n+1 integers. The first integer corresponds to n.
//The next n integers correspond to the numbers to be added. Consider 0 to be a positive number.
//Output Format: Refer Sample Input and Output for formatting specifications.
//[All text in bold corresponds to input and the rest corresponds to output]

import java.util.Scanner;

public class CountPositiveorNegative {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int count = 0, total = 0;
		int num = sc.nextInt();
		for (int i = 0; i < num; i++) {
			int n = sc.nextInt();
			if (n >= 0) {
				count++;
				total += n;
			}
		}
	}

}
