package day26_polymorphisym;

import java.util.Scanner;

class IndoorGame {
	public int calculateArea(int side, int length, int breadth) {
		return 0;
	}
}

class CarromBoard extends IndoorGame {
	@Override
	public int calculateArea(int side, int length, int breadth) {
		return side * side;
	}
}

class TTTable extends IndoorGame {
	@Override
	public int calculateArea(int side, int length, int breadth) {
		return length * breadth;
	}
}

public class PrintTwoNumberMultiplication {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int carromSide = scanner.nextInt();
		int ttLength = scanner.nextInt();
		int ttBreadth = scanner.nextInt();

		IndoorGame carrom = new CarromBoard();
		IndoorGame ttTable = new TTTable();

		int carromArea = carrom.calculateArea(carromSide, ttLength, ttBreadth);
		int ttTableArea = ttTable.calculateArea(carromSide, ttLength, ttBreadth);

		System.out.println(carromArea);
		System.out.println(ttTableArea);

		scanner.close();
	}
}
