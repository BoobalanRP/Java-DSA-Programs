package dsa_day07_backTracking;

import java.util.Scanner;

public class TowerOfHanoi {
	public static void solveTowerOfHanoi(int n, char source, char auxiliary, char target) {
		if (n > 0) {
			solveTowerOfHanoi(n - 1, source, target, auxiliary);
			System.out.println(n + " " + source + " " + target);
			solveTowerOfHanoi(n - 1, auxiliary, source, target);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("The sequence of moves involved in the Tower of Hanoi are :");
		System.out.println();
		solveTowerOfHanoi(n, 'A', 'B', 'C');
	}

}
