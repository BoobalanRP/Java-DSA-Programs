package day09_pattern;

//Sample Input:
//
//hello
//
//
//
//Sample Output:
//
//h   o
// e l 
//  l  
// e l 
//h   o
import java.util.Scanner;

public class CrossStringPattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String num = sc.next();
		int n = num.length();

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (j == i || j == n - i - 1) {
					System.out.print(num.charAt(j));
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
//Scanner scanner = new Scanner(System.in);
//String word = scanner.nextLine();
//int n = word.length();
//for (int i = 0; i < n; i++) {
//    for (int j = 0; j < n; j++) {
//        if (i == j ) {
//            System.out.print(word.charAt(i));
//        }else if( i == n - j - 1){
//         System.out.print(word.charAt(n-i-1));
//        }
//      else {
//            System.out.print(" ");
//        }
//    }
//    System.out.println();
//}