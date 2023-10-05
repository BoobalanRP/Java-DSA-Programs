package freshwork_interview;

import java.util.*;

public class SongsRound {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        List<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 3));
	        int value = arr.size();
	        String song = "XYX";
	        int k = 0;
	        while (value > 1) {
	            for (int i = 0; i < song.length(); i++) {
	                if (song.charAt(i) == 'X') {
	                    if (k >= arr.size()) {
	                        k = 0; 
	                    }
	                    k++;
	                } else {
	                    if(arr.size()> k){
	                    arr.remove(k);
	                     }
	                    if (k >= arr.size()) {
	                        k = 0; 
	                    }
	                }
	            }
	            value = arr.size();
	        }
	        System.out.println(arr);

	}

}
