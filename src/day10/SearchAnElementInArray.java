package day10;

//Input (stdin)
//5
//2
//3
//6
//8
//1
//9
//
//Output (stdout)
//9 is not present in the array


import java.util.Scanner;

public class SearchAnElementInArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int search = sc.nextInt();
		boolean searnInput = false;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == search) {
				searnInput = true;
			}
		}
		if (searnInput) {
			System.out.print(search + " is present in the array");
		} else {
			System.out.print(search + " is not present in the array");
		}

	}

}
