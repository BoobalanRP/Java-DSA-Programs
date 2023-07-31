package day23_Inhertence;

import java.util.Scanner;

class Patient {
	private String name;
	private int bedNumber;
	private int wardName;
	private String doctorName;
	private String doctorateDegree;
	private int dues;

	public Patient(String name, int bedNumber, int wardName, String doctorName, String doctorateDegree, int dues) {
		this.name = name;
		this.bedNumber = bedNumber;
		this.wardName = wardName;
		this.doctorName = doctorName;
		this.doctorateDegree = doctorateDegree;
		this.dues = dues;
	}

	public void displayDetails() {
		System.out.println("Inserted Data");
		System.out.println("Patient Name : " + name);
		System.out.println("Bed Number : " + bedNumber);
		System.out.println("Ward Name : " + wardName);
		System.out.println("Doctor Name : " + doctorName);
		System.out.println("Doctorate Degree : " + doctorateDegree);
		System.out.println("Total Dues of Patient : " + dues);
	}
}

public class PatientDetails {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Data");

		System.out.println("Enter Patient Name : ");
		String name = sc.nextLine();

		System.out.println("Enter Bed Number : ");
		int bedNumber = sc.nextInt();

		System.out.println("Enter Ward Name : ");
		int wardName = sc.nextInt();
		sc.nextLine();

		System.out.println("Enter the Doctor Name : ");
		String doctorName = sc.nextLine();

		System.out.println("Enter Doctorate Degree : ");
		String doctorateDegree = sc.nextLine();

		System.out.println("Enter Dues of Patient : ");
		int dues = sc.nextInt();

		Patient patient = new Patient(name, bedNumber, wardName, doctorName, doctorateDegree, dues);
		patient.displayDetails();
	}
}

//Input (stdin)
//SIVA
//13
//5
//Dinesh
//MBBS
//4
//
//Output (stdout)
//Enter Data
//Enter Patient Name :
//Enter Bed Number :
//Enter Ward Name :
//Enter the Doctor Name :
//Enter Doctorate Degree :
//Enter Dues of Patient :
//Inserted Data
//Patient Name : SIVA
//Bed Number : 13
//Ward Name : 5
//Doctor Name : Dinesh
//Doctorate Degree : MBBS
//Total Dues of Patient : 4
