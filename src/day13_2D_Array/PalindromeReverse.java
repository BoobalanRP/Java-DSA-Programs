package day13_2D_Array;

//Input : he knows malayalam and tamil
//Output : he knows and tamil
import java.util.Scanner;

public class PalindromeReverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String sentence = "";

		String[] words = str.split(" ");

		for (String word : words) {

			boolean isPalindrome = true;
			int start = 0;
			int end = word.length() - 1;
			while (start < end) {
				if (word.charAt(start) != word.charAt(end)) {
					isPalindrome = false;
				}
				start++;
				end--;
			}

			if (!isPalindrome) {
				sentence += word + " ";
			}
		}

		System.out.println(sentence.trim());

	}

}
