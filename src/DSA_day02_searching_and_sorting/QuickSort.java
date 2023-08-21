package DSA_day02_searching_and_sorting;

import java.util.*;
public class QuickSort{
    public static void change(int a[], int i, int j)
    {
        int t=a[i];
        a[i]=a[j];
        a[j]=t;
    }
    public static int pivott(int a[],int start, int end)
    {
        int pivot=a[end],i=start-1,j;
        for(j=start; j<end;)
        {
            if(a[j]<pivot)
            {
                i++;
                change(a,i,j);
                j++;
            }
            else
                j++;
        }
        change(a,i+1,end);
        return (i+1);
        
    }
    public static void q_s(int a[], int start, int end)
    {
        if(start<end)
        {
            int m=pivott(a,start,end);
            q_s(a,start,m-1);
            q_s(a,m+1,end);
        }
    }
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        for(int i=0; i<n; i++)
            a[i]=s.nextInt();
        q_s(a,0,n-1);
        for(int i=0; i<n; i++)
            System.out.println(a[i]);
    }
}