package dsa_day09_backTracking;

import java.util.*;

public class PermutationInSortedOrder {

	static int findCeil(char[] str, char first, int l, int h) {
		int ceilIndex = l;

		for (int i = l + 1; i <= h; i++)
			if (str[i] > first && str[i] < str[ceilIndex])
				ceilIndex = i;

		return ceilIndex;
	}

	static void sortedPermutations(char[] str) {

		int size = str.length;
		Arrays.sort(str);

		boolean isFinished = false;
		while (!isFinished) {

			System.out.println(String.valueOf(str));

			int i;
			for (i = size - 2; i >= 0; --i)
				if (str[i] < str[i + 1])
					break;

			if (i == -1)
				isFinished = true;
			else {
				int ceilIndex = findCeil(str, str[i], i + 1, size - 1);
				char temp = str[i];
				str[i] = str[ceilIndex];
				str[ceilIndex] = temp;
				Arrays.sort(str, i + 1, size);
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String val = sc.nextLine();
		char[] str = val.toCharArray();
		sortedPermutations(str);
	}

}

//Input (stdin)
//eat
//
//Output (stdout)
//aet
//ate
//eat
//eta
//tae
//tea




class kch {
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


//import java.util.Arrays;
//import java.util.Scanner;
//
//public class Main {
//    
//    static void sortedPermutations(char[] str) {
//        Arrays.sort(str);
//        boolean isFinished = false;
//        while (!isFinished) {
//            System.out.println(String.valueOf(str));
//            int i;
//            for (i = str.length - 2; i >= 0; i--) {
//                if (str[i] < str[i + 1]) {
//                    break;
//                }
//            }
//            if (i == -1) {
//                isFinished = true;
//            } else {
//                int ceilIndex = i + 1;
//                for (int j = i + 2; j < str.length; j++) {
//                    if (str[j] > str[i] && str[j] < str[ceilIndex]) {
//                        ceilIndex = j;
//                    }
//                }
//                char temp = str[i];
//                str[i] = str[ceilIndex];
//                str[ceilIndex] = temp;
//                Arrays.sort(str, i + 1, str.length);
//            }
//        }
//    }
//    
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String val = sc.nextLine();
//        char[] str = val.toCharArray();
//        sortedPermutations(str);
//    }
//}
