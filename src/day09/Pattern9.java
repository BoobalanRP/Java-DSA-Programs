package day09;

import java.util.Scanner;

//Sample Input:
//4
//
//Sample Output:
//1*2*3*4*17*18*19*20
// 5*6*7*14*15*16
//  8*9*12*13
//   10*11
public class Pattern9 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		int firstHalf = 1;
		int secondHalf = (num * num) + 1;
		int numOfSpaces = 0;

		for (int i = num; i >= 1; i--) {
		
			for (int j = numOfSpaces; j >= 1; j -= 2) {
				System.out.print(" ");
			}

		
			for (int l = 1; l <= i; l++) {
				System.out.print(firstHalf++);
				if (l != i) {
					System.out.print("*");
				}
			}

		
			for (int m = 1; m <= i; m++) {
				System.out.print("*" + secondHalf++);
			}

			System.out.println();

			
			numOfSpaces += 2;

			
			secondHalf = (secondHalf - 1) - ((i - 1) * 2);
		}
	}

}
