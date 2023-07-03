package day05;


//Write a Program to calculate the number of digits and letters in a string.
//
//Problem Solution:
//
//1. Take a string from the user and store it in a variable.
//
//2. Initialize the two count variables to 0.
//
//3. Use a for loop to traverse through the characters in the string and increment the first count variable each time a digit is encountered and increment the second count variable each time a character is encountered.
//
//4. Print the total count of both the variables.
//
//5. Exit.

import java.util.Scanner;

public class CalculateNumberAndWords {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String num = sc.nextLine();
		char lt;
		int wordCount = 0, numberCount = 0;

		for (int i = 0; i < num.length(); i++) {
			lt = num.charAt(i);
			if (lt == '0' || lt == '1' || lt == '2' || lt == '3' || lt == '4' || lt == '5' || lt == '6' || lt == '7'
					|| lt == '8' || lt == '9') {
				numberCount++;
			} else {
				wordCount++;
			}
		}

		System.out.println("The number of digits is:");
		System.out.println(numberCount);
		System.out.println("The number of characters is:");
		System.out.println(wordCount);
	}
}
