package day27_collections;

import java.util.*;

public class CharacterFrequency {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Character frequency in given text:");
		String word = sc.nextLine();

		Map<Character, Integer> uppercaseMap = new TreeMap<>();
		Map<Character, Integer> lowercaseMap = new TreeMap<>();

		for (char ch : word.toCharArray()) {
			if (Character.isUpperCase(ch)) {
				uppercaseMap.put(ch, uppercaseMap.getOrDefault(ch, 0) + 1);
			} else if (Character.isLowerCase(ch)) {
				lowercaseMap.put(ch, lowercaseMap.getOrDefault(ch, 0) + 1);
			}
		}

		for (char ch : uppercaseMap.keySet()) {
			System.out.print(ch + ":" + uppercaseMap.get(ch) + " ");
		}

		for (char ch : lowercaseMap.keySet()) {
			System.out.print(ch + ":" + lowercaseMap.get(ch) + " ");
		}
	}

}

//Input (stdin)
//InputMismatchException
//
//Output (stdout)
//Character frequency in given text:
//E:1 I:1 M:1 a:1 c:2 e:1 h:1 i:2 m:1 n:2 o:1 p:2 s:1 t:3 u:1 x:1