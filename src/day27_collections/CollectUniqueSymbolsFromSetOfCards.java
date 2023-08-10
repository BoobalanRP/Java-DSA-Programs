package day27_collections;

import java.util.*;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		TreeMap<String, ArrayList<Integer>> symbolCountMap = new TreeMap<>();
		ArrayList<Character> arr = new ArrayList<Character>();

		while (sc.hasNext()) {
			String symbol = sc.next();
			char firstChar = symbol.charAt(0);
			if (Character.isLetter(firstChar)) {
				arr.add(firstChar);
			}
			int number = Integer.parseInt(sc.next());
			if (!symbolCountMap.containsKey(symbol)) {
				symbolCountMap.put(symbol, new ArrayList<Integer>());
			}
			symbolCountMap.get(symbol).add(number);
		}

		System.out.println("Four symbols gathered in " + arr.size() + " cards.");
		System.out.println("Cards in Set are :");
		for (Map.Entry<String, ArrayList<Integer>> entry : symbolCountMap.entrySet()) {
			String symbol = entry.getKey();
			ArrayList<Integer> numbers = entry.getValue();
			System.out.print(symbol + " ");
			for (int i = 0; i < numbers.size(); i++) {
				System.out.print(numbers.get(i));
				if (i < numbers.size() - 1) {
					break;
				}
			}
			System.out.println();
		}
	}
}

//
//Scanner sc = new Scanner(System.in);
//TreeMap<Character,Character> mapArr = new TreeMap<>();
//ArrayList<Character> numArr = new ArrayList<Character>();
//HashSet<Character> distinctArr = new HashSet<Character>();
//
//while(sc.hasNext()){
//  char ch = sc.next().charAt(0);
//	  numArr.add(ch);
//}
//
//for(Character ch:numArr) {
//  if(Character.isLetter(ch)){
//    distinctArr.add(ch);
//  }
//}
//
//ArrayList<Character> distinctArr2 = new ArrayList<Character>(distinctArr);
//ArrayList<Character> newArr = new ArrayList<Character>(distinctArr);
//
//int length = distinctArr2.size();
//for(int i=0; i<length; i++) {
//	for(int j=0; j<numArr.size(); j++) {
//    	if(distinctArr2.get(i) == numArr.get(j)) {
//        	mapArr.put(distinctArr2.get(i), numArr.get(j+1));
//          break;
//        }
//    }
//}
//
//System.out.println("Four symbols gathered in "+numArr.size()/2+" cards.");
//    System.out.println("Cards in Set are :");
//for (Map.Entry<Character, Character> entry : mapArr.entrySet()) {
//        Character key = entry.getKey();
//        Character value = entry.getValue();
//        System.out.println(key + " " + value);
//}

//Input (stdin)
//v
//1
//j
//2
//r
//3
//a
//4
//
//Output (stdout)
//Four symbols gathered in 4 cards.
//Cards in Set are :
//a 4
//j 2
//r 3
//v 1