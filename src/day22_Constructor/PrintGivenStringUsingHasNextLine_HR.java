package day22_Constructor;

import java.util.Scanner;

public class PrintGivenStringUsingHasNextLine_HR {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
		 * class should be named Solution.
		 */
		Scanner sc = new Scanner(System.in);
		int count = 1;
		while (sc.hasNextLine()) {
			String val = sc.nextLine();
			System.out.println(count + " " + val);
			count++;
		}
		sc.close();
	}
}

//Sample Input
//
//Hello world
//I am a file
//Read me until end-of-file.
//Sample Output
//
//1 Hello world
//2 I am a file
//3 Read me until end-of-file.
