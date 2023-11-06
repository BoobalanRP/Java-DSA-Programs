package freshwork_interview;

import java.util.Arrays;

public class Permutation {

	public static void main(String[] args) {
		String str1 = "abcdeef";
		String str2 = "bdefcea";

		if (str1 == null || "".equals(str1) || (str2 == null || "".equals(str2))) {
			System.out.println("Not a permutation");
			return;
		}

		if (str1.length() != str2.length()) {
			System.out.println("Not a permutation");
			return;
		}

		char[] arr1 = str1.replaceAll("\\s", "").toCharArray();
		char[] arr2 = str2.replaceAll("\\s", "").toCharArray();

		Arrays.sort(arr1);
		Arrays.sort(arr2);
		System.out.println(arr1);System.out.println(arr2);
		if (Arrays.equals(arr1, arr2)) {
			System.out.println("Permutation");
			return;
		} else {
			System.out.println("Not a permutation");
			return;
		}

	}

}

//import java.util.Scanner;
//import java.util.HashSet;

//public class Main {

//  public static void main(String[] args) {
//      Scanner sc = new Scanner(System.in);

//      int n = 7;
//      int arr[] = {1,2,6,2,6,3,1};

   
//      HashSet<Integer> seen = new HashSet<>();

//      for (int i = 0; i < n; i++) {
//          int value = arr[i] % n;
//          arr[i] = value + n+1;
//          if (seen.contains(arr[i])) {
//              System.out.println(arr[i] - (n + 1));
//          } else {
//              seen.add(arr[i]);
//          }
//      }
//  }
//}

//import java.util.Scanner;
//import java.util.HashSet;
//
//public class Main {
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        int n = 8;
//        int arr[] = {1,2,6,2,6,3,1,3};
//      
//
//        for(int i=0; i<n; i++){
//            int value = arr[i]%n;
//           int arrvalue =  arr[value];
//           arr[value] = arrvalue + n;
//           
//        }
//        
//        for(int i=0; i<n; i++){
//            if(arr[i]/n >=2){
//                System.out.println(i);
//            }
//        }
//    }
//}


