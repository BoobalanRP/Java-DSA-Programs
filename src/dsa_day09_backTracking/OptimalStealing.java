package dsa_day09_backTracking;

import java.util.Scanner;

public class OptimalStealing {

	static int maxLoot(int hval[], int n)
	  {
	     
	    if (n < 0) {
	      return 0;
	    }
	 
	    if (n == 0) {
	      return hval[0];
	    }
	    int pick = hval[n] + maxLoot(hval, n - 2);
	    int notPick = maxLoot(hval, n - 1);
	    return Math.max(pick, notPick);
	  }
	 

	  public static void main(String[] args)
	  {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int arr[] = new int[n];
	    for(int i=0; i<n; i++){
	      arr[i]= sc.nextInt();
	    }
	    System.out.println (maxLoot(arr, n-1));
	  }

}


//Input (stdin)
//7
//6 7 1 3 8 2 4
//
//Output (stdout)
//19