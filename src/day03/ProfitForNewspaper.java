package day03;

import java.util.Scanner;

public class ProfitForNewspaper {

	public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int totalCost = (a * c) + 100;
        int revenue = a * b;
        int profit = revenue - totalCost;
   
        System.out.println(profit);

	}

}
