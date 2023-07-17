package day15_String;
//Input (stdin)

//Perfect picture
//
//Output (stdout)
//Characters and their corresponding frequencies
//P-1
//e-3
//r-2
//f-1
//c-2
//t-2
//p-1
//i-1
//u-1

import java.util.Scanner;

public class FrequencyOfCharStringJava {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int[] freq = new int[str.length()];
		int i, j;
		char string[] = str.toCharArray();
		for (i = 0; i < str.length(); i++) {
			freq[i] = 1;
			for (j = i + 1; j < str.length(); j++) {
				if (string[i] == string[j]) {
					freq[i]++;
					string[j] = '0';
				}
			}
		}
		System.out.println("Characters and their corresponding frequencies");
		for (i = 0; i < freq.length; i++) {
			if (string[i] != ' ' && string[i] != '0')
				System.out.println(string[i] + "-" + freq[i]);
		}

	}

}
