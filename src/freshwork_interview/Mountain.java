package freshwork_interview;


import java.util.Scanner;

import java.util.*;


public class Mountain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // Number of mountains
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
         Arrays.sort(arr);
         int count = 0;
         int pt = n/2;
         int val = n;
         for(int i=0; i<n/2; i++){
             //for(int j=i+1; j<n; j++){
                 if((arr[pt]/arr[i])>=2 && arr[pt] !=-1){
                    val--;
                    arr[pt] = -1;
                    pt++;
                 }else{
                     pt++;
                 }
                 
             }
         
        // 2 5 7 6 9 8 4 2
        System.out.println(val);
    }
}


