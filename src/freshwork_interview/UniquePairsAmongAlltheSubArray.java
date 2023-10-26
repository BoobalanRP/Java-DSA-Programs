package freshwork_interview;


import java.util.*;

class Pair implements Comparable<Pair> {
	int first, second;
	public Pair(int first, int second){
		this.first = first;
		this.second = second;
	}

	@Override public int hashCode(){
		return 31 * first + second;
	}

	public boolean equals(Object p){
		Pair pair = (Pair)p;
		if (this.first != pair.first)
			return false;
		return this.second == pair.second;
	}

	@Override public int compareTo(Pair p){
		if (this.first == p.first) {
			return this.second - p.second;
		}
		return this.first - p.first;
	}
}

public class UniquePairsAmongAlltheSubArray {
	static Set<Pair> pairs(int[] arr){
		Set<Pair> pairs = new HashSet<>();
		for (int i = 0; i < arr.length - 1; ++i) {
			int maximum = Math.max(arr[i], arr[i + 1]),
				secondmax = Math.min(arr[i], arr[i + 1]);
			for (int j = i + 1; j < arr.length; ++j) {
				if (arr[j] > maximum) {
					secondmax = maximum;
					maximum = arr[j];
				}
				if (arr[j] < maximum
					&& arr[j] > secondmax) {
					secondmax = arr[j];
				}
				pairs.add(new Pair(secondmax, maximum));
			}
		}
		return pairs;
	}

	public static void main(String[] args)
	{
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int vec[] = new int[n];
	    for(int i=0;i<n;i++){
	        vec[i] = sc.nextInt();
	    }

		Set<Pair> st = pairs(vec);
		System.out.println(st.size());
	}
}
 


//import java.util.*;
//
//public class Main {
//    static Set<Integer> pairs(int[] arr) {
//        Set<Integer> pairs = new HashSet<>();
//        int n = arr.length;
//
//        for (int i = 0; i < n - 1; ++i) {
//            int maximum = Math.max(arr[i], arr[i + 1]);
//            int secondMax = Math.min(arr[i], arr[i + 1]);
//
//            for (int j = i + 1; j < n; ++j) {
//                if (arr[j] > maximum) {
//                    secondMax = maximum;
//                    maximum = arr[j];
//                } else if (arr[j] < maximum && arr[j] > secondMax) {
//                    secondMax = arr[j];
//                }
//
//                pairs.add((secondMax * 1000) + maximum);
//            }
//        }
//        return pairs;
//    }//10 22 25 33 26 48 13 11 14 27 38
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] vec = new int[n];
//        
//        for (int i = 0; i < n; i++) {
//            vec[i] = sc.nextInt();
//        }
//
//        Set<Integer> st = pairs(vec);
//        System.out.println(st.size());
//    }
//}

//public static void main(String[] args) {
//	Scanner scanner = new Scanner(System.in);
//	int n = scanner.nextInt();
//	int[] arr = new int[n];
//
//	List<int[]> answer = new ArrayList<>();
//
//	for (int i = 0; i < n; i++) {
//		arr[i] = scanner.nextInt();
//	}
//
//	for (int i = 0; i < n; i++) {
//
//		for (int j = i; j < n; j++) {
//
//			List<Integer> newArr = new ArrayList<>();
//
//			for (int k = i; k <= j; k++) {
//
//				newArr.add(arr[k]);
//			}
//			
//			System.out.println(newArr);
//
//			if (newArr.size() > 1) {
//				Collections.sort(newArr);
//				int[] arr2 = new int[2];
//				arr2[0] = newArr.get(newArr.size() - 1);
//				arr2[1] = newArr.get(newArr.size() - 2);
//
//				if (answer.size() == 0) {
//
//					answer.add(arr2);
//
//				} else {
//
//					boolean present = false;
//
//					for (int m = 0; m < answer.size(); m++) {
//
//						if (Arrays.equals(arr2, answer.get(m))) {
//							present = true;
//							break;
//						}
//					}
//					if (!present) {
//						answer.add(arr2);
//					}
//				}
//			}
//
//		}
//
//	}
//
//	for (int[] i : answer) {
//		System.out.println(Arrays.toString(i));
//	}
//	
//	System.out.println("answer is "+ answer.size());
//	
//	scanner.close();
//
//}
