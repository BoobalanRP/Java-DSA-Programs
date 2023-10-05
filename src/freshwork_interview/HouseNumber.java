package freshwork_interview;

import java.util.*;
import java.util.Scanner;

public class HouseNumber {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        int arr[] = new int[n];
	        int arr2[] = new int[n];
	        for (int i = 0; i < n; i++) {
	            arr[i] = sc.nextInt();
	            arr2[i] = sc.nextInt();
	        }
	        Map<Integer, Integer> house = new TreeMap<>();
	        for (int i = 0; i < n; i++) {
	            house.put(arr[i], arr2[i]);
	        }
	        int min = 0;
	        int start = 0;
	        int end = 0;
	        List<Integer> keys = new ArrayList<>(house.keySet());

	        for (int i = 0; i < n - 1; i++) {
	            int max = house.get(keys.get(i + 1)) - house.get(keys.get(i));
	            if (max > min) {
	                min = max;
	                start = keys.get(i);
	                end = keys.get(i + 1);
	            }
	        }

	        System.out.println(start + " " + end);

	}

}
