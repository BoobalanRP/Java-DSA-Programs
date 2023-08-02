package day25_interface;

import java.util.Scanner;

public class RoomRent {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rent = sc.nextInt();
		int ramSalary = sc.nextInt();
		int sathishSalary = sc.nextInt();
		int amountArrange = rent - (ramSalary + sathishSalary);

		System.out.println("The amount they need to arrange: " + amountArrange);

	}

}

//
//Input (stdin)
//5900
//2700
//600
//
//Output (stdout)
//The amount they need to arrange: 2600