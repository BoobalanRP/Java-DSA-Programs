package day08;

import java.util.Scanner;

public class SeriesXII {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        int num = sc.nextInt();
	        int term1 = 9;
	        int term2 = 11;
	        System.out.print(term1 + " " + term2 + " ");
	        for (int i = 3; i <= num; i++) {
	            int currentTerm = term1 + term2;
	            System.out.print(currentTerm + " ");
	            term1 = term2;
	            term2 = currentTerm;
	        }

	}

}
