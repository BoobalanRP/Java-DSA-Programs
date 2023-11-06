package freshwork_interview;

import java.util.*;
import java.lang.*;
import java.io.*;

public class RGYBColorSlots {
	static int hits = 0;
	static int pseudoHits = 0;

	// Function to assign code to a slot
	// based on the color they have
	static int codeOfColor(char c) {
		switch (c) {
		case 'B':
			return 0;
		case 'G':
			return 1;
		case 'R':
			return 2;
		case 'Y':
			return 3;
		default:
			return -1;
		}
	}

	// maximum no of colors are 4 RGYB
	static int MAX_COLORS = 4;

	// Function to calculate number of hits
	// and pseudo hits
	static void calcResult(String guess, String solution) {
		hits = 0;
		pseudoHits = 0;

		if (guess.length() != solution.length())
			System.out.println("Incorrect Input");

		// frequency array to store how many times
		// each character occurs in solution string
		int[] frequencies = new int[MAX_COLORS];

		// Compute hits and build frequency table
		for (int i = 0; i < guess.length(); i++) {
			if (guess.charAt(i) == solution.charAt(i)) {
				hits++;
			} else {
				/*
				 * Only increment the frequency table (which will be used for pseudo-hits) if
				 * it's not a hit. If it's a hit, the slot has already been "used."
				 */
				int codeofcolor = codeOfColor(solution.charAt(i));
				frequencies[codeofcolor]++;
			}
		}

		// Compute pseudo-hits
		for (int i = 0; i < guess.length(); i++) {
			int codeofcolor = codeOfColor(guess.charAt(i));
			if (codeofcolor >= 0 && frequencies[codeofcolor] > 0 && guess.charAt(i) != solution.charAt(i)) {
				pseudoHits++;
				frequencies[codeofcolor]--;
			}
		}

		System.out.println("hits -> " + hits + " Pseudo hits -> " + pseudoHits);
	}

	// Driver Code
	public static void main(String[] args) {
		String solution = "GGRR";
		String guess = "RGBY";

		calcResult(solution, guess);

		solution = "YGRR";
		guess = "RGYB";

		calcResult(solution, guess);
	}
}

// solution two

class CalcRes {

	public static void main(String[] args) {
		String solution = "YGRR";
		String guess = "RGYB";
		String guessArray[] = new String[4];
		String SolArray[] = new String[4];
		for (int i = 0; i < guess.length(); i++) {
			guessArray[i] = String.valueOf(guess.charAt(i));
			SolArray[i] = String.valueOf(solution.charAt(i));
		}
		int hit = 0;
		for (int i = 0; i < 4; i++) {
			if (guessArray[i].equals(SolArray[i])) {
				hit++;
				guessArray[i] = "#";
				SolArray[i] = "#";

			}
		}

		int pseudo_hit = 0;
		for (int i = 0; i < 4; i++) {
			if (guessArray[i].equals("#")) {
				continue;
			}
			boolean findSlot = false;
			for (int j = 0; j < 4; j++) {
				if (guessArray[i].equals(SolArray[j])) {
					findSlot = true;
					SolArray[j] = "#";
					break;
				}
			}
			if (findSlot) {
				pseudo_hit++;
			}

		}

		System.out.println("hit " + hit);
		System.out.println("pseudo_hit " + pseudo_hit);

	}
}

// Third method
class CalcRess {
	public static void main(String[] args) {
		String solution = "RYGG";
		String guess = "GGBB";

		int[] solutionCount = new int[26];
		int[] guessCount = new int[26];
		int hit = 0;
		int pseudoHit = 0;

		// Count hits
		for (int i = 0; i < 4; i++) {
			char s = solution.charAt(i);
			char g = guess.charAt(i);
			if (s == g) {
				hit++;
			} else {
				System.out.println(s - 'A');
				solutionCount[s - 'A']++;
				guessCount[g - 'A']++;
			}
		}

		// Count pseudo-hits
		for (int i = 0; i < 26; i++) {
			pseudoHit += Math.min(solutionCount[i], guessCount[i]);
			// System.out.println("val " +Math.min(solutionCount[i], guessCount[i]));
		}

		System.out.println("hit " + hit);
		System.out.println("pseudo_hit " + pseudoHit);
	}
}
