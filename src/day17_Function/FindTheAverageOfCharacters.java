package day17_Function;

import java.util.*;

class AverageMain {
	public static int FindTheAverageOfCharacters(char[] arr, int len) {
		int value = 0;

		for (int i = 0; i < len; i++) {
			value += (int) arr[i];
		}
		int average = (int) value / len;
		return average;
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String word = sc.next();
		char[] array = new char[num];
		for (int i = 0; i < num; i++) {
			array[i] = word.charAt(i);
		}

		int result = FindTheAverageOfCharacters(array, num);
		System.out.print(result);
	}
}

//Input (stdin)
//6 
//source
//
//Output (stdout)
//109
