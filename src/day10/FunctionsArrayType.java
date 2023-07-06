package day10;

//Input (stdin)
//5
//1
//2
//3
//6
//9
//
//Output (stdout)
//The array is Mixed
import java.util.Scanner;

public class FunctionsArrayType {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		boolean allEven = true;
		boolean allOdd = true;

		for (int i = 0; i < n; i++) {
			if (arr[i] % 2 == 0) {
				allOdd = false;
			} else {
				allEven = false;
			}
		}

		if (allEven) {
			System.out.println("The array is Even");
		} else if (allOdd) {
			System.out.println("The array is Odd");
		} else {
			System.out.println("The array is Mixed");
		}

	}

}
