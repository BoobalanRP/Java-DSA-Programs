package day10;

//The output consists of integers
//
//SAMPLE INPUT:
//
//3
//
//1
//
//2
//
//3
//
//SAMPLE OUTPUT:
//
//Odd: 2
//
//Even: 1
import java.util.Scanner;

public class CountTheArrayNumbersEvenOrOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int addCount = 0;
		int evenCount = 0;
		int n = sc.nextInt();
		int[] array = new int[n];
		for (int i = 0; i < n; i++) {
			array[i] = sc.nextInt();
			if (array[i] % 2 == 0) {
				evenCount++;
			} else {
				addCount++;
			}
		}
		System.out.println("Odd: " + addCount);
		System.out.println("Even: " + evenCount);

	}

}
