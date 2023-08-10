package hackerRankProblems;

import java.util.Scanner;

public class SplitTheGivenString {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String sentence = scan.nextLine();
		String text = sentence.trim();
		String[] separate = text.split("[ !,?._'@]+");
		if (text.isEmpty())
			System.out.println(0);
		else
			System.out.println(separate.length);
		for (String string : separate) {
			System.out.println(string);
		}
	}
}

//Sample Input
//
//He is a very very good boy, isn't he?

//Sample Output
//
//10
//He
//is
//a
//very
//very
//good
//boy
//isn
//t
//he