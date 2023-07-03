package day04;

import java.util.Scanner;

public class CheckingAlphabets {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		    char character = sc.next().toLowerCase().charAt(0);

		    if (Character.isLetter(character)) {
		      if (character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u') {
		        System.out.println("Vowel");
		      } else {
		        System.out.println("Consonant");
		      }
		    } else {
		      System.out.println("Not an alphabet");
		    }
		  }
		
	

}
