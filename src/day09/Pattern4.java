package day09;
//Sample Input:
//5
//
//Sample Output:
//
//5 5 5 5 5
//
//4 5 5 5 5
//
//3 4 5 5 5
//
//2 3 4 5 5
//
//1 2 3 4 5

import java.util.Scanner;

public class Pattern4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <=n; i++) {
          if(i >= 2){
             for (int j = i - 1; j >= 0; j--) {
                  System.out.print(n - j);
             }
            for (int j = 1; j <= n-i ; j++) {
                  System.out.print(n);
              }
          }
           if( i == 1){
              for (int j = 1; j <= n; j++) {
                  System.out.print(n);
           }
           }
            System.out.println();
        }
    
    }

	}


