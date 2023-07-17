package day15_String;

import java.util.Scanner;

//Input (stdin)
//An apple keeps a- doctor away.
//
//Output (stdout)
//Smallest word: An
//Largest word: doctor

public class LargestAndSmallestString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String[] ptn = s.split("[ ]+");
		int[] arr = new int[10];
		for (int i = 0; i < ptn.length; i++) {
			arr[i] = ptn[i].length();
		}
		int minIndex = 0;
		int maxIndex = 0;
		for (int i = 1; i < ptn.length; i++) {
			if (arr[i] < arr[minIndex]) {
				minIndex = i;
			}
			if (arr[i] > arr[maxIndex]) {
				maxIndex = i;
			}
		}
		System.out.println("Smallest word: " + ptn[minIndex]);
		System.out.println("Largest word: " + ptn[maxIndex]);

	}

}
