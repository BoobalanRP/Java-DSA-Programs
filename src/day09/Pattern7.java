package day09;

//Sample Input:
//5
//
//Sample Output:
//1 
//1 0 
//1 0 1 
//1 0 1 0 
//1 0 1 0 1

import java.util.Scanner;

public class Pattern7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(1);
		for (int i = 2; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				if (j % 2 == 1) {
					System.out.print(1 + " ");
				} else {
					System.out.print(0 + " ");
				}

			}
			System.out.println();
		}
	}

}
