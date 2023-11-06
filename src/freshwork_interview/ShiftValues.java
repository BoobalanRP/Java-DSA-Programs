package freshwork_interview;


/*
 * 1 You have to encrypt a non-empty string phrase. The encryption adds a 'cyclic shift'
to each letter where the value of this 'cyclic shift' is decided by the position of the
letter from the end of its word. The shift value for each letter of a word is its index
value (starting from 0) from the right-most character of the word.
EXAMPLE: The shift values in 'yum feed' will be
yum: m->0, u->1, y->2
feed: d->0, e->1, e->2, f->3
which gives the encryption avm igfd Here,
adding the shift with value 0 to letter 'm' gives 'm' + 0 = m ;
values 1 to 'u' gives 'u' + 1 = v and values 2 to 'y' gives 'y' + 2 = a and so on. Note
that the shift wraps around on reaching the end of the alphabets, i.e., the shift values
for 'y' as shown above is 'a'.
INPUT:
yum
OUTPUT:
avm
NOTE:
 */

  import java.util.*;

public class ShiftValues {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String wr = in.nextLine();
		String arr[] = wr.split(" ");
		char alpha[] = new char[26];
		String alpha1 = "abcdefghijklmnopqrstuvwxyz";
		String upper1 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		char upper[] = new char[26];
		int m = 0, l = 0;
		for (char v = 'a'; v <= 'z'; v++) {
			alpha[m++] = v;
		}
		for (char v = 'A'; v <= 'Z'; v++) {
			upper[l++] = v;
		}
		StringBuilder curr = new StringBuilder();
		for (int i = 0; i < arr.length; i++) {
			String word = arr[i], value = "";
			int k = 0;
			for (int j = word.length() - 1; j >= 0; j--) {
				int index = -1;
				if (Character.isUpperCase(word.charAt(j))) {
					index = upper1.indexOf(word.charAt(j));
				} else {
					index = alpha1.indexOf(word.charAt(j));
				}

				int find = index + k;

				if (find > 25) {
					find = find - 26;
				}
				char spl = ' ';
				if (Character.isUpperCase(word.charAt(j))) {
					spl = upper[find];
				} else {
					spl = alpha[find];
				}

				value += spl;
				k++;
			}
			StringBuffer reversed = new StringBuffer(value).reverse();
			curr.append(reversed);
			curr.append(" ");
		}

		System.out.println(curr.toString());
	}
}

//class Main {
//	public static void main(String[] args) {
//		Scanner s = new Scanner(System.in);
//		String mn = s.next();
//		char[] str = mn.toCharArray();
//		int len = mn.length() - 1;
//		for (int i = 0; i <= len; i++) {
////System.out.print(str[i]+" ");
//			str[i] = (char) ('a' + ((str[i] - 'a' + len - i) % 26));
////System.out.println(str[i]+" ");
//		}
//		for (int i = 0; i <= len; i++) {
//			System.out.print(str[i]);
//		}
//	}
//}