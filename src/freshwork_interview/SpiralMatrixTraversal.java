package freshwork_interview;

import java.util.*;

public class SpiralMatrixTraversal {

	public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3, 33},
            {4, 5, 6, 66},
            {7, 8, 9, 99},
            {17, 18, 19, 20}
        };

  List<Integer> result = new ArrayList<>();
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return;
        }
        
        int top = 0, bottom = matrix.length - 1, left = 0, right = matrix[0].length - 1;

        while (top <= bottom && left <= right) {
       
            for (int i = left; i <= right; i++) {
                result.add(matrix[top][i]);
            }
            top++;

          
            for (int i = top; i <= bottom; i++) {
                result.add(matrix[i][right]);
            }
            right--;

          
            if (top <= bottom) {
        
                for (int i = right; i >= left; i--) {
                    result.add(matrix[bottom][i]);
                }
                bottom--;
            }

           
            if (left <= right) {
              
                for (int i = bottom; i >= top; i--) {
                    result.add(matrix[i][left]);
                }
                left++;
            }
        }

     

        for (int num : result) {
            System.out.print(num + " ");
        }
    }

}


//import java.util.*;
//
//public class Main {
//
//    public static void main(String[] args) {
//        int[][] matrix = {
//            {1, 2, 3, 33},
//            {4, 5, 6, 66},
//            {7, 8, 9, 99},
//            {17, 18, 19, 20}
//        };
//
//        List<Integer> result = new ArrayList<>();
//
//        int rows = matrix.length;
//        int cols = matrix[0].length;
//
//        int top = 0, bottom = rows - 1, left = 0, right = cols - 1;
//
//        for (int k = 0; k < Math.min(rows, cols) / 2; k++) {
//            for (int i = left; i <= right; i++) {
//                result.add(matrix[top][i]);
//            }
//
//            for (int i = top + 1; i <= bottom; i++) {
//                result.add(matrix[i][right]);
//            }
//
//            if (top < bottom && left < right) {
//                for (int i = right - 1; i >= left; i--) {
//                    result.add(matrix[bottom][i]);
//                }
//                for (int i = bottom - 1; i > top; i--) {
//                    result.add(matrix[i][left]);
//                }
//            }
//
//            top++;
//            bottom--;
//            left++;
//            right--;
//        }
//
//        for (int num : result) {
//            System.out.print(num + " ");
//        }
//    }
//}


//import java.util.ArrayList;
//import java.util.List;
//
//public class SpiralMatrixTraversalBacktracking {
//
//    public static void main(String[] args) {
//        int[][] matrix = {
//                {1, 2, 3},
//                {4, 5, 6},
//                {7, 8, 9},
//                {17, 18, 19}
//        };
//
//        List<Integer> result = spiralMatrixTraversal(matrix);
//        for (int num : result) {
//            System.out.print(num + " ");
//        }
//    }
//
//    public static List<Integer> spiralMatrixTraversal(int[][] matrix) {
//        List<Integer> result = new ArrayList<>();
//        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
//            return result;
//        }
//
//        int rows = matrix.length;
//        int cols = matrix[0].length;
//        boolean[][] visited = new boolean[rows][cols];
//
//        spiralBacktracking(matrix, result, visited, 0, 0, rows, cols, 0);
//        return result;
//    }
//
//    private static void spiralBacktracking(int[][] matrix, List<Integer> result, boolean[][] visited, int row, int col, int rows, int cols, int direction) {
//        if (row < 0 || row >= rows || col < 0 || col >= cols || visited[row][col]) {
//            return;
//        }
//
//        result.add(matrix[row][col]);
//        visited[row][col] = true;
//
//        switch (direction) {
//            case 0: 
//                spiralBacktracking(matrix, result, visited, row, col + 1, rows, cols, 0);
//                if (!visited[row + 1][col]) {
//                    spiralBacktracking(matrix, result, visited, row + 1, col, rows, cols, 1);
//                }
//                break;
//            case 1: // Down
//                spiralBacktracking(matrix, result, visited, row + 1, col, rows, cols, 1);
//                if (!visited[row][col - 1]) {
//                    spiralBacktracking(matrix, result, visited, row, col - 1, rows, cols, 2);
//                }
//                break;
//            case 2: // Left
//                spiralBacktracking(matrix, result, visited, row, col - 1, rows, cols, 2);
//                if (!visited[row - 1][col]) {
//                    spiralBacktracking(matrix, result, visited, row - 1, col, rows, cols, 3);
//                }
//                break;
//            case 3: // Up
//                spiralBacktracking(matrix, result, visited, row - 1, col, rows, cols, 3);
//                if (!visited[row][col + 1]) {
//                    spiralBacktracking(matrix, result, visited, row, col + 1, rows, cols, 0);
//                }
//                break;
//        }
//    }
//}

