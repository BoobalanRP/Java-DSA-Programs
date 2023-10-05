package freshwork_interview;

public class SumOfNumbersInString {

	public static void main(String[] args) {

		String word = "jci283jec7k";
		String[] parts = word.split("\\D+");

		int total = 0;

		for (String part : parts) {
			if (!part.isEmpty()) {
				total += Integer.parseInt(part);
			}
		}

		System.out.println(total);
	}

}

//public class SumOfNumbersInString {
//    public static void main(String[] args) {
//        String word = "jci283jec7k";
//        int total = 0;
//        int currentNumber = 0;
//
//        for (char c : word.toCharArray()) {
//            if (Character.isDigit(c)) {
//                // Convert the character to a digit and build the number
//                currentNumber = currentNumber * 10 + (c - '0');
//            } else {
//                // If a non-digit character is encountered, add the current number to the total
//                total += currentNumber;
//                currentNumber = 0; // Reset the current number
//            }
//        }
//
//        // Add the last number if the string ends with a digit
//        total += currentNumber;
//
//        System.out.println(total);
//    }
//}
//public class SumOfNumbersInString {
//    public static void main(String[] args) {
//        String word = "jci283jec77";
//        int total = 0;
//        StringBuilder currentNumberStr = new StringBuilder();
//
//        for (char c : word.toCharArray()) {
//            if (Character.isDigit(c)) {
//                // Append the digit character to the currentNumberStr
//                currentNumberStr.append(c);
//            } else if (currentNumberStr.length() > 0) {
//                // If a non-digit character is encountered and currentNumberStr is not empty, 
//                // convert it to an integer and add it to the total
//                total += Integer.parseInt(currentNumberStr.toString());
//                currentNumberStr.setLength(0); // Reset currentNumberStr
//            }
//        }
//
//        // Add the last number if the string ends with a digit
//        if (currentNumberStr.length() > 0) {
//            total += Integer.parseInt(currentNumberStr.toString());
//        }
//
//        System.out.println(total);
//    }
//}