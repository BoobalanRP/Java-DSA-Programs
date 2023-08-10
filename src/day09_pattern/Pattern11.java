package day09_pattern;

//﻿Sample Input:
//
//PROGRAM
//
//Sample Output:
//
//      g
//     gr
//    gra
//   gram
//  gramp
// grampr
//grampro
import java.util.Scanner;

public class Pattern11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String val = sc.next();
		int val1 = val.length();
		int space = 1;
		int mid = (int) Math.ceil(val1 / 2);
		char sentence;
		for (int i = 0; i < val1; i++) {
			for (int j = 1; j <= val1 - i - 1; j++) {
				System.out.print(" ");
			}
			for (int k = space; k <= i + 1; k++) {
				if (mid < val1) {
					sentence = val.charAt(mid);
					System.out.print(sentence);
					mid++;
				} else if (mid >= val1) {
					sentence = val.charAt(mid - val1);
					System.out.print(sentence);
					mid++;
				}
			}
			mid = (int) Math.ceil(val1 / 2);
			System.out.println();
		}

	}

}
//
//Scanner scanner = new Scanner(System.in);
//String input1 = scanner.nextLine();
//int length = input1.length();
//int middle = length / 2;
//String firstHalf = input1.substring(0, middle);
//String secondHalf = input1.substring(middle);
//String input = secondHalf + firstHalf;
//for (int i = 0; i < length; i++) {
//	for (int j = 0; j < length - i - 1; j++) {
//		System.out.print(" ");
//	}
//	for (int j = 0; j <= i; j++) {
//		System.out.print(input.charAt(j));
//	}
//	System.out.println();
//}