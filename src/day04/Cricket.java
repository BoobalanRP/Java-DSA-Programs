package day04;

import java.util.Scanner;

public class Cricket {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int totalBalls = sc.nextInt();
		int totalRuns = sc.nextInt();
		int scoredRuns = sc.nextInt();
		int bowledBalls = sc.nextInt();

		int totalOvers = totalBalls / 6;
		float finishedOvers = (bowledBalls / 6) + 0.1f * (bowledBalls % 6);
		float currentRunRate = scoredRuns / finishedOvers;
		float totalRunRate = totalRuns / (float) totalOvers;

		System.out.println(totalOvers);
		System.out.println(String.format("%.1f", finishedOvers));
		System.out.println(String.format("%.1f", currentRunRate));
		System.out.println(String.format("%.1f", totalRunRate));

		if (currentRunRate >= totalRunRate) {
			System.out.println("Eligible to Win");
		} else {
			System.out.println("Not Eligible to Win");
		}
	}

}
