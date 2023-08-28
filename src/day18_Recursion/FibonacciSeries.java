package day18_Recursion;

import java.util.Scanner;

class FibonachiMain {
	static int n1 = 0, n2 = 1, n3 = 0;

	static void printFibo(int count, int val) {
		if (count > 0) {
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
			printFibo(count - 1, val);
		}
		if (count == 0) {
			System.out.print("The term " + val + " in the fibonacci series is " + n3);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();

		printFibo(count - 2, count);
	}
}

//Input (stdin)
//4
//
//Output (stdout)
//The term 4 in the fibonacci series is 2

//import java.util.*;
//
//class Main {
//   
//    public static int fibonacci(int num) {
//   
//        if (num == 0) {
//           return 0;
//        }else if( num == 1){
//             return 1;
//        }
//       return fibonacci(num-1) +  fibonacci(num-2);
//    }
//    
//    public static void main(String[] args) {
//       
//      int num = 5;
//        int val = fibonacci(num);
//          System.out.print(val);
//    }
//}
