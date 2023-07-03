package day06;

//A number is said to be valid iff it is divisible by 8. Write a program that allows the user to keep entering numbers as long as the input is valid and also displays a count of the valid numbers entered using a while loop.
//Input Format: Input consists of integers. Output Format: Refer Sample Input and Output for formatting specifications.
//[All text in bold corresponds to input and the rest corresponds to output].

import java.util.Scanner;

public class CountNumberIsdivededByEightorNot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		int num = sc.nextInt(); // Read the first number
		while (num % 8 == 0) {
			count++; // Increment the count of valid numbers
			if (!sc.hasNextInt()) { // Check if there is no next integer input
				break; // Exit the loop if there is no next integer input
			}
			num = sc.nextInt(); // Read the next number
		}
		System.out.println("The number of valid numbers entered is " + count);

	}

}
