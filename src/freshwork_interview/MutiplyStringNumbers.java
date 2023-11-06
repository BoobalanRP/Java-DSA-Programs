package freshwork_interview;

import java.math.BigInteger;

public class MutiplyStringNumbers {
    public static void main(String[] args) {
        String num1 = "17";
        String num2 = "152";
        String result = multiplyStrings(num1, num2);
        System.out.println(result);
    }

    public static String multiplyStrings(String num1, String num2) {
        int m = num1.length();
        int n = num2.length();
        int[] product = new int[m + n];

        for (int i = m - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                int mul = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
                 System.out.println("mul "+mul);
                  System.out.println("product[i + j + 1] "+product[i + j + 1]+ "index "+ (i + j + 1));
                int sum = mul + product[i + j + 1];
                
                System.out.println("sum "+sum);
                product[i + j + 1] = sum % 10;
                product[i + j] += sum / 10;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int num : product) {
             System.out.println("num  "+ num);
            if (!(sb.length() == 0 && num == 0)) {
                sb.append(num);
            }
        }

        return sb.length() == 0 ? "0" : sb.toString();
    }
}
