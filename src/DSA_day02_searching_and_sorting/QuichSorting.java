package dsa_day02_searching_and_sorting;

import java.util.Scanner;

//Input (stdin)
//3
//12
//15
//14
//
//Output (stdout)
//12 14 15
public class QuichSorting {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Read the size of the array
		int size = scanner.nextInt();

		// Read the elements of the array
		int[] array = new int[size];
		for (int i = 0; i < size; i++) {
			array[i] = scanner.nextInt();
		}


		// Perform quicksort on the array
		quickSort(array, 0, size - 1);

		// Print the sorted array
		for (int num : array) {
			System.out.print(num + " ");
		}
	}

	// Quicksort implementation
	public static void quickSort(int[] array, int low, int high) {
		if (low < high) {
			int pivotIndex = partition(array, low, high);
			quickSort(array, low, pivotIndex - 1);
			quickSort(array, pivotIndex + 1, high);
		}
	}

	// Partitioning step
	public static int partition(int[] array, int low, int high) {
		int pivot = array[high];
		int i = low - 1;

		for (int j = low; j < high; j++) {
			if (array[j] < pivot) {
				i++;
				swap(array, i, j);
			}
		}

		swap(array, i + 1, high);
		return i + 1;
	}

	// Utility method to swap two elements in an array
	public static void swap(int[] array, int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;

	}

}



class Mains{
    public static void change(int a[], int i, int j)
    {
        int t=a[i];
        a[i]=a[j];
        a[j]=t;
    }
    public static int pivott(int arr[],int i, int j)
    {
        int pivott = i;
        while(i<j){
            while(arr[i]<= arr[pivott]){
                i++;
            }
             while(arr[j]> arr[pivott]){
                j--;
            }
            if(i<j){
                change(arr, i, j);
            }
        }
        change(arr, pivott, j);
        return j;
        
    }
    public static void q_s(int a[], int start, int end)
    {
        if(start<end)
        {
            int m=pivott(a,start,end);
            q_s(a,start,m-1);
            q_s(a,m+1,end);
        }
    }
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        for(int i=0; i<n; i++)
            a[i]=s.nextInt();
        q_s(a,0,n-1);
        for(int i=0; i<n; i++)
            System.out.print(a[i] + " ");
    }
}
