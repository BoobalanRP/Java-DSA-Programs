package freshwork_interview;

import java.util.*;

//There are N bulbs that are initially off. In the first round, you turn ON all the bulbs, then you turn off every
//
//second bulb in the second round. On the third round, you toggle every third bulb (turning ON if it's OFF or vice-
//versa). For the Ith round, you toggle every Ith bulb. For the Nth round, you only toggle the last bulb.
//
//Return the number of bulbs that are ON after the N rounds.
//Input :1
//25
//Output: 1
//1 4 9 16 25
//Total Number of Bulbs : 5
//Input: 2
//38
//Output: 2
//1 4 9 16 25 36
public class ToggleEveryBulb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        perfectSquares(n);
    }

    static void perfectSquares(int n) {
        int count = 0;
        for (int i = 1; i * i <= n; i++) {
            System.out.print(i * i + " ");
            count++;
        }
        System.out.println("\nTotal Number of Perfect Squares: " + count);
    }
}

//import java.util.*;
//
//class Main {
//	public static int count = 0;
//
//	static void perfectSquares(int l, int r) {
//		for (int i = l; i <= r; i++) {
//			if (Math.sqrt(i) == (int) Math.sqrt(i)) {
//				System.out.print(i + " ");
//				count++;
//			}
//		}
//	}
//
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//
//		int n = sc.nextInt();
//		perfectSquares(1, n);
//		System.out.println("\nTotal Number of Bulbs " + count);
//	}
//}
