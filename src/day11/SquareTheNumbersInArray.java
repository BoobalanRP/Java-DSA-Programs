package day11;

//Input (stdin)
//3
//2
//4
//6
//
//Output (stdout)
//4
import java.util.Scanner;

public class SquareTheNumbersInArray {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        int[] arr = new int[n];
	        for (int i = 0; i < n; i++) {
	            arr[i] = sc.nextInt();
	        }
	      int sum = 0;
	        for (int i = 0; i < n; i++) {
	            if (arr[i] > 0 && Math.sqrt(arr[i]) % 1 == 0) {
	                sum += arr[i];
	            }
	        }
	       
	       System.out.println(sum);
	    }
	       
	

}
