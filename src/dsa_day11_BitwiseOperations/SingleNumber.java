package dsa_day11_BitwiseOperations;

import java.util.Scanner;

public class SingleNumber {

	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        int[] nums = new int[n];

	        for (int i = 0; i < n; i++) {
	            nums[i] = sc.nextInt();
	        }

	        int ones = 0, twos = 0, commonBits;

	        for (int num : nums) {

	            twos |= (ones & num);

	            ones ^= num;

	            commonBits = ones & twos;

	            ones &= ~commonBits;
	            twos &= ~commonBits;
	        }


	        System.out.println(ones);
	    }

}

//
//Input (stdin)
//7
//0 1 0 1 0 1 99
//
//Output (stdout)
//99
