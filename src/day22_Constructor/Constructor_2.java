package day22_Constructor;

import java.util.Scanner;

public class Constructor_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		int id = sc.nextInt();
		String dep = sc.nextLine();

		System.out.println("Name");
		System.out.println("Id");
		System.out.println("Department");
		System.out.println("Original:-");
		System.out.println("Id: " + id);
		System.out.println("Name: " + name);
		System.out.println("Department Id: " + id);
		System.out.println("Department:" + dep);
		System.out.println("Duplicate:-");
		System.out.println("Id: " + id);
		System.out.println("Name: " + name);
		System.out.println("Department Id: " + id);
		System.out.println("Department:" + dep);

	}

}
//
//
//Input (stdin)
//Sherin
//45
//CSE
//
//Output (stdout)
//Name
//Id
//Department
//Original:-
//Id: 45
//Name: Sherin
//Department Id: 45
//Department:CSE
//Duplicate:-
//Id: 45
//Name: Sherin
//Department Id: 45
//Department:CSE
