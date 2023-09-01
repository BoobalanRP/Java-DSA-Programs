package dsa_day03_searching_and_sorting;

import java.util.*;
class Greatermarks
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int ramMarks = sc.nextInt();
    int arr[] = new int[n];
    for(int i=0; i<n; i++){
      arr[i] = sc.nextInt();
    }
    int count = 0;
    for(int i=0; i<n; i++){
        if(arr[i] >ramMarks){
          count++;
        
      }
    }
    
    
    System.out.println(count);
  }
}

//Input (stdin)
//3 2
//4 1 3
//
//Output (stdout)
//2