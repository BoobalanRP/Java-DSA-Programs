package freshwork_interview;

import java.util.Scanner;

public class BirthdayCake {

public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		
		for(int i=0; i<test; i++) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			
			findCake(n,k);
		}
		
	}
	
	public static void findCake(int n, int k) {
		
		for(int i=1; i<n*k; i++) {
			int cake = i * k;
			
			if(cake % n == 0) {
				System.out.println(i);
				break;
			}
			
		}
		return;
	}

}

//Online Java Compiler

//Use this editor to write, compile and run your Java code online
//
//import java.util.Scanner;
//
//public class Main {
//
//	public static void main(String[] args) {
//
//		Scanner sc = new Scanner(System.in);
//		int test = sc.nextInt();
//
//		for (int i = 0; i < test; i++) {
//			int n = sc.nextInt();
//			int k = sc.nextInt();
//
//			findCake(n, k);
//		}
//
//	}
//
//	public static void findCake(int n, int k) {
//
//		int i = 1;
//		int cake = i * k;
//		while (cake % n > 0) {
//			cake = (i++) * k;
//		}
//		System.out.println(i);
//
//	}
//
//}
