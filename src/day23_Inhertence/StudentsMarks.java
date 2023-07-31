package day23_Inhertence;

import java.util.Scanner;

public class StudentsMarks {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int rollNumber = sc.nextInt();
		sc.nextLine();

		int subject1Marks = sc.nextInt();
		int subject2Marks = sc.nextInt();

		int totalMarks = subject1Marks + subject2Marks;

		// Print the output
		System.out.println("Roll Number Is:");
		System.out.println(rollNumber);
		System.out.println("Subject 1:" + subject1Marks);
		System.out.println("Subject 2:" + subject2Marks);
		System.out.println("Total:" + totalMarks);

	}

}

//
//Input (stdin)
//5
//10
//20
//
//Output (stdout)
//Roll Number Is:
//5
//Subject 1:10
//Subject 2:20
//Total:30