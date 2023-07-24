package day20_Exception;

import java.util.Scanner;

public class ArrayElementExceptionHandlingJava {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();

		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
		}
		int index = scanner.nextInt();
		try {
			int element = arr[index];
			System.out.println(element);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("java.lang.ArrayIndexOutOfBoundsException: " + index);
		}

	}

}


//Input (stdin)
//5
//10 20 30 4  5 
//10
//
//Output (stdout)
//java.lang.ArrayIndexOutOfBoundsException: 10




//Input (stdin)
//5
//10 20 30 4  5 
//2
//
//Output (stdout)
//30