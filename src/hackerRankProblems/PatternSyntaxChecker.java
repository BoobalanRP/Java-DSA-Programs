package hackerRankProblems;

import java.util.Scanner;
import java.util.regex.*;

public class PatternSyntaxChecker {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numTestCases = scanner.nextInt();
		scanner.nextLine(); // Consume the newline

		while (numTestCases-- > 0) {
			String pattern = scanner.nextLine();

			try {
				Pattern.compile(pattern); // Try to compile the pattern
				System.out.println("Valid");
			} catch (PatternSyntaxException e) {
				System.out.println("Invalid");
			}
		}

		scanner.close();

	}

}
