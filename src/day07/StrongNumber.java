package day07;

import java.util.Scanner;

public class StrongNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		char num;
		int count = 1;
		String a = Integer.toString(n);
		int[] array = new int[a.length()];
		int[] array1 = new int[a.length()];
		for (int i = 0; i < array.length; i++) {
			num = a.charAt(i);
			array[i] = Character.getNumericValue(num);
			
//			to find the number's factorial
			for (int j = array[i]; j >= 1; j--) {
				count *= j;
			}
			array1[i] = count;
			count = 1;
		}
		int totalvalue = 0;
		
//		to add all the factorial values in that array
		for (int k = 0; k < array1.length; k++) {
			totalvalue += array1[k];
		}
		if (totalvalue == n) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}

}
