package day04;

import java.util.Scanner;

public class PrintDayUsingSwitch {

	public static void main(String[] args) {
		 Scanner n = new Scanner(System.in);
	        String sc = n.nextLine();

	        switch (sc) {
	            case "sunday":
	                System.out.println("Day is Sunday");
	                break;
	            case "monday":
	                System.out.println("Day is Monday");
	                break;
	            case "tuesday":
	                System.out.println("Day is Tuesday");
	                break;
	            case "wednesday":
	                System.out.println("Day is Wednesday");
	                break;
	            case "thursday":
	                System.out.println("Day is Thursday");
	                break;
	            case "friday":
	                System.out.println("Day is Friday");
	                break;
	            case "saturday":
	                System.out.println(" Day is Saturday");
	                break;
	            default:
	                System.out.println("Day is not here");
	        }
	    

	}

}
