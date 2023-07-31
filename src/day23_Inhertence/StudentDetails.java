package day23_Inhertence;

import java.util.Scanner;

public class StudentDetails {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		int age = sc.nextInt();
		int mark = sc.nextInt();
		System.out.println(name + " " + age);
		double percentage = (double) mark / 5;
		System.out.println(percentage);
	}

}

//Input (stdin)
//Arun
//25
//480
//
//Output (stdout)
//Arun 25
//96.0