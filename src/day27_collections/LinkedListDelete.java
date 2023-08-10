package day27_collections;

import java.util.*;

public class LinkedListDelete {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		ArrayList<String> arr = new ArrayList<String>();
		for (int i = 0; i < num; i++) {
			arr.add(sc.next());
		}

		System.out.println("Actual LinkedList:" + arr);
		arr.clear();
		System.out.println("After clear LinkedList:" + arr);

	}

}

//
//Input (stdin)
//4
//Orange
//Apple
//Grape
//Banana
//
//Output (stdout)
//Actual LinkedList:[Orange, Apple, Grape, Banana]
//After clear LinkedList:[]