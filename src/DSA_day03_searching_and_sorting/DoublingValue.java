package dsa_day03_searching_and_sorting;

import java.util.*;
class DoublingValue
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    for(int i=0; i<n; i++){
      arr[i] = sc.nextInt();
    }
     int findValue = sc.nextInt();
    int value = findValue;
     for(int i=0; i<n; i++){
       if(value ==arr[i]){
         value = value+value;
       }
     }
    System.out.println(value);
  }
}

//Input (stdin)
//5
//1 2 3 4 8
//2
//
//Output (stdout)
//16
//
//
//Input (stdin)
//3
//1 2 4
//1
//
//Output (stdout)
//8