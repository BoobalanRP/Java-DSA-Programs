package day03;

import java.util.Scanner;

public class ShiftOperators {

	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
        
        System.out.print("Enter thge value of n: ");
      int s = n.nextInt();
        System.out.print("Enter thge value of m: ");
        int m = n.nextInt();
        int sum =  s<<m; 
      System.out.println("Left Shift Value: " + sum );
      int sum1 = s>>m;
      System.out.println("Right Shift Value: "  + sum1);
      
      

	}

}
