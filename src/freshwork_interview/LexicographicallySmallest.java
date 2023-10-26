package freshwork_interview;

import java.util.Scanner;

//Given a sequence S = {1, 2, 3.... N} (2 <= N <= 11). Find the lexicographically smallest (earliest in dictionary order) derangement of S.     
//A derangement of S is any permutation of S is such that, no two elements in S and its permutation occur in its same position.
//Input:
//5
//Output:
//2 1 4 5 3
//Explanation:
//Out of all the permutations of (1, 2, 3, 4, 5). This (2, 1, 4, 5, 3) is the first derangement.

public class LexicographicallySmallest {

	static void generate_derangement(int N)
	{
	    // Generate Sequence S
	    int S[] = new int[N + 1];
	    for (int i = 1; i <= N; i++)
	        S[i] = i;
	 
	    // Generate Derangement
	    int D[] = new int[N + 1];
	    for (int i = 1; i <= N; i += 2)
	    {
	        if (i == N)
	        {
	 
	            // Only if i is odd
	            // Swap S[N-1] and S[N]
	            D[N] = S[N - 1];
	            D[N - 1] = S[N];
	        }
	        else
	        {
	            D[i] = i + 1;
	            D[i + 1] = i;
	        }
	    }
	 
	    // Print Derangement
	    for (int i = 1; i <= N; i++)
	        System.out.print(D[i] + " ");
	    System.out.println();
	}
	 
	// Driver Program
	public static void main(String[] args)
	{
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    generate_derangement(n);
	}
	}
	 


//public static void main(String args[]) {
//	Scanner value = new Scanner(System.in);
//	int n = value.nextInt();
//	int[] arr = new int[n];
//
//	for (int i = 1; i <= n; i++) {
//		arr[i - 1] = i;
//	}
//	
//	int length;
//	
//	if(n % 2 == 0) {
//		length = n-1;
//	} else {
//		length = n-2;
//	}
//
//	for (int k = 1; k <= length; k = k + 2) {
//		int temp = arr[k];
//		arr[k] = arr[k - 1];
//		arr[k - 1] = temp;
//	}
//
//	if (n % 2 != 0) {
//		int temp = arr[n - 1];
//		arr[n - 1] = arr[n - 2];
//		arr[n - 2] = temp;
//	}
//
//	for (int i : arr) {
//		System.out.print(i + " ");
//	}
//
//}

