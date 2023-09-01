package dsa_day05_timeComplexcity;

public class Equilibrium {

	public static void main(String[] args) {
		int arr[] = { 5, 2, 1, 0, 2, 1, 5 };

		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			int prefix = 0;
			int suffix = 0;
			int k = i;
			while (k >= 0) {
				prefix += arr[k];
				k--;
			}
			k = arr.length - 1;
			while (k >= i) {
				suffix += arr[k];
				k--;
			}
			if (prefix == suffix && max < prefix) {
				max = prefix;
			}
		}

		System.out.println(max);
	}

}

//output: 8

//import java.util.*;
//
//class Main {
//    public static void main(String[] args) {
//        int arr[] = {5, 2, 1, 0, 2, 1, 5};
//
//        int totalSum = 0;
//        for (int num : arr) {
//            totalSum += num;
//        }
//
//        int prefixSum = 0;
//        int max = 0;
//        for (int num : arr) {
//            totalSum -= num;
//            if (prefixSum == totalSum) {
//                max = Math.max(max, prefixSum);
//            }
//            prefixSum += num;
//        }
//
//        System.out.println(max);
//    }
//}
