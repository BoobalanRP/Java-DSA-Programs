package day11;
//Input (stdin)
//5
//1
//2
//2
//3
//4
//
//Output (stdout)
//1
//2
//3
//4
import java.util.Scanner;

public class RemoveDublucateElementsInArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		for (int i = 0; i < n; i++) {
			boolean distinct = true;
			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					distinct = false;
					break;
				}
			}
			if (distinct) {
				System.out.println(arr[i]);
			}
		}

	}

}
