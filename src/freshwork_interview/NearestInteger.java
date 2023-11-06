package freshwork_interview;

import java.util.Scanner;
import java.util.Stack;

import java.util.Scanner;

public class NearestInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int n = sc.nextInt();
        int value1 = num + n - (num % n);
        int value2 = num - num % n;

        if(value1 - num > num - value2)
           if(value2 == num){
                System.out.println(value2+n);
           }else{
                System.out.println(value2);
           }
        else
            System.out.println(value1);
        
    }
}


 class Mains {
	public static int NearestInteger(int num, int m) {
		int lower = num - (num % m);
		int upper = lower + m;
		if (Math.abs(num - lower) <= Math.abs(num - upper)) {
			return lower;
		} else {
			return upper;
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int m = scanner.nextInt();
		int result = NearestInteger(num, m);
		System.out.println(result);
	}
}