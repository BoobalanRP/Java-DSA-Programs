package day14_String;
//Input (stdin)
//Faceprep
//
//Output (stdout)
//Fcprp
import java.util.Scanner;

public class DeleteVowels {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		char[] array = { 'a', 'e', 'i', 'o', 'u' };
		char a;
		String b = "";

		for (int i = 0; i < word.length(); i++) {
			a = word.charAt(i);
			boolean c = false;

			for (int j = 0; j < array.length; j++) {
				if (a == array[j]) {
					c = true;
				}
			}

			if (!c) {
				b += a;
			}
		}
		System.out.println(b);
	}

}
