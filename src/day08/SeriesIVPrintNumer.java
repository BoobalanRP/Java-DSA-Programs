package day08;

import java.util.Scanner;

public class SeriesIVPrintNumer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	      int num = sc.nextInt();
	      float value = 0.5f;
	      int power = 0;
	      for(int i =0; i<num; i++){
	         System.out.print(value +" ");
	        power = (int)Math.pow(3, i);
	        value += power;
	      
	        
	      }
	}

}
