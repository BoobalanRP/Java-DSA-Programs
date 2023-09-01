package dsa_day03_searching_and_sorting;

class HelloWorld {
	public static boolean binarySearch(int arr[], int start, int end, int n) {
		if (start <= end) {
			int mid = (start + end) / 2;
			if (arr[mid] == n) {
				return true;
			} else if (arr[mid] > n) {
				return binarySearch(arr, start, mid - 1, n);
			} else if (arr[mid] < n) {
				return binarySearch(arr, mid + 1, end, n);
			}
		}
		return false;
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
		int n = 4;
		boolean find = binarySearch(arr, 0, arr.length - 1, n);
		if (find) {
			System.out.println("Value found");
		} else {
			System.out.println("Value not found");
		}
	}
}
