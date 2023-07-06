package day08;

import java.util.Scanner;

public class SeriesXV {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int fst = 3;
		int snd = 8;
		System.out.print(fst + " " + snd + " ");
		for (int i = 2; i < input; i++) {
			int ne = fst + snd + i;
			System.out.print(ne + " ");
			fst = snd;
			snd = ne;
		}

	}

}
