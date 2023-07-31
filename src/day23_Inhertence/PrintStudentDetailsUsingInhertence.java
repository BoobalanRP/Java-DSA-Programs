package day23_Inhertence;

import java.util.Scanner;

class Student {
	private String name;
	private Integer age;
	private char gender;
	private Long idNum;
	private Double cgpa;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public Long getIdNum() {
		return idNum;
	}

	public void setIdNum(Long idNum) {
		this.idNum = idNum;
	}

	public Double getCgpa() {
		return cgpa;
	}

	public void setCgpa(Double cgpa) {
		this.cgpa = cgpa;
	}

	public String toString() {
		return "ID : " + getIdNum() + "\nName : " + getName() + "\nAge : " + getAge() + "\nGender : " + getGender();
	}
}

class CollegeStudent extends Student {
	private String major;
	private Integer year;

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public String toString() {
		return super.toString() + "\nMajor : " + getMajor() + "\nCGPA : " + getCgpa() + "\nYear : " + getYear();
	}
}

public class PrintStudentDetailsUsingInhertence {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Name ");
		String name = scanner.nextLine();
		System.out.println("Age ");
		int age = scanner.nextInt();
		System.out.println("Gender ");
		char gender = scanner.next().charAt(0);
		System.out.println("ID Number");
		long idNum = scanner.nextLong();
		scanner.nextLine();
		System.out.println("Major ");
		String major = scanner.nextLine();
		System.out.println("CGPA ");
		double cgpa = scanner.nextDouble();
		System.out.println("Year ");
		int year = scanner.nextInt();

		scanner.close();

		CollegeStudent collegeStudent = new CollegeStudent();
		collegeStudent.setName(name);
		collegeStudent.setAge(age);
		collegeStudent.setGender(gender);
		collegeStudent.setIdNum(idNum);
		collegeStudent.setMajor(major);
		collegeStudent.setCgpa(cgpa);
		collegeStudent.setYear(year);

		System.out.println("The Student details is");
		System.out.println(collegeStudent.toString());
	}
}

//Input (stdin)
//Lucy
//21
//F
//123456789
//CSE
//7.8
//4
//
//Output (stdout)
//Name
//Age
//Gender
//ID Number
//Major
//CGPA
//Year
//The Student details is
//ID : 123456789
//Name : Lucy
//Age : 21
//Gender : F
//Major : CSE
//CGPA : 7.8
//Year : 4