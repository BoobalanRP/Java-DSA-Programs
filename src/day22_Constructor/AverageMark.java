package day22_Constructor;

import java.util.Scanner;

public class AverageMark {

	int mark1;
	int mark2;

	public AverageMark(int mark1, int mark2) {
		this.mark1 = mark1;
		this.mark2 = mark2;
	}

	public int getAverage() {
		return (mark1 + mark2) / 2;
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int mark1 = sc.nextInt();
		sc.nextLine();
		int mark2 = sc.nextInt();
		AverageMark result = new AverageMark(mark1, mark2);

		System.out.print(result.getAverage());
	}

}

//Input (stdin)
//10
//20
//
//Output (stdout)
//15
