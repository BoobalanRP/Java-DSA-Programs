package day22_Constructor;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class CurrencyFormatter_HR {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double amount = scanner.nextDouble();
		scanner.close();

		// Format for US currency
		NumberFormat usFormat = NumberFormat.getCurrencyInstance(Locale.US);
		String usFormatted = usFormat.format(amount);

		// Format for Indian currency
		Locale indiaLocale = new Locale("en", "IN");
		NumberFormat indiaFormat = NumberFormat.getCurrencyInstance(indiaLocale);
		String indiaFormatted = indiaFormat.format(amount);

		// Format for Chinese currency
		// Locale chinaLocale = Locale.CHINA;
		NumberFormat chinaFormat = NumberFormat.getCurrencyInstance(Locale.CHINA);
		String chinaFormatted = chinaFormat.format(amount);

		// Format for French currency
		// Locale franceLocale = Locale.FRANCE;
		NumberFormat franceFormat = NumberFormat.getCurrencyInstance(Locale.FRANCE);
		String franceFormatted = franceFormat.format(amount);
		
		
//	    String us = NumberFormat.getCurrencyInstance(Locale.US).format(payment);
//	    String china = NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
//	    String france = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);
//	    String india = NumberFormat.getCurrencyInstance(India).format(payment);

		// Print the formatted values
		System.out.println("US: " + usFormatted);
		System.out.println("India: " + indiaFormatted);
		System.out.println("China: " + chinaFormatted);
		System.out.println("France: " + franceFormatted);

	}

}

//Sample Input
//
//12324.134
//Sample Output
//
//US: $12,324.13
//India: Rs.12,324.13
//China: ￥12,324.13
//France: 12 324,13 €
