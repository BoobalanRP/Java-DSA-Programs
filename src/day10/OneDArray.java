package day10;
//INPUT & OUTPUT FORMAT:
//
//The first line corresponds to the size of the array n.
//
//The next line corresponds to the number of inputs.
//
//The output consists of the elements in the array.
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
//1
//
//2
//
//3
import java.util.Scanner;

public class OneDArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int val = sc.nextInt();
		int[] array = new int[val];

		for (int i = 0; i < val; i++) {
			array[i] = sc.nextInt();
			System.out.println(array[i]);
		}

	}

}
