package freshwork_interview;

import java.util.Arrays;

public class MaximumProduct {

	public static void main(String[] args) {

		int[] arr = { 2, 9, 1, 4, 8, 6, 3, 5 };

		Arrays.sort(arr);
		int n = arr.length;

		int maxProduct = arr[n - 1] * arr[n - 2] * arr[n - 3];
        int maxProduct2 = arr[0]*arr[1]*arr[n-1];
		
		int max = Math.max(maxProduct, maxProduct2);
		
		System.out.println("Array Max Product : " + max);

	}

}
