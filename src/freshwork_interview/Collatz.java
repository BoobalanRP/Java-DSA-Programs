package freshwork_interview;

import java.util.Map;
import java.util.TreeMap;

public class Collatz {

	public static int countOfSequence(int n) {
		int count = 1;
		while (n > 1) {
			if (n % 2 == 0) {
				n /= 2;
			} else {
				n = (3 * n) + 1;
			}
			count += 1;
		}
		return count;
	}

	public static void main(String[] args) {
		int n = 20000;
		int a = 0;
		int num = 0;
		for (int i = 2; i < n; i++) {
			int value = countOfSequence(i);
			if ( value > a) {
				a = value;
				num = i;
			}
		}

		System.out.println("The number that generates the longest sequence is : " + num);
	}

}


//public class LongestCollatzSequence {
//    public static void main(String[] args) {
//        long longestSequenceNumber = 0;
//        long maxLength = 0;
//
//        for (long i = 1; i < 20000; i++) {
//            long number = i;
//            long sequenceLength = 0;
//
//            while (number != 1) {
//                if (number % 2 == 0) {
//                    number /= 2;
//                } else {
//                    number = 3 * number + 1;
//                }
//                sequenceLength++;
//            }
//
//            if (sequenceLength > maxLength) {
//                maxLength = sequenceLength;
//                longestSequenceNumber = i;
//            }
//        }
//
//        System.out.println("Number under 20000 with the longest Collatz sequence: " + longestSequenceNumber);
//        System.out.println("Length of the longest sequence: " + maxLength);
//    }
//}
