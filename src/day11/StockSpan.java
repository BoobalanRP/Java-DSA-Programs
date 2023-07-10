package day11;

//Input (stdin)
//7
//100
//80
//60
//70
//60
//75
//85
//
//Output (stdout)
//1
//1
//1
//2
//1
//4
//6
import java.util.Scanner;

public class StockSpan {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] stockPrices = new int[n];
		for (int i = 0; i < n; i++) {
			stockPrices[i] = sc.nextInt();
		}
		int value = stockPrices[0];
		int value1 = 0;
		for (int i = 0; i < stockPrices.length; i++) {
			if (value >= stockPrices[i]) {
				System.out.println(1);
				value = stockPrices[i];
			} else {
				value1 += 2;
				System.out.println(value1);
			}
		}
	}

}
