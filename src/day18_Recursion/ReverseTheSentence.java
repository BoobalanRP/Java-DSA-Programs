package day18_Recursion;

public class ReverseTheSentence {

	public static void main(String[] args) {

		String wr = "myname:?isnatara!jan;";
		char[] arr = new char[wr.length()];
		for (int i = 0; i < wr.length(); i++) {
			arr[i] = wr.charAt(i);
		}
		int a1 = 0, a2 = arr.length - 1;

		while (a1 < a2) {
			while (arr[a1] == '!' || arr[a1] == '@' || arr[a1] == '?' || arr[a1] == ':' || arr[a1] == ';'
					|| arr[a1] == '&' || arr[a1] == '$' || arr[a1] == '*' || arr[a1] == '/' || arr[a1] == ' ') {
				a1++;
			}
			while (arr[a2] == '!' || arr[a2] == '@' || arr[a2] == '?' || arr[a2] == ':' || arr[a2] == ';'
					|| arr[a2] == '&' || arr[a2] == '$' || arr[a2] == '*' || arr[a2] == '/' || arr[a1] == ' ') {
				a2--;
			}
			if (a1 < a2) {
				char temp = arr[a1];
				arr[a1] = arr[a2];
				arr[a2] = temp;
				a1++;
				a2--;
			}
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}

	}

}
