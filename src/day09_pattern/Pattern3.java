package day09_pattern;

//Sample Input: 5
//
//Sample Output:
//1 3 5 7 9
//3 5 7 9
//5 7 9
//7 9
//9


import java.util.Scanner;

public class Pattern3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		for (int i = 1; i <= x * 2; i += 2) {
			for (int j = i; j <= x * 2; j += 2) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

}
