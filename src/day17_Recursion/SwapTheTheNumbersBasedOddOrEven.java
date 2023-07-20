package day17_Recursion;

import java.util.Scanner;

public class SwapTheTheNumbersBasedOddOrEven {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();

		int val1 = 0, val2 = n - 1;

		while (val1 < val2) {
			while (arr[val1] % 2 == 0 && val1 < val2) {
				val1++;
			}

			while (arr[val2] % 2 != 0 && val1 < val2) {
				val2--;
			}

			if (val1 < val2) {
				int num = arr[val1];
				arr[val1] = arr[val2];
				arr[val2] = num;
				val1++;
				val2--;
			}
		}

		for (int i = 0; i < n; i++)
			System.out.print(arr[i] + " ");

	}

}

//model 1
//class HelloWorld {
//    public static void main(String[] args) {
//        int[] a = {23, 11, 26, 75, 42, 15};
//        int b = 0;
//        int c = 0;
//        for(int i = 0; i < a.length; i++){
//            for(int j = a.length-1; j > i; j--){
//                if(a[i]%2==1){
//                    if(a[j]%2 == 0){
//                        b = a[i];
//                        c = a[j];
//                        a[i] = c;
//                        a[j] = b;
//                        break;
//                    }
//                }
//            }
//            System.out.println(a[i]);
//            
//        }
//    }
//}

//model2
//int[] arr = {1,2,3,4,5,6};
//int n = 6;
//
//int[] newArr = new int[n];
//int hard = 0;
//int even = 0;
//
//
//for(int i=0;i<n;i++) {
//	if(arr[i]%2 == 0) {
//		even++;
//	}else {
//		hard++;
//	}
//}
//List<Integer> hardarr = new ArrayList<>();
//List<Integer> evenarr = new ArrayList<>();
////hard 
//for(int i=hard;i<n;i++) {
//	if(arr[i]%2 != 0) {
//		newArr[i] = arr[i];
//	}else {
//		evenarr.add(arr[i]);
//	}
//}
//
//// even
//for(int i=0;i<even;i++) {
//	if(arr[i]%2 == 0) {
//		newArr[i] = arr[i];
//	}else{
//		hardarr.add(arr[i]);
//	}
//}
//
//Collections.reverse(hardarr);
//Collections.reverse(evenarr);
//int l=0;
//for(int i=0;i<even;i++) {
//	if(newArr[i] == 0) {
//		newArr[i] = evenarr.get(l++);
//
//	}
//}
//
//int m=0;
//for(int i=hard;i<n;i++) {
//	if(newArr[i] == 0) {
//		newArr[i] = hardarr.get(m++);
//	}
//}
//
//for(int i=0;i<n;i++) {
//	System.out.print(newArr[i]);
//}

//model3

//import java.util.*;
//class HelloWorld {
//    public static void main(String[] args) {
//        int[] ar = {10, 98, 3, 33, 12, 22, 21, 11};
//        int even = 0;
//        int odd = 0;
//        int oddOut = 0;
//        int evenOut = 0;
//        int count1 = 0;
//        int count2 = 0;
//        int[] ar2 = new int[ar.length];
//        for(int i = 0; i < ar.length; i++){
//            if(ar[i]  % 2 == 0){
//                even += 1;
//            }
//            else {
//                odd += 1;
//            }
//        }
//        for(int i = 0; i < ar.length; i++){
//            if(i < even){
//                if(ar[i]% 2 == 0 ){
//                    ar2[i] = ar[i];
//                }
//                else{
//                    oddOut++;
//                }
//            }
//            else{
//                if(ar[i] % 2 != 0){
//                    ar2[i] = ar[i];
//                }
//                else{
//                    evenOut++;
//                }
//            }
//        }
//        int[] eAr = new int[evenOut];
//        int[] oAr = new int[oddOut];
//        evenOut = evenOut - 1;
//        oddOut = oddOut - 1;
//        for(int i = 0; i < ar.length; i++){
//            if(i < even){
//                if(ar[i]% 2 != 0 ){
//                    oAr[oddOut] = ar[i];
//                    oddOut--;
//                }
//            }
//            else{
//                if(ar[i] % 2 == 0){
//                    eAr[evenOut] = ar[i];
//                    evenOut--;
//                }
//        }
//    }
//    for(int i = 0; i < ar.length; i++){
//        if(i < even){
//                if(ar2[i] == 0 ){
//                    ar2[i] = eAr[count1];
//                    count1++;
//                }
//            }
//            else{
//                if(ar2[i] == 0){
//                     ar2[i] = oAr[count2];
//                    count2++;
//                }
//    }
//    }
//        System.out.println(Arrays.toString(ar2));
//    }
//}
//
