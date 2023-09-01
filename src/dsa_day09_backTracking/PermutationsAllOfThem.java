package dsa_day09_backTracking;

import java.util.*;

public class PermutationsAllOfThem {

	static void swap(char arr[], int start, int end) {
        char temp = arr[end];
        arr[end] = arr[start];
        arr[start] = temp;
    }

    public static void permutaionOrder(char arr[], TreeSet<String> sortedArray, int fix) {
        if (fix == arr.length - 1) {
            sortedArray.add(String.valueOf(arr));
        }
        for (int i = fix; i <= arr.length - 1; i++) {
            swap(arr, i, fix);
            permutaionOrder(arr, sortedArray, fix + 1);
            swap(arr, i, fix);
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String val = sc.nextLine();
        char arr[] = val.toCharArray();
        TreeSet<String> sortedArray = new TreeSet<String>();
        permutaionOrder(arr, sortedArray, 0);
        for (String num : sortedArray) {
            System.out.println(num);
        }
    }

}

//Input (stdin)
//abc
//
//Output (stdout)
//abc
//acb
//bac
//bca
//cab
//cba