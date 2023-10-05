package freshwork_interview;

public class ReverseThreeDigitNumberWithOutUsingString {

	public static void main(String[] args) {
		int number = 12345; // Change this to the number you want to reverse
		int reversedNumber = reverseNumber(number);
		System.out.println("Original number: " + number);
		System.out.println("Reversed number: " + reversedNumber);
	}

	public static int reverseNumber(int num) {
		int reversedNum = 0;

		while (num != 0) {
			int digit = num % 10; // Get the last digit
			reversedNum = reversedNum * 10 + digit; // Add the digit to the reversed number
			num = num / 10; // Remove the last digit
		}

		return reversedNum;
	}

}
