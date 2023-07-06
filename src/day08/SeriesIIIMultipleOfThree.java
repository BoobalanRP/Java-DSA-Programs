package day08;

import java.util.Scanner;

public class SeriesIIIMultipleOfThree {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		 int num = sc.nextInt();
	      int value = 1;
	      for(int i=0; i<num; i++){
	        value *=3;
	        System.out.print(value +" ");
	      
	}

}
}