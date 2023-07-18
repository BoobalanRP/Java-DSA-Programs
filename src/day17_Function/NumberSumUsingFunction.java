package day17_Function;

import java.util.*;

class Sum {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		NumberSumUsingFunction(num, sc);
	}

	public static void NumberSumUsingFunction(int value, Scanner sc) {
		List<Integer> numbers = new ArrayList<>();
		for (int i = 0; i < value; i++) {
			numbers.add(sc.nextInt());
		}
		Collections.sort(numbers);
		int sumOfNumbers = numbers.get(0) + numbers.get(numbers.size() - 1);
		System.out.println(sumOfNumbers);
	}
}

//Input (stdin)
//4
//9 5 0 11
//
//Output (stdout)
//11