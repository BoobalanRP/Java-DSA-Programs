package day27_collections;

import java.util.*;

public class AddTwoLinkedListArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		LinkedList<String> linkedList1 = new LinkedList<>();

		int n1 = sc.nextInt();
		for (int i = 0; i < n1; i++) {
			linkedList1.add(sc.next());
		}

		LinkedList<String> linkedList2 = new LinkedList<>();

		int n2 = sc.nextInt();
		for (int i = 0; i < n2; i++) {
			linkedList2.add(sc.next());
		}

		System.out.print("Actual LinkedList:");
		System.out.println(linkedList1);

		linkedList1.addAll(linkedList2);

		System.out.print("After Copy:");
		System.out.println(linkedList1);

	}

}

//Input (stdin)
//4
//First
//Second
//Third
//Random
//2
//one
//two
//
//Output (stdout)
//Actual LinkedList:[First, Second, Third, Random]
//After Copy:[First, Second, Third, Random, one, two]