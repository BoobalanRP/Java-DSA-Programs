package dsa_day11_BitwiseOperations;

import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
        int m = sc.nextInt();
    n = n^m;
    m = n^m;
    n  = n^m;
    
    System.out.println(n);
     System.out.println(m);
  }
}

//Input (stdin)
//5
//2
//
//Output (stdout)
//2
//5