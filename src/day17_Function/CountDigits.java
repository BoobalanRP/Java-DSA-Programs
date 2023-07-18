package day17_Function;

import java.util.*;

class CounSumtMain {
	public static int CountDigits(int num) {
		int count = 0;
		String val = num + "";
		for (int i = 0; i < val.length(); i++) {
			count++;
		}
		int total = num % count;
		return total;
	}

	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		System.out.print(CountDigits(num));
	}
}
