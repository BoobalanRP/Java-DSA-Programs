package dsa_day11_BitwiseOperations;

import java.util.Scanner;

public class BitwiseOperations {

 public static void main(String args[])
  {
    //Try out your code here
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int count = 0;
    int min = 0;
    int lastIndex = 0;
    if(n==0){
      System.out.println("0#0#0");
    }else{
    while(n > 0){
      lastIndex++;
      if((n & 1) == 1){
        count++;
        if(min == 0){
        	min = lastIndex;
        
        }
      }
      n = n>>1;
    }
    System.out.println(count+"#"+(min-1)+"#"+(lastIndex-1));
  }
  }
}

//
//Input (stdin)
//10
//
//Output (stdout)
//2#1#3
//
//Input (stdin)
//1
//
//Output (stdout)
//1#0#0

