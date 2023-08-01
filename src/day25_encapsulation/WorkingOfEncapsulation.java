package day25_encapsulation;

import java.util.*;

class Encapsulation {
	String val;
	int num;

	public Encapsulation(String val, int num) {
		this.val = val;
		this.num = num;
	}

	public void getEncapsulation() {
		System.out.println("Name: " + val);
		System.out.println("Project: " + num);
	}
}

class WorkingOfEncapsulation {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String val = sc.nextLine();
		int num = sc.nextInt();
		Encapsulation encap = new Encapsulation(val, num);
		encap.getEncapsulation();

	}
}

//Input (stdin)
//Pradheep
//5
//
//Output (stdout)
//Name: Pradheep
//Project: 5