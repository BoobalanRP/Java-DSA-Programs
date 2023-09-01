package dsa_day02_searching_and_sorting;

import java.util.*;

public class EasyCountingSort {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = s.nextInt();
		int maxi = a[0];
		for (int i = 1; i < n; i++)
			if (a[i] > maxi)
				maxi = a[i];
		int c[] = new int[maxi + 1];
		for (int i = 0; i <= maxi; i++)
			c[i] = 0;
		for (int i = 0; i < n; i++)
			c[a[i]]++;
		// c={0,3,2,2,1,1,1,1,0,1}
		for (int i = 1; i <= maxi; i++)
			c[i] = c[i - 1] + c[i];// c[1]=3,c[2]=5 c[3]=7 c[4]=8 .....
		int answer[] = new int[n];
		for (int i = 0; i < n; i++) {
			answer[c[a[i]] - 1] = a[i];
			c[a[i]] = c[a[i]] - 1;
		}
		for (int i = 0; i < n; i++)
			System.out.print(answer[i] + " ");
	}
}