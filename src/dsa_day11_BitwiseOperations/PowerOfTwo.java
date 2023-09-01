package dsa_day11_BitwiseOperations;

import java.math.BigInteger;
import java.util.Scanner;

public class PowerOfTwo {

	public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        String input = s.nextLine().trim();
        BigInteger n = new BigInteger(input);
        int count = 0;
        BigInteger one = new BigInteger("1");
        BigInteger zero = new BigInteger("0");

        while (!n.equals(zero)) {
            if (n.and(one).equals(one)) {
                count++;
            }
            n = n.shiftRight(1);
        }
        
        if (count == 1) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

}


//import java.util.*;
//class Main
//{
//  public static void main(String args[])
//  {
//    Scanner sc= new Scanner(System.in);
//   	long n = sc.nextLong();
//      int count = 0;
//
//      while(n > 0){
//        if((n & 1) == 1){
//          count++;
//        }
//        n = n>>1;
//      }
//  
//    
//    if(count == 1){
//      System.out.println("true");
//    } else {
//      System.out.println("false");
//    }
//    
//    
//  }
//}
