package hackerRankProblems;

import java.util.*;
import java.util.Scanner;

public class CharatersRepeating {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String wr = sc.next();
		char[] ch = wr.toLowerCase().toCharArray();
		int count = 0;

		Map<Character, Integer> charFrequency = new LinkedHashMap<>();

		for (char c : ch) {
			charFrequency.put(c, charFrequency.getOrDefault(c, 0) + 1);
		}

		for (char c : ch) {
			if (charFrequency.get(c) == 1) {
				System.out.println(c);
				break;
			} else {
				count++;
			}
		}

		if (count == ch.length) {
			System.out.println("All the Charaters are  repeating .");
		}
	}
}
// input : goog
// output: All the Charaters are  repeating .

// input: paper
// output: a