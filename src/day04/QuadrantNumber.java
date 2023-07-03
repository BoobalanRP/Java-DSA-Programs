package day04;

import java.util.Scanner;

public class QuadrantNumber {

	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
	     int x = n.nextInt();
	    int y = n.nextInt();
	    
	    if( x>0 && y >0){
	      System.out.println("Ist Quadrant");
	    }
	    else if( x < 0 && y > 0){
	      System.out.println("IInd Quadrant");
	    }
	    else if( x < 0 && y < 0){
	      System.out.println("IIIrd Quadrant");
	    }
	    else if( x > 0 && y < 0){
	      System.out.println("IVth Quadrant");
	    }
	    else{
	       System.out.println("Origin");
	    }
	}

}
