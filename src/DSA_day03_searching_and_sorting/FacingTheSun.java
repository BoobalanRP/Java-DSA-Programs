package DSA_day03_searching_and_sorting;

import java.util.Scanner;

public class FacingTheSun {


	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        
	        int n = sc.nextInt();
	        int[] heights = new int[n];
	        
	        for (int i = 0; i < n; i++) {
	            heights[i] = sc.nextInt();
	        }
	        
	        int count = 1; 
	        
	        int max = heights[0];
	        for (int i = 1; i < n; i++) {
	            if (heights[i] > max) {
	                count++;
	                max = heights[i];
	            }
	        }
	        
	        System.out.println(count);
	    }
	

}

//Input (stdin)
//5
//6 2 7 4 10
//
//Output (stdout)
//3