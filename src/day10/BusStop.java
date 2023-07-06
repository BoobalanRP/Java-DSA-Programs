package day10;

//SAMPLE INPUT:
//4 3
//2 3 2 1
//
//
//
//SAMPLE OUTPUT:
//3

import java.util.Scanner;

public class BusStop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int value = 0;
		int count = 0;
		for (int i = 0; i < m; i++) {
			value = sc.nextInt();
			if (value < n) {
				count++;
			}
		}
		System.out.print(count);

	}

}
