package day25_encapsulation;

class Person {
	String name;
	String lname;
	int age;

	public void setFirstName(String name) {
		this.name = name;
	}

	public void setLastName(String lname) {
		this.lname = lname;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getFullName() {
		return name.concat(" ").concat(lname);
	}

	public boolean isTeen() {
		if (age < 18) {
			return false;
		} else {
			return true;
		}
	}

}

public class NamePerson {
	public static void main(String args[]) {
		Person person = new Person();
		person.setFirstName("");
		person.setLastName("");
		person.setAge(10);
		System.out.println("Full Name = " + person.getFullName());
		System.out.println("Teen = " + person.isTeen());
		person.setFirstName("John");
		person.setAge(18);
		System.out.println("Full Name = " + person.getFullName());
		System.out.println("Teen = " + person.isTeen());
		person.setLastName("Smith");
		System.out.println("Full Name = " + person.getFullName());
	}
}