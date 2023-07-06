package day10;
//

//x1y1+x2y2+...+xnyn. Suppose you are allowed to permute the coordinates of each vector as you wish.
//Choose two permutations such that the scalar product of your two new vectors is the smallest possible, and output that minimum scalar product.
//INPUT FORMAT: The first line contains integer number n. The next two lines contain n integers each, giving the coordinates of v1 and v2 respectively. 
//OUTPUT FORMAT: The output consists of a single integer Y, that corresponds to the minimum scalar product of all permutations of the two given vectors.
//FUNCTIONAL REQUIREMENTS: int* createArray(int); int getElement(int*,int); int ascending(int*,int); int minscalar(int*,int*,int); LIMITS: 0 ≤ n ≤ 800 0 ≤ xi, yi ≤ 100000
//SAMPLE INPUT :
//3
//
//1 3 5
//2 4 1
//
//
//SAMPLE OUTPUT :
//15

import java.util.Scanner;

public class MinimumScalarArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr1 = new int[n];
		int[] arr2 = new int[n];
		for (int i = 0; i < n; i++) {
			arr1[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++) {
			arr2[i] = sc.nextInt();
		}
		// ascending order for first arr1
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (arr1[i] > arr1[j]) {
					int temp = arr1[i];
					arr1[i] = arr1[j];
					arr1[j] = temp;
				}
			}
		}
		// Decending order for second array
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (arr2[i] < arr2[j]) {
					int temp = arr2[i];
					arr2[i] = arr2[j];
					arr2[j] = temp;
				}
			}
		}
		// multiply into array

		int value = 0;
		for (int i = 0; i < n; i++) {
			value += arr1[i] * arr2[i];
		}
		System.out.print(value);

	}

}
