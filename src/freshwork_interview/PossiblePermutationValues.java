package freshwork_interview;

import java.util.Scanner;

//Given the size N of array A, followed by the line of array elements. Find the sum of all possible permutation values.
//Constraints:
//1 < N < 9
//0 < A[i] < 10
//Example 1:
//Input:
//2
//1 2
//Output:
//33
//Explanation:
//The possible permutations are 12 and 21. Their sum will be 33.
//Example 2:
//Input:
//3
//1 2 3
//Output:
//1332

//public class PossiblePermutationValues {
//
//	// Sum of all possible permutations O(logn)
//	static long fac(int n) {
//		long f = 1;
//		for (int i = n; i > 1; i--)
//			f *= i;
//
//		return f;
//	}
//
//	public static void main(String[] args) {
//		int n, temp;
//		Scanner sc = new Scanner(System.in);
//		n = sc.nextInt();
//		temp = n;
//
//		long p = 1;
//		int a, i, sum = 0;
//
//		for (i = 0; i < n; i++) {
//			a = sc.nextInt();
//			sum += a;
//		}
//		while (--n != 0)
//			p = p * 10 + 1;
//
//		System.out.print(sum * fac(temp - 1) * p);
//	}
//
//}

//if the value is 1234
//1+2+3+4 = 10 - total;
//4*3*2*1 = 24- fac;
//n = 4(length);
//24/4 = 6 - result;
//result * 10 = 60;
//each row possible value is 60;

//import java.util.Scanner;
//
//public class Main {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int N = sc.nextInt();
//		int[] A = new int[N];
//
//		for (int i = 0; i < N; i++) {
//			A[i] = sc.nextInt();
//		}
//
//		int sum = calculatePermutationSum(A);
//		System.out.println(sum);
//	}
//
//	public static int calculatePermutationSum(int[] A) {
//		int[] factorials = new int[10];
//		factorials[0] = 1;
//
//		for (int i = 1; i <= 9; i++) {
//			factorials[i] = i * factorials[i - 1];
//			System.out.println("factorials" + factorials[i]);
//		}
//
//		int sum = 0;
//		int N = A.length;
//
//		for (int i = 0; i < N; i++) {
//			for (int j = 0; j < N; j++) {
//				if (i != j) {
//					int permutation = A[i] * 10 + A[j];
//					sum += permutation * factorials[N - 2];
//				}
//			}
//		}
//
//		return sum;
//	}
//}


//import java.util.Scanner;
 class Javas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        int sum = 0;
        int factorial = 1;
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
            sum +=A[i];
            factorial *=(i+1);
        }
        int freq = factorial/N;
        int res = freq * sum;
         // System.out.println("res "+res);
        int total = res;
        int finalValue = res;
        for(int i=0; i<N-1; i++){
           System.out.println("total "+total);
            total *=10;
            finalValue += total;
        }
        System.out.print(finalValue);
    }
}
