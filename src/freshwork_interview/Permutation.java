package freshwork_interview;

import java.util.Arrays;

public class Permutation {

	public static void main(String[] args) {
		String str1 = "abcdeef";
		String str2 = "bdefcea";

		if (str1 == null || "".equals(str1) || (str2 == null || "".equals(str2))) {
			System.out.println("Not a permutation");
			return;
		}

		if (str1.length() != str2.length()) {
			System.out.println("Not a permutation");
			return;
		}

		char[] arr1 = str1.replaceAll("\\s", "").toCharArray();
		char[] arr2 = str2.replaceAll("\\s", "").toCharArray();

		Arrays.sort(arr1);
		Arrays.sort(arr2);

		if (Arrays.equals(arr1, arr2)) {
			System.out.println("Permutation");
			return;
		} else {
			System.out.println("Not a permutation");
			return;
		}

	}

}



