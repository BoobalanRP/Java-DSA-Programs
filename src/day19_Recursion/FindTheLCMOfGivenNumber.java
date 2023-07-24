package day19_Recursion;

import java.util.Scanner;

public class FindTheLCMOfGivenNumber {

	 public static int gcd(int a, int b) {
	        if (b == 0) {
	            return a;
	        }
	        return gcd(b, a % b);
	    }

	    public static int lcm(int a, int b) {
	        return (a * b) / gcd(a, b);
	    }

	    public static void main(String args[]) {
	        Scanner sc = new Scanner(System.in);
	        int n1 = sc.nextInt();
	        int n2 = sc.nextInt();

	        int result = lcm(n1, n2);
	        System.out.println(result);
	    }

}
//public class Lcm {
//
//	public static int lcm(int n, int m, int nm) {
//		if (nm % n == 0 && nm % m == 0) {
//			return nm;
//		} else {
//			return lcm(n, m, nm + 1);
//		}
//	}
//
//	public static void main(String args[]) {
//		
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int m = sc.nextInt();
//
//		System.out.println(lcm(n, m, n > m ? n : m));
//	}
//
//}

//Input 
//10
//9
//Output
//90