package day23_Inhertence;

import java.util.Scanner;

public class PrintBikeAndScooterDetailsUsingHierarchialInheritance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the details of Sports Bike");
        System.out.println("Name of the bike : ");
        String bikeName = sc.nextLine();

        System.out.println("Color of the bike : ");
        String bikeColor = sc.nextLine();

        System.out.println("Capacity(cc) of the bike : ");
        Float bikeCC = sc.nextFloat();

        System.out.println("Speed of the bike : ");
        Integer bikeSpeed = sc.nextInt();

        System.out.println("Price of the bike : ");
        Double bikePrice = sc.nextDouble();

        System.out.println("Discount of the bike : ");
        Integer bikeDiscount = sc.nextInt();

        SportBike sportBike = new SportBike(bikeName, bikeColor, bikeCC, bikeSpeed, bikePrice, bikeDiscount);
        
        
      

        System.out.println("Enter the details of Scooter");
        System.out.println("Name of the Scooter ");
        sc.nextLine();
        String scooterName = sc.nextLine();

        System.out.println("Color of the Scooter : ");
        String scooterColor = sc.nextLine();

        System.out.println("Capacity(CC) of the Scooter : ");
        Float scooterCC = sc.nextFloat();

        System.out.println("Speed of the Scooter : ");
        Integer scooterSpeed = sc.nextInt();

        System.out.println("Price of the Scooter : ");
        Double scooterPrice = sc.nextDouble();

        System.out.println("Discount of the scooter : ");
        Integer scooterDiscount = sc.nextInt();

        System.out.println("Weight of the scooter : ");
        Integer scooterWeight = sc.nextInt();
        sportBike.display();
        Scooter scooter = new Scooter(scooterName, scooterColor, scooterCC, scooterSpeed, scooterPrice, scooterDiscount, scooterWeight);
        scooter.display();
    }
}
class Bike {
    private String color;
    private String name;
    private Float cc;
    private Integer speed;
    private Double price;

    public Bike(String name, String color, Float cc, Integer speed, Double price) {
        this.name = name;
        this.color = color;
        this.cc = cc;
        this.speed = speed;
        this.price = price;
    }

    public Double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public Float getCC() {
        return cc;
    }

    public Integer getSpeed() {
        return speed;
    }
}
class SportBike extends Bike {
    private Integer manufacturerDiscount;

    public SportBike(String name, String color, Float cc, Integer speed, Double price, Integer manufacturerDiscount) {
        super(name, color, cc, speed, price);
        this.manufacturerDiscount = manufacturerDiscount;
    }

    public void display() {
        System.out.println("Sports Bike :");
        System.out.println("Name : " + getName());
        System.out.println("Color : " + getColor());
        System.out.println("Capacity : " + getCC());
        System.out.println("Speed : " + getSpeed());
        System.out.println("Price : " + getPrice());
        System.out.println("Manufacturer Discount : " + manufacturerDiscount);
        System.out.println("Sports Bike price is " + (getPrice() - manufacturerDiscount));
    }
}
class Scooter extends Bike {
    private Integer manufacturerDiscount;
    private Integer weight;

    public Scooter(String name, String color, Float cc, Integer speed, Double price, Integer manufacturerDiscount, Integer weight) {
        super(name, color, cc, speed, price);
        this.manufacturerDiscount = manufacturerDiscount;
        this.weight = weight;
    }

    public void display() {
        System.out.println("Scooter :");
        System.out.println("Name : " + getName());
        System.out.println("Color : " + getColor());
        System.out.println("Capacity : " + getCC());
        System.out.println("Speed : " + getSpeed());
        System.out.println("Price : " + getPrice());
        System.out.println("Weight : " + weight);
        System.out.println("Manufacturer Discount : " + manufacturerDiscount);
        System.out.println("Scooter price is " + (getPrice() - manufacturerDiscount));
    }
}

//
//Input (stdin)
//Ducati
//Red
//400
//550
//100000
//9500
//Bajaj
//Grey
//110
//120
//45000
//4500
//250
//
//Output (stdout)
//Enter the details of Sports Bike
//Name of the bike :
//Color of the bike :
//Capacity(cc) of the bike :
//Speed of the bike :
//Price of the bike :
//Discount of the bike :
//Enter the details of Scooter
//Name of the Scooter
//Color of the Scooter :
//Capacity(CC) of the Scooter :
//Speed of the Scooter :
//Price of the Scooter :
//Discount of the scooter :
//Weight of the scooter :
//Sports Bike :
//Name : Ducati
//Color : Red
//Capacity : 400.0
//Speed : 550
//Price : 100000.0
//Manufacturer Discount : 9500
//Sports Bike price is 90500.0
//Scooter :
//Name : Bajaj
//Color : Grey
//Capacity : 110.0
//Speed : 120
//Price : 45000.0
//Weight : 250
//Manufacturer Discount : 4500
//Scooter price is 40500.0

