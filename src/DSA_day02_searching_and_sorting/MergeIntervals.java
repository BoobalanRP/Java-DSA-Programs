package DSA_day02_searching_and_sorting;

import java.util.*;

public class MergeIntervals {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[][] intervals = new int[n][2];
		for (int i = 0; i < n; i++) {
			intervals[i][0] = scanner.nextInt();
			intervals[i][1] = scanner.nextInt();
		}

		int[][] mergedIntervals = merge(intervals);
		for (int[] interval : mergedIntervals) {
			System.out.println(interval[0] + " " + interval[1]);
		}
	}

	public static int[][] merge(int[][] intervals) {

		Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

		List<int[]> merged = new ArrayList<>();
		int[] currentInterval = intervals[0];

		for (int i = 1; i < intervals.length; i++) {
			int[] interval = intervals[i];
			if (interval[0] <= currentInterval[1]) {
				currentInterval[1] = Math.max(currentInterval[1], interval[1]);
			} else {
				merged.add(currentInterval);
				currentInterval = interval;
			}
		}

		merged.add(currentInterval);
		return merged.toArray(new int[merged.size()][]);
	}
}

//Input (stdin)
//4
//1 3
//2 6
//8 10
//15 18
//
//Output (stdout)
//1 6
//8 10
//15 18
//
//
//
//Input (stdin)
//6
//41 81
//36 89
//1 72
//5 47
//93 100
//28 33
//
//Output (stdout)
//1 89
//93 100
