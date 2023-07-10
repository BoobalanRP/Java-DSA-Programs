package day11;
//after winning gold and silver in Indian Computing Olympiad 2014, Arun Gupta and Mani Iyer want to have some fun.

//Now they are playing a game on a grid made of n horizontal and m vertical sticks. Let us assume a grid where, n = 3 and m = 3.
//There are n + m = 6 sticks in total. 
//There are n*m = 9 intersection points, numbered from 1 to 9. The rules of the game are very simple. 
//Input (stdin)
//2 2
//
//Output (stdout)
//Mani Iyer

import java.util.Scanner;

public class AddtheNumbers {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();

		int total = n1 + n2;
		int mul = n1 * n2;
		int add = mul + total;
		if (add % 2 == 0) {
			System.out.println("Mani Iyer");
		} else {
			System.out.println("Arun Gupta");
		}
	}
}
