package day06;
//In the University Examinations conducted during the past 5 years, the toppers registration numbers were 7126, 82417914, 7687 and 6657.
//Your father is an expert in data mining and he could easily infer a pattern in the toppers registration numbers. 
//In all the registration numbers listed here, the sum of the odd digits is equal to the sum of the even digits in the number. 
//He termed the numbers that satisfy this property as Probable Topper Numbers.
//Write a program to find whether a given number is a probable topper number or not.
//Input Format: Input consists of a single integer. Output Format: Output consists of a single line. Refer sample output for details.
//
//Sample Input 1:
//143
//
//Sample Output 1:
//yes
//


import java.util.Scanner;

public class DataMiningFindMark {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String val = Integer.toString(num);
		char val1;
		int num1 = 0, total = 0, total1 = 0;

		for (int i = 0; i < val.length(); i++) {
			val1 = val.charAt(i);
			num1 = Character.getNumericValue(val1);
			if (num1 % 2 == 1) {
				total += num1;
			} else {
				total1 += num1;
			}

		}
		if (total == total1) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}

	}

}
