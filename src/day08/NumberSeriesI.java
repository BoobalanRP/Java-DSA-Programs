package day08;

import java.util.Scanner;

public class NumberSeriesI {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	      int n = sc.nextInt();
	      int value = 0;
	      for(int i=1; i<=n; i++){
	        value  = i* i;
	           System.out.print(value + " " );
	      }

	}

}
