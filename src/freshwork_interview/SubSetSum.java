package freshwork_interview;

import java.util.Scanner;
//Given a set of non-negative integers, and a value sum, determine if there is a subset of the given set with sum equal to given sum.

//Sample Input 1 :
//
//5 5
//
//1 2 3 4 5
//
//
//
//Sample Output 1 :
//
//yes


public class SubSetSum {

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
		  int n = sc.nextInt();
		  int m = sc.nextInt();
		  int arr[] = new int[n];
		  for(int i=0; i<n; i++){
			  arr[i] = sc.nextInt();
		  }
		  boolean find = false;
		  for(int i=0; i<n-1; i++){
			  int sum = arr[i];
			  if(sum == m){
				  find = true;
				  break;
			  }
			for(int j=i+1; j<n; j++){
				sum +=arr[j];
				if(m ==sum){
					find = true;
					break;
				}
		
					
			}
			  if(find){
				  break;
			  }
		  }
		  if(find){
			  System.out.println("yes");
		  }else{
			  System.out.println("no");
		  }
		

	}

}

//
//import java.util.Scanner;
//
//class Main {
//
//	static boolean isSubsetSum(int set[],
//							int n, int sum)
//	{
//		// Base Cases
//		if (sum == 0)
//			return true;
//		if (n == 0)
//			return false;
//
//		if (set[n - 1] > sum)
//			return isSubsetSum(set, n - 1, sum);
//
//		return isSubsetSum(set, n - 1, sum)
//			|| isSubsetSum(set, n - 1, sum - set[n - 1]);
//	}
//
//	/* Driver code */
//	public static void main(String args[])
//	{
//		Scanner sc = new Scanner(System.in);
//		int n =sc.nextInt();
//		int sum = sc.nextInt();
//		int set[]= new int[n];
//		for(int i=0;i<n;i++)
//		{
//			set[i]=sc.nextInt();
//		}
//		if (isSubsetSum(set, n, sum) == true)
//			System.out.println("yes");
//		else
//			System.out.println("no");
//	}
//}

