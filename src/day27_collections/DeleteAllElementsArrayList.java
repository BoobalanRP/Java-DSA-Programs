package day27_collections;

import java.util.*;

public class DeleteAllElementsArrayList {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String val = sc.nextLine();
		ArrayList<String> arrayList = new ArrayList<>();
		arrayList.add(val);
		System.out.println("Actual ArrayList:" + arrayList);
		arrayList.clear();
		System.out.println("After clear ArrayList:" + arrayList);

	}

}

//
//Input (stdin)
//[1, 2,3, 4]
//
//Output (stdout)
//Actual ArrayList:[[1, 2,3, 4]]
//After clear ArrayList:[]