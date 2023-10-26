package freshwork_interview;

import java.util.*;

public class EvaluateExpression {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String expr = in.next();
        String num = "1234567890";
        String spl = "/*+-";
        List<String> arr = new ArrayList<>();
        int i = 0;

        while (i < expr.length()) {
            int value = 0;
            while (i < expr.length() && num.contains(String.valueOf(expr.charAt(i)))) {
                value = value * 10 + Integer.parseInt(String.valueOf(expr.charAt(i)));
                i++;
            }
            arr.add(Integer.toString(value));
            
            if (i < expr.length() && spl.contains(String.valueOf(expr.charAt(i)))) {
                arr.add(String.valueOf(expr.charAt(i)));
                i++;
            }
        }

        while (arr.contains("/")) {
            int k = arr.indexOf("/");
            int FV = Integer.parseInt(arr.get(k - 1)) / Integer.parseInt(arr.get(k + 1));
            arr.set(k - 1, Integer.toString(FV));
            arr.remove(k);
            arr.remove(k);
        }
        while (arr.contains("*")) {
            int l = arr.indexOf("*");
            int FV = Integer.parseInt(arr.get(l - 1)) * Integer.parseInt(arr.get(l + 1));
            arr.set(l - 1, Integer.toString(FV));
            arr.remove(l);
            arr.remove(l);
        }
        while (arr.contains("+")) {
            int m = arr.indexOf("+");
            int FV = Integer.parseInt(arr.get(m - 1)) + Integer.parseInt(arr.get(m + 1));
            arr.set(m - 1, Integer.toString(FV));
            arr.remove(m);
            arr.remove(m);
        }
        while (arr.contains("-")) {
            int n = arr.indexOf("-");
            int FV = Integer.parseInt(arr.get(n - 1)) - Integer.parseInt(arr.get(n + 1));
            arr.set(n - 1, Integer.toString(FV));
            arr.remove(n);
        }

        System.out.println(arr.get(0));
    }
}
