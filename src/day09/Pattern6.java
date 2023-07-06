package day09;
//Sample Input:

//4
//
//Sample Output:
//
//1 
//
//1 2 3 
//
//1 2 3 4 5 
//
//1 2 3 4 5 6 7 

import java.util.Scanner;

public class Pattern6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 0;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i + count; j++) {
				System.out.print(j + " ");

			}
			count += 1;
			System.out.println();
		}

	}

}
