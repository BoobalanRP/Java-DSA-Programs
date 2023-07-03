package day03;

import java.util.Scanner;

public class DividedIntoTeams {

	public static void main(String[] args) {
		{
			Scanner n = new Scanner(System.in);
			int t1 = n.nextInt();
			int t2 = n.nextInt();

			int teams = t1 / t2;
			int leftOut = t1 % t2;
			System.out.println("The number of friends in each team is " + teams + " and left out is " + leftOut);

		}

	}

}
