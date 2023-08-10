package day27_collections;

import java.util.*;

public class LinkedListUsingCloneFunction {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> arr = new ArrayList<>();
		int num = sc.nextInt();
		sc.nextLine(); // Consume the newline character after reading the integer

		for (int i = 0; i < num; i++) {
			arr.add(sc.nextLine());
		}

		System.out.println("Actual LinkedList:");
		for (String val : arr) {
			System.out.println(val);
		}

		ArrayList<String> arr2 = (ArrayList<String>) arr.clone();

		System.out.println("Cloned LinkedList:");
		for (String val : arr2) {
			System.out.println(val);
		}

	}

}

//Input (stdin)
//4
//First
//Second
//Third
//Random
//
//Output (stdout)
//Actual LinkedList:
//First
//Second
//Third
//Random
//Cloned LinkedList:
//First
//Second
//Third
//Random
