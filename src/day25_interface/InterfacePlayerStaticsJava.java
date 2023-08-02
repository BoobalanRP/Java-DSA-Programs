package day25_interface;

import java.util.*;

class InterfacePlayerStaticsJava {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		String nation = sc.nextLine();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		System.out.println("Player Details");
		System.out.println("Player name: " + name);
		System.out.println("Team name: " + nation);
		System.out.println("No of matches: " + a);
		System.out.println("Total runs scored:" + b);
		System.out.println("No of wickets taken:" + c);
	}
}