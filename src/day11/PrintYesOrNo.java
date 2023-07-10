package day11;

//Input (stdin)
//2 3
//3 1
//
//Output (stdout)
//NO
import java.util.Scanner;

public class PrintYesOrNo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int mugs = sc.nextInt();
		int cup = sc.nextInt();
		int[] arr = new int[mugs];
		for (int i = 0; i < mugs; i++) {
			arr[i] = sc.nextInt();
		}
		int value = 0;
		for (int i = 0; i < arr.length; i++) {
			value += arr[i];
		}
		if (value <= cup) {
			System.out.print("YES");
		} else {
			System.out.print("NO");
		}

	}

}
