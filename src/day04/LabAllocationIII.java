package day04;

import java.util.Scanner;

public class LabAllocationIII {

	public static void main(String[] args) {
	      Scanner sc = new Scanner(System.in);
	        int x = sc.nextInt();
	        int y = sc.nextInt();
	        int z = sc.nextInt();
	        int numberOfStudent = sc.nextInt();

	        int count = 0;

	        if (x >= numberOfStudent) {
	            count++;
	        }
	        if (y >= numberOfStudent) {
	            count++;
	        }
	        if (z >= numberOfStudent) {
	            count++;
	        }

	        System.out.println(count);
	    }
	}


