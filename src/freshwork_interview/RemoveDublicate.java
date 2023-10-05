package freshwork_interview;

import java.util.Scanner;

public class RemoveDublicate {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	      
	      int n = sc.nextInt();
	      int arr[] = new int[n];
	      
	      for(int i=0; i<n; i++){
	          arr[i] = sc.nextInt();
	      }
	      for(int i=0; i<n-1; i++){
	          int duplicate = 0;
	          boolean value = false;
	          for(int j=i+1; j<n; j++){
	              if(arr[i] == arr[j] && arr[i] != 0){
	                  arr[j] = 0;
	                  duplicate = arr[i];
	                  value = true;
	              }
	          }
	          if(value){
	               System.out.print(duplicate + " ");
	          }
	          
	      }
	       

	}

}
//import java.util.Scanner;
//import java.util.HashSet;
//
//public class Main {
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        int n = 8;
//        int arr[] = {1,2,6,2,6,3,1,3};
//      
//
//        for(int i=0; i<n; i++){
//            int value = arr[i]%n;
//           int arrvalue =  arr[value];
//           arr[value] = arrvalue + n;
//           
//        }
//        
//        for(int i=0; i<n; i++){
//            if(arr[i]/n >=2){
//                System.out.println(i);
//            }
//        }
//    }
//}


//
//import java.util.Scanner;
//import java.util.HashSet;
//
//public class Main {
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        int n = 8;
//        int arr[] = {1,2,6,2,6,3,1,3};
//
//      
//        HashSet<Integer> seen = new HashSet<>();
//
//        for (int i = 0; i < n; i++) {
//            int value = arr[i] % n;
//            arr[i] = value + n+1;
//            if (seen.contains(arr[i])) {
//                System.out.println(arr[i] - (n + 1));
//            } else {
//                seen.add(arr[i]);
//            }
//        }
//    }
//}
