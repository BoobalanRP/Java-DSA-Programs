package day23_Inhertence;

import java.util.Scanner;

class Student1 {
	protected String name;
	protected int age;
	protected char gender;

	public Student1(String name, int age, char gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public char getGender() {
		return gender;
	}
}

class ResultInfo extends Student1 {
	private int mark;
	private char grade;

	public ResultInfo(String name, int age, char gender, int mark, char grade) {
		super(name, age, gender);
		this.mark = mark;
		this.grade = grade;
	}

	public int getMark() {
		return mark;
	}

	public char getGrade() {
		return grade;
	}

	public int getPercentage() {
		return mark / 5;
	}
}

public class StudentGrade {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		int age = sc.nextInt();
		char gender = sc.next().charAt(0);
		int mark = sc.nextInt();
		char grade = sc.next().charAt(0);

		ResultInfo studentResult = new ResultInfo(name, age, gender, mark, grade);

		System.out.println("Enter student's basic information:");
		System.out.println("Name: ");
		System.out.println("Age: ");
		System.out.println("Gender: ");

		System.out.println("\nEnter student's result information:");
		System.out.println("Total Marks: ");
		System.out.println("Grade: ");
		System.out.println("Name: " + studentResult.getName());
		System.out.println("Age: " + studentResult.getAge());
		System.out.println("Gender: " + studentResult.getGender());
		System.out.println("Total Marks: " + studentResult.getMark());
		System.out.println("Percentage: " + studentResult.getPercentage());
		System.out.println("Grade: " + studentResult.getGrade());
	}
}

//
//Input (stdin)
//Kohli
//24
//M
//480
//A
//
//Output (stdout)
//Enter student's basic information:
//Name:
//Age:
//Gender:
//
//Enter student's result information:
//Total Marks:
//Grade:
//Name: Kohli
//Age: 24
//Gender: M
//Total Marks: 480
//Percentage: 96
//Grade: A