package day27_collections;

import java.util.*;

public class PrintArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		ArrayList<String> arr = new ArrayList<String>();
		for (int i = 0; i < num; i++) {
			arr.add(sc.next());
		}
		for (String val : arr) {
			System.out.println(val);
		}
	}

}

//Input (stdin)
//4
//First
//Second
//Third
//Random
//
//Output (stdout)
//First
//Second
//Third
//Random