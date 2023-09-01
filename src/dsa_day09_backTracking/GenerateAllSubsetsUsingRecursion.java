package dsa_day09_backTracking;

import java.util.*;

public class GenerateAllSubsetsUsingRecursion {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int N = scanner.nextInt();
		int[] array = new int[N];

		for (int i = 0; i < N; i++) {
			array[i] = scanner.nextInt();
		}

		Arrays.sort(array); // Sort the array
		generateSubsets(array, new ArrayList<>(), 0);

		scanner.close();
	}

	public static void generateSubsets(int[] array, List<Integer> subset, int index) {
		if (!subset.isEmpty()) {
			for (int num : subset) {
				System.out.print(num + " ");
			}

			System.out.println();
		}

		for (int i = index; i < array.length; i++) {
			subset.add(array[i]);
			generateSubsets(array, subset, i + 1);
			subset.remove(subset.size() - 1);
		}
	}

}

//Input (stdin)
//3
//1 2 3
//
//Output (stdout)
//1
//1 2
//1 2 3
//1 3
//2
//2 3
//3
//
//
//Input (stdin)
//5
//7 3 5 2 6
//
//Output (stdout)
//2
//2 3
//2 3 5
//2 3 5 6
//2 3 5 6 7
//2 3 5 7
//2 3 6
//2 3 6 7
//2 3 7
//2 5
//2 5 6
//2 5 6 7
//2 5 7
//2 6
//2 6 7
//2 7
//3
//3 5
//3 5 6
//3 5 6 7
//3 5 7
//3 6
//3 6 7
//3 7
//5
//5 6
//5 6 7
//5 7
//6
//6 7
//7