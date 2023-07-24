package day18_Recursion;

import java.util.Scanner;

class Main {
	public static int MaximumValueInArray(int[] arr1, int num) {
		int maximum = 0;
		for (int i = 0; i < num; i++) {
			if (arr1[i] > maximum) {
				maximum = arr1[i];
			}
		}
		return maximum;
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		int max = MaximumValueInArray(arr, n);

		System.out.print("Maximum element in the array is " + max);
	}
}

//import java.util.Scanner;
//
//class Main {
//    public static int MaximumValueInArray(int[] arr1, int num, int indexE) {
//      
//        if (indexE == num) {
//            return 0;
//        }
//        int maxRest = MaximumValueInArray(arr1, num, indexE + 1);
//        return Math.max(arr1[indexE], maxRest);
//    }
//
//    public static void main(String args[]) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//        }
//
//        int index = 0;
//        int max = MaximumValueInArray(arr, n, index);
//
//        System.out.print("Maximum element in the array is " + max);
//    }
//}

//}
//
//Input (stdin)
//5
//6
//3
//2
//5
//9
//
//Output (stdout)
//Maximum element in the array is 9