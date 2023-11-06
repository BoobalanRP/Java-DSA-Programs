package freshwork_interview;

import java.util.*;
//In hacker land every character has a weight. 
//the weight of an english uppercase alphabet a-z is given below.
//asy -a = 1,  b = 2*a + a , c = 3*b + b, d = 4*c + cedium -y = 25*x + x2= 26*y + ythe weight of any string made up of these characters is the summation of weights of each character.
//given a total string weight, determine shortest stlexicographically smallest of them. 
//for example, given weight = 25, and the weights of the first few characters of the alphabet are a = 1, b = 3, c = 12,with a total weight equal to the target are abbbbc, acc, and aaaaaaabbbbbb. 
//the shortest of these is acc. while any permutation of these charactfunction descriptioncomplete the function smalleststring in the editor below.
//the function must return the shortest string of the target weight. 

public class Lexicographically {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int weight = sc.nextInt();
		Map<Character, Integer> lexi = new HashMap<>();
		int i = 1, k = 1;
		for (char wr = 'a'; wr <= 'z'; wr++) {
			int value = i;
			k++;
			lexi.put(wr, value);
			i = (k * value) + value;
		}
		List<Integer> values = new ArrayList<>(lexi.values());
		List<Character> keys = new ArrayList<>(lexi.keySet());

		String name = "";
		for (int o = keys.size() - 1; o >= 0; o--) {
			if (values.get(o) <= weight) {
				int count = weight / values.get(o);
				for (int j = 0; j < count; j++) {
					name += keys.get(o);
				}
				weight %= values.get(o);
			}
		}
		System.out.println(name);

	}

}
