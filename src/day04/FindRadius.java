package day04;

import java.util.Scanner;

public class FindRadius {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    int radius = scanner.nextInt();
    int length = scanner.nextInt();
    
    int diameter = radius * 2;
    
    if (diameter <= length) {
      System.out.println("circle can be inside a square");
    } else {
      System.out.println("circle cannot be inside a Square");
    }
  }
}
