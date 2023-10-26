package freshwork_interview;

/* Online Java Compiler and Editor */
public class WoodCutting {
    public static void main(String[] args) {
        int[] A1 = {4,42,46,40,2};
        int M1 = 20;
        System.out.println(maxBladeHeight(A1, M1)); 

    }

    public static int maxBladeHeight(int[] A, int M) {
        int left = 0;
        int right = Integer.MIN_VALUE;

        // find the maximum tree height
        for (int height : A) {
            right = Math.max(right, height);
               System.out.println("Max "+right); 
        }

        int result = 0;

        // binary search for the maximum height
        while (left <= right) {
            int mid = (left + right) / 2;
                 System.out.println("Mid "+mid);
            int totalCut = 0;

            for (int height : A) {
                if (height > mid) {
                    totalCut += height - mid;
                         System.out.println("TotalCut  "+totalCut);
                }
            }

            if (totalCut >= M) {
                result = mid;
                  System.out.println("result  "+result);
                left = mid + 1;
                   System.out.println("left  "+left);
            } else {
               
                right = mid - 1;
                 System.out.println("right  "+mid);
            }
        }

        return result;
    }
}