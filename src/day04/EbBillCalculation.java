package day04;

import java.util.Scanner;

public class EbBillCalculation {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		    int units = scanner.nextInt();
		    
		    int bill = 0;
		    
		    if (units <= 200) {
		      bill = (int) (units * 0.5);
		    } else if (units <= 400) {
		      bill = (int) (units * 0.65) + 100;
		    } else if (units <= 600) {
		      bill = (int) (units * 0.80) + 200;
		    } else {
		      bill = (int) (units * 1.25) + 425;
		    }
		    
		    System.out.println("Rs." + bill);
		  

	}

}
