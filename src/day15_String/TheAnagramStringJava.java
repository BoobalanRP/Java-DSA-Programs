package day15_String;
//Input (stdin)

//Apple
//app
//
//Output (stdout)
//Not an anagram
//
//Input (stdin)
//Apple
//apple
//
//Output (stdout)
//Anagram

import java.util.Scanner;

public class TheAnagramStringJava {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		String b = sc.nextLine();
		String l1 = a.toLowerCase();
		String l2 = b.toLowerCase();
		String[] arr1 = l1.split("");
		String[] arr2 = l2.split("");

		if (arr1.length == arr2.length) {
			int count = 0;
			for (int i = 0; i < arr1.length; i++) {
				for (int j = 0; j < arr2.length; j++) {
					if (arr1[i].equals(arr2[j])) {
						count++;
						break;
					}
				}
			}
			if (count == arr1.length) {
				System.out.println("Anagram");
			} else {
				System.out.println("Not an anagram");
			}
		} else {
			System.out.println("Not an anagram");
		}

	}

}
