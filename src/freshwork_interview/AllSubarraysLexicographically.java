package freshwork_interview;

import java.util.*;
//Program to find all subarrays of a string and print it in sorted order.
//In this program, all the subarrays of the string need to be printed.
//The subarray is a contiguous part of a string.
//All the possible subarrays for a string will be n(n+1)/2. 
//For example, all possible subsets of a string "FUN" will be F, U, N, FU, UN, FUN.
//Sample Input :
//java
//
//Output Format :
//a
//a
//av
//ava
//j
//ja
//jav
//java
//v
//va

public class AllSubarraysLexicographically {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String wr = sc.nextLine();
		int n = wr.length();
		int arr[] = new int[wr.length()];
		char[] ch = wr.toCharArray();
		Arrays.sort(ch);
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				if(ch[i] == wr.charAt(j)){
					arr[i] = j;
				}
			}
		}
		
		ArrayList<String> word = new ArrayList<>();
		for(int i=0; i<arr.length; i++){
			word.add(wr.substring(arr[i],n));
			}
		
		for(String st: word){
			int length = st.length();
			for(int i=0; i<length; i++){
				System.out.println(st.substring(0,i+1));
			}
			
		}

	}

}

//
//import java.util.*;
//
//public class Main {
//
//	public static void main(String[] args) {
//
//		Scanner sc = new Scanner(System.in);
//		String str = sc.next();
//		ArrayList<String> arr = new ArrayList<>();
//		
//		for(int i=0; i<str.length(); i++){
//			for(int j=i+1; j<=str.length(); j++){
//				arr.add(str.substring(i,j));
//			}
//		}
//		Collections.sort(arr);
//		
//		for(String s : arr){
//			System.out.println(s);
//		}
//		sc.close();
//	
//
//	}
//
//}

//
//import java.util.*;
//
//class Main 
//{
//    public static void main(String[] args) 
//    {
//        Scanner obj = new Scanner(System.in);
//        String str = obj.nextLine();
//        int len = str.length();  
//        int temp = 0;  
//        str = str.toLowerCase();  
//        String arr[] = new String[len*(len+1)/2];  
//  
//        for(int i = 0; i < len; i++) 
//        {  
//            for(int j = i; j < len; j++) 
//            {  
//                arr[temp] = str.substring(i, j+1);  
//                temp++;  
//            }  
//        }  
//        Arrays.sort(arr);
//        for(int i = 0; i < arr.length; i++) 
//        {  
//            System.out.println(arr[i]);  
//        }  
//    }  
//}
// 