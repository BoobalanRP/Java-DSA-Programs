package day18_Recursion;

import java.util.Scanner;

class GreatMain {
	public static int GreatestCommonDivisors(int a, int b) {
		if (b == 0) {
			return a;
		} else {
			return GreatestCommonDivisors(b, a % b);
		}
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();

		int gcd = GreatestCommonDivisors(m, n);
		System.out.println("G.C.D of " + m + " and " + n + " is " + gcd);
	}
}

//class Main{
//
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int n1 = sc.nextInt();
//		int n2 = sc.nextInt();
//		
//		while( n2!= 0){
//		    int temp = n2; 
//		    n2 = n1%n2;
//		    n1 = temp;
//		    
//		}
//		
//		System.out.println(n1);
//	}
//
//}
