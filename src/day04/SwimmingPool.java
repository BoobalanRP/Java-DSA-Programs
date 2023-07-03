package day04;

import java.util.Scanner;

public class SwimmingPool {

	public static void main(String[] args) {
		
		    Scanner scanner = new Scanner(System.in);
		    
		    int sideLength = scanner.nextInt();
		    int litersOfWater = scanner.nextInt();
		    
		    int plVolume = sideLength * sideLength * sideLength * 1000;
		    
		    if (plVolume >= litersOfWater) {
		      System.out.println("Can store");
		    } else {
		      System.out.println("Cannot store");
		    }
		  
}

}
