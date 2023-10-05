package freshwork_interview;

import java.util.*;

public class RemoveFirstWordPresentedCharacters {

	public static void main(String[] args) {
		 String word1 = "aravinth";
	        String word2 = "araguran";
	        List<Character> arr = new ArrayList<>();
	          List<Character> arr2 = new ArrayList<>();
	        
	        for(char wr : word1.toCharArray()){
	            arr.add(wr);
	        }
	        for(char wr2: word2.toCharArray()){
	            if(!(arr.contains(wr2))){
	                arr2.add(wr2);
	            }
	            
	        }
	        for(Character ch : arr2)
	        System.out.print(ch +" ");
	}

}
