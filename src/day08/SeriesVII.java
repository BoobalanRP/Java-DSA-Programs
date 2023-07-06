

package day08;
import java.util.Scanner;
//Write a program to generate the following series --- 1, 2.0, 3.0, 6.0, 9.0, 18.0, 27.0,...
//Input format:
//The input containing an integer which denotes 'n'
//
//Output format:
//Print the series and refer the sample output for formatting
//Sample Input:
//6
//Sample Output:
//1 2.0 3.0 6.0 9.0 18.0

public class SeriesVII {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = 1, b = 2;
		System.out.print(a + " " + b + ".0" + " ");
		for (int i = 3; i <= n; i++) {
			if (i % 2 == 1) {
				a = a * 3;
				System.out.print(a + ".0" + " ");
			} else {
				b = b * 3;
				System.out.print(b + ".0" + " ");
			}
		}

	}

}
