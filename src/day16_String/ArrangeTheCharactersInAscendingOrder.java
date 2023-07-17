package day16_String;

import java.util.*;

public class ArrangeTheCharactersInAscendingOrder {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();

		char[] charArray = input.toCharArray();
		Arrays.sort(charArray);
		String word = "";
		for (int i = 0; i < charArray.length; i++) {
			word += charArray[i];
		}
		System.out.print(word);
	}

}

//Input (stdin)
//program
//
//Output (stdout)
//agmoprr
//
//Input (stdin)
//PYTHOn
//
//Output (stdout)
//HOPTYn