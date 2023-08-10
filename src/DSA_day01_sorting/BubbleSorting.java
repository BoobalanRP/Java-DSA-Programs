package DSA_day01_sorting;

public class BubbleSorting {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 5, 4, 6, 9, 7 };

		for (int i = 0; i < arr.length - 1; i++) {
			boolean swapped = false;

			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					swapped = true;
				}
			}

			if (!swapped) {
				System.out.println(arr[i]);
				System.out.println("No swap");
				break;
			}
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");

		}
	}
}
//Input (stdin)
//6
//11 15 26 38 9 10
//
//Output (stdout)
//9 10 11 15 26 38

//import java.util.*;
//
//class Main {
//    public static void main(String args[]) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] arr = new int[n]; 
//
//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.nextInt(); 
//        }
//
//        for (int i = 0; i < arr.length - 1; i++) {
//            boolean swapped = false;
//
//            for (int j = 0; j < arr.length - i - 1; j++) {
//                if (arr[j] > arr[j + 1]) {
//                    int temp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = temp;
//                    swapped = true;
//                }
//            }
//
//            if (!swapped) {
//                break;
//            }
//        }
//
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i]+ " ");
//            
//        }
//    }
//}

//import java.util.*;
//
//class Main {
//    public static void main(String args[]) {
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//        List<Integer> arr = new ArrayList<Integer>(); 
//        
//        for (int i = 0; i < num; i++) {
//            arr.add(sc.nextInt());
//        }
//        
//        Collections.sort(arr);
//      for(int i : arr){
//        System.out.print(i + " ");
//      }
//    }
//}
