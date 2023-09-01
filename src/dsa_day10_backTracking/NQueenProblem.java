package dsa_day10_backTracking;

import java.util.*;

public class NQueenProblem {

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
if(n>1&&n<4){
  System.out.print(-1);
}else{
          char[][] board = new char[n][n];
        solveNQueens(0, board);
}
    }

    public static void solveNQueens(int row, char[][] board) {
        int n = board.length;
        if (row == n) {
            printBoard(board); // Print the board when a valid arrangement is found
            return;
        }

        for (int col = 0; col < n; col++) {
            if (isSafe(row, col, board)) {
                board[row][col] = 'Q';
                solveNQueens(row + 1, board);
                board[row][col] = '.';
            }
        }
    }

    public static boolean isSafe(int row, int col, char[][] board) {
        int n = board.length;

        // Check if there is a queen in the same column
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }

        // Check if there is a queen in the upper diagonal
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        // Check if there is a queen in the lower diagonal
        for (int i = row - 1, j = col + 1; i >= 0 && j < n; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        return true;
    }

    public static void printBoard(char[][] board) {
          System.out.print("[");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == 'Q') {
                    System.out.print((j+1)+" ");
                } 
            }
        }
           System.out.print("] ");
    }
}



//
//
//
//public class NQueenProblem {
//
//	public static List<int[]> solveNQueens(int n) {
//		List<int[]> solutions = new ArrayList<>();
//		int[] board = new int[n];
//		solveNQueensUtil(n, 0, board, solutions);
//		return solutions;
//	}
//
//	private static void solveNQueensUtil(int n, int row, int[] board, List<int[]> solutions) {
//		if (row == n) {
//			solutions.add(board.clone());
//			return;
//		}
//
//		for (int col = 0; col < n; col++) {
//			if (isSafe(row, col, board)) {
//				board[row] = col;
//				solveNQueensUtil(n, row + 1, board, solutions);
//				board[row] = 0;
//			}
//		}
//	}
//
//	private static boolean isSafe(int row, int col, int[] board) {
//		for (int prevRow = 0; prevRow < row; prevRow++) {
//			if (board[prevRow] == col || Math.abs(board[prevRow] - col) == Math.abs(prevRow - row)) {
//				return false;
//			}
//		}
//		return true;
//	}
//
//	public static void printSolutions(List<int[]> solutions) {
//		for (int[] solution : solutions) {
//			System.out.print("[");
//			for (int col : solution) {
//				System.out.print(col + 1 + " ");
//			}
//			System.out.print("]");
//			System.out.print(" ");
//		}
//	}
//
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		if (n > 1 && n < 4) {
//			System.out.println("-1");
//		} else {
//			List<int[]> solutions = solveNQueens(n);
//			printSolutions(solutions);
//		}
//	}
//
//}



//Input(stdin)
//1
//
//Output(stdout)
//[1]
//
//Input(stdin)
//2
//
//Output(stdout)
//-1
//
//
//Input (stdin)
//4
//
//Output (stdout)
//[2 4 1 3 ] [3 1 4 2 ]