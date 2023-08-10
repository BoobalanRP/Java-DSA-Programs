package day13_2D_Array;

import java.util.Scanner;

public class MagicSquare {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] matrix = new int[n][n];
		int magicSum = 0;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				matrix[i][j] = sc.nextInt();
				if (i == 0) {
					magicSum += matrix[i][j];
				}
			}
		}

		boolean isMagicSquare = true;

		for (int i = 0; i < n; i++) {
			int rowSum = 0;
			for (int j = 0; j < n; j++) {
				rowSum += matrix[i][j];
			}
			if (rowSum != magicSum) {
				isMagicSquare = false;
			}
		}

		// column sums
		for (int j = 0; j < n; j++) {
			int colSum = 0;
			for (int i = 0; i < n; i++) {
				colSum += matrix[i][j];
			}
			if (colSum != magicSum) {
				isMagicSquare = false;
			}
		}

		// forward diagonal sum
		int forwardDiagonalSum = 0;
		for (int i = 0; i < n; i++) {
			forwardDiagonalSum += matrix[i][i];
		}
		if (forwardDiagonalSum != magicSum) {
			isMagicSquare = false;
		}

		// backward diagonal sum
		int backwardDiagonalSum = 0;
		for (int i = 0; i < n; i++) {
			backwardDiagonalSum += matrix[i][n - i - 1];
		}
		if (backwardDiagonalSum != magicSum) {
			isMagicSquare = false;
		}

		if (isMagicSquare) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}
	}

}
//import java.util.*;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//         int[][] mat = new int[n][n]; 
//         int m = n-1;
//       for(int i=0; i<n; i++){
//            for(int j=0; j<n; j++){
//                mat[i][j] = sc.nextInt();
//            }
//        }
//        int lefttoright =0;
//        int righttoleft = 0;
//        
//         for(int i=0; i<n; i++){
//              for(int j=0; j<n; j++){
//                if(i==j){
//                    lefttoright +=mat[i][j];
//              }
//            
//         }
//        if(m >=0){
//                  righttoleft +=mat[i][m];
//        }
//        m--;
//         
//    }
//    if(lefttoright == righttoleft){
//          System.out.println("yes");
//    }else{
//         System.out.println("no");
//    }
//}
//}




//import java.util.Scanner;
//

//class Main {
//    public static void main(String args[]) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[][] matrix = new int[n][n];
//        int magicSum = 0; // The expected sum for a magic square
//
//        // Read matrix elements and calculate the magic sum
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                matrix[i][j] = sc.nextInt();
//                if (i == 0) {
//                    magicSum += matrix[i][j];
//                }
//            }
//        }
//
//        boolean isMagicSquare = true;
//      
//      
//        for (int i = 0; i < n; i++) {
//            int rowSum = 0;
//            for (int j = 0; j < n; j++) {
//                rowSum += matrix[i][j];
//            }
//            if (rowSum != magicSum) {
//               isMagicSquare = false;
//            }
//        }
//
//        // Check column sums
//        for (int j = 0; j < n; j++) {
//            int colSum = 0;
//            for (int i = 0; i < n; i++) {
//                colSum += matrix[i][j];
//            }
//            if (colSum != magicSum) {
//              isMagicSquare = false;
//            }
//        }
//
//        // Check forward diagonal sum
//        int forwardDiagonalSum = 0;
//        for (int i = 0; i < n; i++) {
//            forwardDiagonalSum += matrix[i][i];
//        }
//        if (forwardDiagonalSum != magicSum) {
//          isMagicSquare = false;
//        }
//
//        // Check backward diagonal sum
//        int backwardDiagonalSum = 0;
//        for (int i = 0; i < n; i++) {
//            backwardDiagonalSum += matrix[i][n - i - 1];
//        }
//        if (backwardDiagonalSum != magicSum) {
//           isMagicSquare = false;
//        }
//
//    
//    
//        if (isMagicSquare) {
//            System.out.println("yes");
//        } else {
//            System.out.println("no");
//        }
//    }
//
// 
//}

