package day15_String;
//Input (stdin)

//Happy learning
//3
//
//Output (stdout)
//Sorry this string cannot be divided into 3 equal parts.

//Input (stdin)
//Happy learning
//2
//
//
//Output (stdout)
//2 equal parts of given string are
//Happy l
//earning

import java.util.Scanner;

public class DivideAStringJava {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		int n = sc.nextInt();

		int length = input.length();
		int chars = length / n;

		if (length % n != 0) {
			System.out.println("Sorry this string cannot be divided into " + n + " equal parts.");
		} else {
			System.out.println(n + " equal parts of given string are");
			for (int i = 0; i < length; i++) {
				if (i % chars == 0 && i != 0) {
					System.out.println();
				}
				System.out.print(input.charAt(i));
			}
		}

	}

}
//Scanner sc = new Scanner(System.in);
//String word = sc.nextLine();
//int n = sc.nextInt();
//int length = word.length();
//
//int div = length/n;
//
//String one = "";
//if(length%n==0){
//  System.out.println(n+" equal parts of given string are");
//	for(int i=0; i<word.length();i+=div){
//    	System.out.println(word.substring(i,i+div));
//    }
//}
//else{
//	System.out.println("Sorry this string cannot be divided into "+n+" equal parts.");
//}