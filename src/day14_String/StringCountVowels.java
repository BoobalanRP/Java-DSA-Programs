package day14_String;

import java.util.Scanner;

//Input (stdin)
//face
//
//Output (stdout)
//2
public class StringCountVowels {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.next();
		char[] array = { 'a', 'e', 'i', 'o', 'u' };
		int count = 0;
		for (int i = 0; i < word.length(); i++) {
			for (int j = 0; j < array.length; j++) {
				if (word.charAt(i) == (array[j])) {
					count++;
				}
			}
		}
		System.out.print(count);

	}

}
