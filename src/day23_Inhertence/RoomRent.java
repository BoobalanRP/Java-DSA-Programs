package day23_Inhertence;

import java.util.*;

class RoomRent {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int rent = sc.nextInt();
		int ramSalary = sc.nextInt();
		int sathishSalary = sc.nextInt();
		int amountArrange = rent - (ramSalary + sathishSalary);
		System.out.println("The total amount of the rent is :");
		System.out.println("Remaining money from Ram's salary:");
		System.out.println("Remaining money from Sathish's salary:");
		System.out.println("To pay the rent amount they need to arrange : " + amountArrange + "Rs");
	}
}

//Input (stdin)
//5500
//2200
//1500
//
//Output (stdout)
//The total amount of the rent is :
//Remaining money from Ram's salary:
//Remaining money from Sathish's salary:
//To pay the rent amount they need to arrange : 1800Rs