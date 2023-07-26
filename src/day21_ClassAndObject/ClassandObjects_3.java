package day21_ClassAndObject;

import java.util.Scanner;

public class ClassandObjects_3 {
	String name;
	int roll;
	int mark;

	public ClassandObjects_3(String name, int roll, int mark) {
		this.name = name;
		this.roll = roll;
		this.mark = mark;
	}

	public String getname() {
		return name;
	}

	public int getroll() {
		return roll;
	}

	public int getmark() {
		return mark;
	}

	public float getpercentage() {
		return (float) mark / 5;
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name:");
		System.out.println("Enter roll number:");
		System.out.println("Enter total marks outof 500:");
		System.out.println("Student details:");
		String name = sc.nextLine();
		int roll = sc.nextInt();
		int mark = sc.nextInt();

		ClassandObjects_3 details = new ClassandObjects_3(name, roll, mark);

		System.out.println("Name: " + details.getname());
		System.out.println("Roll Number: " + details.getroll());
		System.out.println("Total: " + details.getmark());
		System.out.println("Percentage: " + details.getpercentage());

	}

}

//Input (stdin)
//Jai
//12
//458
//
//Output (stdout)
//Enter name:
//Enter roll number:
//Enter total marks outof 500:
//Student details:
//Name: Jai
//Roll Number: 12
//Total: 458
//Percentage: 91.6
