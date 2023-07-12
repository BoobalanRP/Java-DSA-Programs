package day14_String;

import java.util.Scanner;

public class Flip {
	private static int[] rowOffsets = { 0, 0, 1, -1 };
	private static int[] colOffsets = { 1, -1, 0, 0 };

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Read input
		int numRows = scanner.nextInt();
		int numCols = scanner.nextInt();
		char[][] board = new char[numRows][numCols];
		for (int i = 0; i < numRows; i++) {
			for (int j = 0; j < numCols; j++) {
				board[i][j] = scanner.next().charAt(0);
			}
		}

		// Solve the problem
		if (board == null || board.length == 0) {
			return;
		}

		// Step 1: Traverse the boundaries and mark 'O's and their connected 'O's as '*'
		for (int i = 0; i < numRows; i++) {
			for (int j = 0; j < numCols; j++) {
				if ((i == 0 || i == numRows - 1 || j == 0 || j == numCols - 1) && board[i][j] == 'O') {
					// Mark the current 'O' as '*'
					board[i][j] = '*';

					// Traverse the neighboring cells
					for (int m = 0; m < 4; m++) {
						int newRow = i + rowOffsets[m];
						int newCol = j + colOffsets[m];

						if (newRow >= 0 && newRow < numRows && newCol >= 0 && newCol < numCols
								&& board[newRow][newCol] == 'O') {
							// Mark the connected 'O' as '*'
							markConnected(board, newRow, newCol);
						}
					}
				}
			}
		}

		// Step 2: Flip the remaining 'O's to 'X' and the marked '*' back to 'O'
		for (int i = 0; i < numRows; i++) {
			for (int j = 0; j < numCols; j++) {
				if (board[i][j] == 'O') {
					board[i][j] = 'X';
				} else if (board[i][j] == '*') {
					board[i][j] = 'O';
				}
			}
		}

		// Print the modified board
		for (int i = 0; i < numRows; i++) {
			for (int j = 0; j < numCols; j++) {
				System.out.print(board[i][j] + " ");
			}
			System.out.println();
		}
	}

	private static void markConnected(char[][] board, int row, int col) {
		int numRows = board.length;
		int numCols = board[0].length;

		if (row < 0 || row >= numRows || col < 0 || col >= numCols || board[row][col] != 'O') {
			return;
		}

		// Mark the current 'O' as '*'
		board[row][col] = '*';

		// Traverse the neighboring cells
		for (int m = 0; m < 4; m++) {
			int newRow = row + rowOffsets[m];
			int newCol = col + colOffsets[m];
			markConnected(board, newRow, newCol);
		}
	}

}
