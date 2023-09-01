package dsa_day02_searching_and_sorting;

import java.util.*;

public class SentenceSort {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String shuffledSentence = scanner.nextLine();
		scanner.close();

		String[] words = shuffledSentence.split(" ");
		String[] originalWords = new String[words.length];

		for (int i = 0; i < words.length; i++) {
			String word = words[i];
			int index = word.length() - 1;
			char lastChar = word.charAt(index);
			int originalIndex = lastChar - '1';
			originalWords[originalIndex] = word.substring(0, index);
		}

		String originalSentence = "";
		for (String originalWord : originalWords) {
			originalSentence += originalWord + " ";
		}

		System.out.println(originalSentence);
	}
}

//Input (stdin)
//How2 Hey!1 you4 are3
//
//Output (stdout)
//Hey! How are you