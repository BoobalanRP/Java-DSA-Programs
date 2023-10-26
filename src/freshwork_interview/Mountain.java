package freshwork_interview;

import java.util.*;
import java.util.Scanner;

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
         for(int i=0; i<n-1; i++){
             for(int j=i+1; j<n; j++){
                 if((arr[j]/arr[i])>=2 && arr[j] !=-1){
                    count ++;
                    arr[j] = -1;
                    break;
                 }
                 
             }
         }
        // 2 5 7 6 9 8 4 2
        System.out.println(n - count);
    }
}

