
package hackerRankProblems;
public class SearchInSortedMatrix {
    public static boolean searchInMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false; // Empty matrix or invalid input
        }
        
        int rows = matrix.length;
        int cols = matrix[0].length;
        
        int left = 0;
        int right = rows * cols - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int midValue = matrix[mid / cols][mid % cols];
            
            if (midValue == target) {
                return true;
            } else if (midValue < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 3, 5, 7},
            {10, 11, 16, 20},
            {23, 30, 34, 60}
        };

        int target = 3;

        boolean found = searchInMatrix(matrix, target);

        if (found) {
            System.out.println("The target " + target + " is found in the matrix.");
        } else {
            System.out.println("The target " + target + " is not found in the matrix.");
        }
    }
}


//import java.util.Scanner;
//
//public class FindNumInMatrix {
//	
//	public static void main(String[] args) {
//		
//		Scanner sc = new Scanner(System.in);
//		
//		int m = sc.nextInt();
//		int n = sc.nextInt();
//		
//		int[][] arr = new int[m][n];
//		
//		for(int i=0; i<m; i++) {
//			for(int j=0; j<n; j++) {
//				arr[i][j] = sc.nextInt();
//			}
//		}
//		
//		int value = sc.nextInt();
//		
//		int row = -1;
//		
//		for(int i=0; i<m; i++){
//	           if (value >= arr[i][0] && value <= arr[i][m - 1]) {
//	              row = i;
//	              break;
//	          }
//	      }
//		
//		if(row > -1) {
//			
//			for(int i=0; i<n; i++) {
//				
//				if(arr[row][i] == value) {
//					System.out.println("Found");
//					return;
//				}
//			}
//
//		} else {
//			//System.out.println("Not Found");
//			
////			for(int i=0; i<n; i++) {
////				if(arr[m-1][i] == value) {
////					System.out.println("Not Found");
////					return;
////				}
////			}
////			
//		}
//		
//	}
//	
//	


