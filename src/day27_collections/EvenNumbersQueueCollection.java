package day27_collections;

import java.util.*;

public class EvenNumbersQueueCollection {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for (int i = 1; i <= num; i++) {
			arr.add(i);
		}

		System.out.println(arr);
		System.out.println("Even numbers:");
		for (Integer val : arr) {
			if (val % 2 == 0) {
				System.out.println(val);
			}
		}

	}

}

//Input (stdin)
//5
//
//Output (stdout)
//[1, 2, 3, 4, 5]
//Even numbers:
//2
//4