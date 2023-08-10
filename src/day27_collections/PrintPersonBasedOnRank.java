package day27_collections;

import java.util.*;

class PrintPersonBasedOnRank {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<String, Integer> arr1 = new HashMap<>();
		List<Integer> arr2 = new ArrayList<>();

		while (sc.hasNext()) {
			String symbol = sc.next();
			int number = sc.nextInt();
			arr2.add(number);
			arr1.put(symbol, number);
		}

		Collections.sort(arr2, Collections.reverseOrder());
		System.out.println("The ranks based on their marks: ");
		int rank = 1;
		for (Integer n1 : arr2) {
			System.out.print("Rank " + rank + ": ");
			String key = getKeyByValue(arr1, n1);
			System.out.println(key);
			rank++;
		}
	}

	private static String getKeyByValue(Map<String, Integer> map, int value) {
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			if (entry.getValue() == value) {
				return entry.getKey();
			}
		}
		return null;
	}
}

//
//Input (stdin)
//Deepak
//450
//Ishu
//380
//Guna
//420
//
//Output (stdout)
//The ranks based on their marks:
//Rank 1: Deepak
//Rank 2: Guna
//Rank 3: Ishu