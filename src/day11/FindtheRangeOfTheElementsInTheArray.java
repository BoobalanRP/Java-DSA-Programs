package day11;

//Input (stdin)
//5
//2
//4
//1
//3
//5
//
//Output (stdout)
//Enter the number of elements in the array
//Enter the elements in the array
//The range of the array is 4
import java.util.*;

public class FindtheRangeOfTheElementsInTheArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] array = new int[n];
		for (int i = 0; i < n; i++) {
			array[i] = sc.nextInt();
		}
		Arrays.sort(array);
		int firstVale = array[0];
		int lastVale = array[array.length - 1];
		int range = Math.abs(lastVale - firstVale);
		System.out.println("Enter the number of elements in the array");
		System.out.println("Enter the elements in the array");
		System.out.println("The range of the array is " + range);

	}

}
