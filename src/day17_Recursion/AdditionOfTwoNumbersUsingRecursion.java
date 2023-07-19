package day17_Recursion;

class HelloWorld {

	public static int AdditionOfTwoNumbersUsingRecursion(int a, int b) {
		if (b >= a) {
			return a + AdditionOfTwoNumbersUsingRecursion(a + 1, b);
		} else {
			return 0;
		}

	}

	public static void main(String[] args) {
		int start = 1;
		int end = 100;
		int total = AdditionOfTwoNumbersUsingRecursion(start, end);

		System.out.print("total: " + total);
	}
}
