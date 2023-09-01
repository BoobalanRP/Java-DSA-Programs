package dsa_day10_backTracking;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PalindromePartitioning {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
      List<List<String>> partitions = new ArrayList<>();
            List<String>currentArray = new ArrayList<>();
        backtrack(partitions, currentArray , s, 0);
           for (List<String> partition : partitions) {
            System.out.println(String.join(" ", partition));
        }
    }

    private static void backtrack(List<List<String>> result, List<String> current, String s, int start) {
        if (start == s.length()) {
            result.add(new ArrayList<>(current));
            return;
        }
        
        for (int end = start + 1; end <= s.length(); end++) {
            String sub = s.substring(start, end);
            if (isPalindrome(sub)) {
                current.add(sub);
                backtrack(result, current, s, end);
                current.remove(current.size() - 1);
            }
        }
    }

    private static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    
}


//Input (stdin)
//aab
//
//Output (stdout)
//a a b
//aa b
//
//
//Input (stdin)
//nitin
//
//Output (stdout)
//n i t i n
//n iti n
//nitin
