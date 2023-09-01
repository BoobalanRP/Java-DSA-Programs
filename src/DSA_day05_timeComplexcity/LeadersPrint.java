package dsa_day05_timeComplexcity;

public class LeadersPrint {
	public static void main(String[] args) {
		int arr[] = { 9, 5, 4, 7, 3, 2, 1 };

		int max = arr[arr.length - 1];
		System.out.print(max + " ");

		for (int i = arr.length - 2; i >= 0; i--) {
			if (arr[i] > max) {
				max = arr[i];
				System.out.print(max + " ");
			}
		}
	}

}

//output:
//java -cp /tmp/sI4c9D72z4 HelloWorld
//1 2 3 7 9 