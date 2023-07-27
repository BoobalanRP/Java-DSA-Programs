package day22_Constructor;

import java.util.*;
import java.util.Scanner;

public class WordAksari {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean val = true;
		List<String> arr = new ArrayList<String>();
		String word1 = sc.nextLine();
		arr.add(word1);
		char wordLast = word1.charAt(word1.length() - 1);
		char last = '\0';

		while (val) {
			String word2 = sc.nextLine();
			if (wordLast == word2.charAt(0)) {
				arr.add(word2);
			} else {
				last = word2.charAt(word2.length() - 1);
			}
			wordLast = last;
			if (wordLast == '#') {
				val = false;
			}
		}

		for (String name : arr) {
			System.out.println(name);
		}

	}

}


//architect
//
//tailor
//
//referee
//
//electrician
//
//nurse
//
//blacksmith
//
//####
//
//Sample Output:
//
//architect
//
//tailor
//
//referee
//
//electrician
//
//nurse
