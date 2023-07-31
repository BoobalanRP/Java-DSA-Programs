package day23_Inhertence;

import java.util.Scanner;

public class PayrollSystem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.nextLine();
		int b = sc.nextInt();
		sc.nextLine();
		String c = sc.nextLine();
		String d = sc.nextLine();

		int e = sc.nextInt();
		sc.nextLine();
		int f = sc.nextInt();
		sc.nextLine();
		int g = sc.nextInt();
		sc.nextLine();
		int h = sc.nextInt();
		System.out.println("Enter the number of employee:");
		System.out.println("Enter the employee number:");
		System.out.println("Enter the employee name:");
		System.out.println("Enter the designation:");
		System.out.println("Enter the basic pay:");
		System.out.println("Enter the Humen Resource Allowance:");
		System.out.println("Enter the Dearness Allowance :");
		System.out.println("Enter the Profitablity Fund:");
		System.out.println("e_no\t" + " e_name\t" + " des\t" + " bp\t\t" + " hra\t" + " da\t\t" + " pf\t\t" + " np");
		System.out.println(b + "\t" + c + "\t" + d + "\t" + e + "\t" + +f + "\t" + g + "\t" + h + "\t" + ((g + h) * 2));

	}

}

//Input (stdin)
//1
//1234
//RAJ
//Software
//12000
//5000
//2000
//5000
//
//Output (stdout)
//Enter the number of employee:
//Enter the employee number:
//Enter the employee name:
//Enter the designation:
//Enter the basic pay:
//Enter the Humen Resource Allowance:
//Enter the Dearness Allowance :
//Enter the Profitablity Fund:
//e_no 	 e_name	 des 	 bp 	 hra 	 da 	 pf 	 np
//1234	RAJ	Software	12000	5000	2000	5000	14000
