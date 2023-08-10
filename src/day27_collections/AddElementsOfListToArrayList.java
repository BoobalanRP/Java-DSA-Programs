package day27_collections;

import java.util.*;

public class AddElementsOfListToArrayList {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();

		ArrayList<String> arr1 = new ArrayList<String>();

		StringTokenizer st = new StringTokenizer(input, " ");
		while (st.hasMoreTokens()) {
			arr1.add(st.nextToken());
		}
		System.out.println("List:" + arr1);
		System.out.print("ArrayList:" + arr1);

	}

}
//Input (stdin)
//110  200 300 500
//
//Output (stdout)
//List:[110, 200, 300, 500]
//ArrayList:[110, 200, 300, 500]