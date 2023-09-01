package dsa_day08_backTracking;

import java.util.*;

public class FactDigitSum {

	public static long findMinimumNumber(long x, List<Integer> arr) {
		int[] factorials = { 1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880 };
		for (int i = 9; i >= 1; i--) {
			while (x >= factorials[i]) {
				x -= factorials[i];
				arr.add(i);
			}
		}
		return x;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		for (int i = 0; i < t; i++) {
			long x = scanner.nextLong();
			List<Integer> arr = new ArrayList<Integer>();
			long remainingX = findMinimumNumber(x, arr);

			if (remainingX == 0) {
				Collections.sort(arr);
				StringBuilder minimum = new StringBuilder();
				for (int num : arr) {
					minimum.append(num);
				}
				System.out.println(minimum);
			} else {
				System.out.println("-1");
			}
		}
	}

}

//Input (stdin)
//1
//40321
//
//Output (stdout)
//18

//import java.util.*;
//class Main
//{
//
//public static void finder(long number, List<String> nums, int[] facts, int index){
//  
//	if(index < 0){
//    return;
//  }
//  if(number == 0){
//  	return;
//  }
//    
// if(number >= facts[index]){
//  	number = number - facts[index];
//    	nums.add(index+1+"");
//      
//   	if(number >= facts[index]){
//        finder(number, nums, facts, index);
//      } else {
//        finder(number, nums, facts, index-1);
//      }
//  } else{
//   finder(number, nums, facts, index-1);
// }
//
//}
//
//
//public static void main(String args[])
//{
//  //Try out your code here
//  Scanner sc = new Scanner(System.in);
//  int n = sc.nextInt();
//  long[] arr = new long[n];
//  
//  for(int i=0; i<n; i++){
//    arr[i] = sc.nextInt();
//  }
//  
//  List<String> nums = new ArrayList<>();
//  
//  int[] facts = {1,2,6,24,120,720,5040,40320,362880};
//  
//  for(int i=0; i<n; i++){
//    finder(arr[i], nums, facts, facts.length-1);
//  }
//  
//  Collections.sort(nums);
//  for(String a:nums){
//    System.out.print(a);
//  }
//  
//}
//}
