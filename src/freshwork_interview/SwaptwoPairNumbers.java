package freshwork_interview;

public class SwaptwoPairNumbers {

	public static void main(String[] args) {

		String a = "123eD456#079";
		String b = a + "";
		int length = b.length();
		int n;

		if (length % 2 == 0) {
			n = length;
		} else {
			n = length - 1;
		}

		for (int i = 1; i < n; i = i + 2) {
			char ch = b.charAt(i);
			char ch2 = b.charAt(i - 1);

			if (Character.isDigit(ch) && Character.isDigit(ch2)) {
				System.out.print(b.charAt(i) + "" + b.charAt(i - 1));
			} else {
				System.out.print(b.charAt(i - 1) + "" + b.charAt(i));
			}

		}

		if (length % 2 != 0) {
			System.out.println(b.charAt(length - 1));
		}

	}

}

//String test = "123eD456#079";
//char[] charArray = test.toCharArray();
//
//for(int i=0; i<charArray.length-1; i++) {
//	char currentChar = charArray[i];
//	char nextChar = charArray[i+1];
//	
//	if(Character.isDigit(currentChar) && Character.isDigit(nextChar)) {
//		charArray[i] = nextChar;
//		charArray[i+1] = currentChar;
//		i++;
//	}
//}
//
//String result = new String(charArray);
//System.out.println(result);
