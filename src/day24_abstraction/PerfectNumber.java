package day24_abstraction;

import java.util.*;

class PerfactNumber {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int div = (int) Math.ceil(num / 2);
		int total = 0;
		for (int i = 1; i <= div; i++) {
			if (num % i == 0) {
				total += i;
			}

		}
		if (total == num) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}
}

//6: The divisors of 6 are 1, 2, and 3. The sum of these divisors is 1 + 2 + 3 = 6, which makes 6 a perfect number.
//
//28: The divisors of 28 are 1, 2, 4, 7, and 14. The sum of these divisors is 1 + 2 + 4 + 7 + 14 = 28, making 28 a perfect number.
//
//496: The divisors of 496 are 1, 2, 4, 8, 16, 31, 62, 124, and 248. The sum of these divisors is 1 + 2 + 4 + 8 + 16 + 31 + 62 + 124 + 248 = 496, making 496 a perfect number.

//import java.util.*;
//
//abstract class PerfactNumber {
//    abstract void FindPerfact();
//}
//
//class GetPerfactNumber extends PerfactNumber {
//    @Override
//    void FindPerfact() {
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//        int div = (int) Math.ceil(num / 2);
//        int total = 0;
//        for (int i = 1; i <= div; i++) {
//            if (num % i == 0) {
//                total += i;
//            }
//        }
//        if (total == num) {
//            System.out.println("Yes");
//        } else {
//            System.out.println("No");
//        }
//    }
//}
//
//class Main {
//    public static void main(String args[]) {
//        GetPerfactNumber get = new GetPerfactNumber();
//        get.FindPerfact();
//    }
//}

//Input (stdin)
//15
//
//Output (stdout)
//No