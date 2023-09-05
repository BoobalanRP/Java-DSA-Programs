package dsa_day12_BitwiseOperations;

import java.util.Scanner;

public class LongestConsecutiveOnes {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt(); // Number of test cases

		while (T-- > 0) {
			int N = sc.nextInt();
			int maxCount = 0;
			int currentCount = 0;

			while (N > 0) {
				if ((N & 1) == 1) {
					currentCount++;
				} else {
					maxCount = Math.max(maxCount, currentCount);
					currentCount = 0;
				}
				N >>= 1;
			}

			maxCount = Math.max(maxCount, currentCount);

			System.out.println(maxCount);
		}
	}
}

//import java.util.*;
//class Main
//{
//  public static void main(String args[])
//  {
//    Scanner input = new Scanner(System.in);
//    int n = input.nextInt();
//    int [] arr = new int[n];
//    for (int i = 0; i < n; i++) arr[i] = input.nextInt();
//    for (int i = 0; i < n; i++) {
//      int a = arr[i];
//      String res = "";
//      while (a != 0) {
//        res = (a % 2) + res;
//        a = a / 2;
//      }
//      int max = 0;
//      int count = 0;
//      for (int j = 0; j < res.length(); j++) {
//        if (res.charAt(j) == '1') count++;
//        else {
//          if (count > max) max = count;
//          count = 0;
//        }
//      }
//      System.out.println(max);
//    }
//  }
//}
//

//Input (stdin)
//2
//14
//222
//
//Output (stdout)
//3
//4
