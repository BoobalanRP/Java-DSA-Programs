package day03;

import java.util.*;

public class XOGame {

	public static void main(String[] args) {
		
		 Scanner scanner = new Scanner(System.in);
		  System.out.print("Sample Input : ");
	        int input = scanner.nextInt();
	      
	        int row = (input - 1) / 4;
	        int column = (input - 1) % 4;
	        System.out.println("Sample output : " + row + " " + column);

	}

}
