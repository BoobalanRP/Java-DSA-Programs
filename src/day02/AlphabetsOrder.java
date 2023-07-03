package day02;

import java.util.Scanner;

public class AlphabetsOrder {
	public static void main(String[] args) {
    
    	        Scanner name = new Scanner(System.in);

    	        String[] letter = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
    	        String word = name.nextLine();
    	        StringBuilder sc = new StringBuilder();
    	        
    	        for (int i = 0; i < letter.length; i++) {
    	            for (int j = 0; j < word.length(); j++) {
    	                if (letter[i].equals(String.valueOf(word.charAt(j)))) {
    	                    sc.append(word.charAt(j));
    	                }
    	            }
    	        }
    	        
    	        System.out.print(sc.toString());
    	    }
    	
 
}
