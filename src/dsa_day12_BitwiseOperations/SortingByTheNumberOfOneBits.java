package dsa_day12_BitwiseOperations;

import java.util.*;

public class SortingByTheNumberOfOneBits {
	public static int countSetBits(int num) {
		int count = 0;
		while (num > 0) {
			count += num & 1;
			num >>= 1;
		}
		return count;
	}

	// Custom comparator for sorting based on set bits
	public static class CustomComparator implements Comparator<Integer> {
		public int compare(Integer a, Integer b) {
			int countA = countSetBits(a);
			int countB = countSetBits(b);
			if (countA != countB) {
				return countA - countB; // Sort by number of set bits
			} else {
				return a - b; // If set bits are the same, sort in ascending order
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Integer> arr = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			arr.add(sc.nextInt());
		}

		// Sort the array using the custom comparator
		Collections.sort(arr, new CustomComparator());

		// Print the sorted array
		for (int num : arr) {
			System.out.print(num + " ");
		}
	}
}

//Input (stdin)
//9
//0 1 2 3 4 5 6 7 8 
//
//Output (stdout)
//0 1 2 4 8 3 5 6 7