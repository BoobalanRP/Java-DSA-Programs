package day21_ClassAndObject;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    int val = sc.nextInt();
	    int total = 1;
	    for(int i=1; i<=val; i++){
	      total *=i;
	    }
	    System.out.println(total);

	}

}


//Input (stdin)
//7
//
//Output (stdout)
//5040