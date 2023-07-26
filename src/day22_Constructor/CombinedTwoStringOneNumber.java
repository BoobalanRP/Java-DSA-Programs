package day22_Constructor;

import java.util.Scanner;

public class CombinedTwoStringOneNumber {

	String name;
	int num;
	float num2;

	public CombinedTwoStringOneNumber(int num, String name, float num2) {
		this.num = num;
		this.name = name;
		this.num2 = num2;
	}

	public String getResult() {
		return num + " " + name + " " + num2;
	}

	public static void main(String[] a) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.nextLine();
		String name = sc.nextLine();
		float num2 = sc.nextFloat();
		CombinedTwoStringOneNumber result = new CombinedTwoStringOneNumber(num, name, num2);
		System.out.println(result.getResult());
	}

}
//
//Input (stdin)
//1
//ram
//1000.0
//
//Output (stdout)
//1 ram 1000.0
