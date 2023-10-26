package freshwork_interview;

import java.util.*;

public class KnightTour {
    public static int count = 1;

    public static void main(String[] args) {
        int n = 5;
        int[][] arr = new int[n][n];
        boolean result = knightTour(n, 0, 0, arr);
        if (result) {
            System.out.println("Yes");
          for( int i=0; i<n; i++){
                for( int j=0; j<n; j++){
                    System.out.print(arr[i][j]+ " ");
                }
                 System.out.println();
          }
            
        } else {
            System.out.print("No");
            for( int i=0; i<n; i++){
                for( int j=0; j<n; j++){
                    System.out.print(arr[i][j]+ " ");
                }
                 System.out.println();
          }
        }
    }

    public static boolean knightTour(int n, int i, int j, int[][] arr) {
        if (i < 0 || j < 0 || i >= n || j >= n || arr[i][j] != 0) {
            return false;
        }
        if (count == n * n) {
            arr[i][j] = count;
            return true;
        }
        if (arr[i][j] == 0) {
            arr[i][j] = count++;
            if (knightTour(n, i - 1, j - 2, arr) || knightTour(n, i - 2, j - 1, arr)
                    || knightTour(n, i - 2, j + 1, arr) || knightTour(n, i - 1, j + 2, arr)
                    || knightTour(n, i + 1, j + 2, arr) || knightTour(n, i + 2, j + 1, arr)
                    || knightTour(n, i + 2, j - 1, arr) || knightTour(n, i + 1, j - 2, arr)) {
                return true;
            }
            arr[i][j] = 0;
            count--;
        }
        return false;
    }
}
