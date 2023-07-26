package day21_ClassAndObject;

import java.util.Scanner;

public class Employee {

	private int staffId;
	private String name;
	private int salary;

	public Employee(int staffId, String name, int salary) {
		this.staffId = staffId;
		this.name = name;
		this.salary = salary;
	}

	public int getStaffId() {
		return staffId;
	}

	public String getName() {
		return name;
	}

	public int getSalary() {
		return salary;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter No.of Records You Want : \n");
		int numRecords = scanner.nextInt();
		Employee[] employees = new Employee[numRecords];

		int choice;
		int staffId;
		String name;
		int salary;

		do {
			System.out.println("1. Accept Data");
			System.out.println("2. Display Data");
			System.out.println("3. Sort Data by Name");
			System.out.println("4. Exit:");
			System.out.println("Enter Your Choice : ");
			choice = scanner.nextInt();

			switch (choice) {
			case 1:
				for (int i = 0; i < numRecords; i++) {
					System.out.println("Enter Data for Employee " + (i + 1));
					System.out.println("Enter Staff Id : ");
					staffId = scanner.nextInt();
					scanner.nextLine(); // Clear the buffer
					System.out.println("Enter Staff Name : ");
					name = scanner.nextLine();
					System.out.println("Enter Salary : ");
					salary = scanner.nextInt();
					employees[i] = new Employee(staffId, name, salary);
				}
				break;

			case 2:
				displayData(employees);
				break;

			case 3:
				sortDataByName(employees);
				System.out.println("Data is Sorted!!!\n");
				break;
			}
		} while (choice != 4);

		scanner.close();
	}

	private static void displayData(Employee[] employees) {
		for (Employee employee : employees) {
			System.out.println("Staff Id : " + employee.getStaffId());
			System.out.println("Name : " + employee.getName());
			System.out.println("Salary : " + employee.getSalary() + "\n");
		}
	}

	private static void sortDataByName(Employee[] employees) {
		for (int i = 0; i < employees.length - 1; i++) {
			for (int j = i + 1; j < employees.length; j++) {
				if (employees[i].getName().compareTo(employees[j].getName()) > 0) {
					Employee temp = employees[i];
					employees[i] = employees[j];
					employees[j] = temp;
				}
			}
		}
	}

}

//
//Input (stdin)
//2
//1
//12
//Jethro
//20000
//11
//Jeshua 
//15000
//2
//3
//4
//
//Output (stdout)
//Enter No.of Records You Want :
//1. Accept Data
//2. Display Data
//3. Sort Data by Name
//4. Exit:
//Enter Your Choice :
//Enter Data for Employee 1
//Enter Staff Id :
//Enter Staff Name :
//Enter Salary :
//Enter Data for Employee 2
//Enter Staff Id :
//Enter Staff Name :
//Enter Salary :
//1. Accept Data
//2. Display Data
//3. Sort Data by Name
//4. Exit:
//Enter Your Choice :
//Staff Id : 12
//Name : Jethro
//Salary : 20000
//
//Staff Id : 11
//Name : Jeshua
//Salary : 15000
//
//1. Accept Data
//2. Display Data
//3. Sort Data by Name
//4. Exit:
//Enter Your Choice :
//Data is Sorted!!!
//
//1. Accept Data
//2. Display Data
//3. Sort Data by Name
//4. Exit:
//Enter Your Choice :