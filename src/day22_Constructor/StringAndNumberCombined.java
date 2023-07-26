package day22_Constructor;

import java.util.Scanner;

public class StringAndNumberCombined {
	String name;
	int num;

	public StringAndNumberCombined(int num, String name) {
		this.num = num;
		this.name = name;
	}

	public String getResult() {
		return num + " " + name;
	}

	public static void main(String[] a) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.nextLine();
		String name = sc.nextLine();
		StringAndNumberCombined result = new StringAndNumberCombined(num, name);
		System.out.println(result.getResult());
	}
}

//Input (stdin)
//132575
//Christy
//
//Output (stdout)
//132575 Christy
