package dsa_day09_backTracking;

import java.util.Scanner;

public class ReachTheTarget {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int T = scanner.nextInt(); // Number of test cases
	        
	        for (int t = 0; t < T; t++) {
	            int A = scanner.nextInt();
	            int B = scanner.nextInt();
	            int C = scanner.nextInt();
	            int D = scanner.nextInt();
	            
	            if (isReachable(A, B, C, D, 0)) {
	                System.out.println("yes");
	            } else {
	                System.out.println("no");
	            }
	        }
	        
	        scanner.close();
	    }
	    
	    public static boolean isReachable(int currentPos, int B, int targetPos, int stepsLeft, int direction) {
	      
	        if (currentPos == targetPos && stepsLeft == 0) {
	            return true;
	        }
	     
	        if (stepsLeft == 0) {
	            return false;
	        }
	        
	      
	        boolean forward = isReachable(currentPos + B, B, targetPos, stepsLeft - 1, 1);
	        
	     
	        boolean backward = isReachable(currentPos - B, B, targetPos, stepsLeft - 1, -1);
	        
	     
	        return forward || backward;
	    }
}


//Input (stdin)
//3
//2 3 8 4
//-3 1 0 3
//-3 1 1 3
//
//Output (stdout)
//yes
//yes
//no