package day15_String;

import java.util.Scanner;

//Input (stdin)
//Excellent
//tnellecxE
//
//Output (stdout)
//It is same
public class CompareTwoWordsSameOrNot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String firstWord = sc.nextLine();
		String secondWord = sc.nextLine();

		// Create a StringBuilder and append the second word in reverse order
		StringBuilder reversedSecondWord = new StringBuilder(secondWord);
		reversedSecondWord.reverse();

		// Check if the reversed second word is equal to the first word
		if (firstWord.equals(reversedSecondWord.toString())) {
			System.out.println("It is same");
		} else {
			System.out.println("It is not same");
		}

//		 Scanner sc = new Scanner(System.in);
//	        String firstWord = sc.nextLine();
//	        String secondWord = sc.nextLine();
//	        
//	    
//	        if (firstWord.length() != secondWord.length()) {
//	            System.out.println("It is not the same");
//	        }
//	        
//	       
//	        for (int i = 0; i < firstWord.length(); i++) {
//	            if (firstWord.charAt(i) != secondWord.charAt(secondWord.length() - i - 1)) {
//	                System.out.println("It is not same");
//	                return;
//	            }
//	        }
//	        
//	        System.out.println("It is same");
	}

}
