package DSA_day03_searching_and_sorting;

import java.util.*;
public class QuickSortDay03{
  public static void swapElement(int a[], int i, int j){
    int temp = a[i];
    a[i] = a[j];
    a[j] = temp;
  }
  public static int pivot(int a[], int start, int end){
    int pivot = a[end], i = start -1,j;
    for(j = start; j<end;){
      if(a[j] < pivot){
        i++;
        swapElement(a, i, j);
        j++;
      }else
        j++;
    }
     swapElement(a, i+1, end);
    return (i+1);
    
  }
    public static void quick_sort(int a[],int start, int end){
      if(start<end){
        int midValue = pivot(a, start, end);
        quick_sort(a, start, midValue-1);
        quick_sort(a, midValue+1, end);
      }
    }
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        for(int i=0; i<n; i++){
            a[i]=s.nextInt();
        }
      quick_sort(a, 0, n-1);
        for(int i=0; i<n; i++)
            System.out.print(a[i]+ " ");
    }
}

//Input (stdin)
//3
//12
//15
//14
//
//Output (stdout)
//12 14 15