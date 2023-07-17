package day15_String;

import java.util.Scanner;

public class CompareString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String sent = sc.nextLine();
		String word = sc.nextLine();
		String replace = sc.nextLine();
		sent = sent.replaceAll(word, replace);
		System.out.println(sent);
	}

}
