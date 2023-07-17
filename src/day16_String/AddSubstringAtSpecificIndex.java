package day16_String;

import java.util.Scanner;

public class AddSubstringAtSpecificIndex {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String originalString = sc.nextLine();
		String substring = sc.nextLine();
		int index = sc.nextInt();

		String result = originalString.substring(0, index) + substring + originalString.substring(index);

		System.out.println(result);

	}

}

//Input (stdin)
//Winner Winner Dinner
// Chicken
//13
//
//Output (stdout)
//Winner Winner Chicken Dinner