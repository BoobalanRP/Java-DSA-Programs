package day17_Function;

import java.util.*;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		RemoveDuplicatesFromArrayList(num, sc);
	}

	public static void RemoveDuplicatesFromArrayList(int value, Scanner sc) {
		List<Integer> numbers = new ArrayList<>();
		for (int i = 0; i < value; i++) {
			numbers.add(sc.nextInt());
		}
		Set<Integer> uniqueNumbers = new HashSet<>(numbers);
		List<Integer> sortedNumbers = new ArrayList<>(uniqueNumbers);
		Collections.sort(sortedNumbers);
		for (Integer number : sortedNumbers) {
			System.out.println(number);
		}
	}
}
