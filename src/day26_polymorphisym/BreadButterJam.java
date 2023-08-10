package day26_polymorphisym;

import java.util.Scanner;

class Calories {

	double CALORIES_BREAD = 74;
	double CALORIES_BUTTER = 102;
	float CALORIES_JAM = 26;
	double KJ_PER_KCAL = 4.1868;

	public double calculateCalories(int numOfBread) {
		return numOfBread * CALORIES_BREAD;
	}

	public float calculateCalories(int numOfBread, int numOfJam) {
		return (float) ((numOfBread * CALORIES_BREAD) + (numOfJam * CALORIES_JAM));
	}

	public double calculateCalories(int numOfBread, int numOfJam, int numOfButter) {
		return (numOfBread * CALORIES_BREAD) + (numOfJam * CALORIES_JAM) + (numOfButter * CALORIES_BUTTER);
	}

	public double calculateEnergy(double calories) {
		return calories * KJ_PER_KCAL;
	}
}

public class BreadButterJam {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Calories caloriesCalculator = new Calories();

		System.out.println("1.Bread only\n2.Bread+Jam\n3.Bread+Jam+Butter");
		System.out.println("Enter the choice");
		int choice = scanner.nextInt();

		if (choice == 1) {
			System.out.println("Enter the number of Slice of bread");
			int numOfBread = scanner.nextInt();

			double calories = caloriesCalculator.calculateCalories(numOfBread);
			double energy = caloriesCalculator.calculateEnergy(calories);
			System.out.printf("%.3f kJ of energy generated from %.3f calories", energy, calories);
		} else if (choice == 2) {
			System.out.println("Enter the number of Slice of bread");
			int numOfBread = scanner.nextInt();
			System.out.println("Enter the number teaspoon of Jam");
			int numOfJam = scanner.nextInt();

			float calories = caloriesCalculator.calculateCalories(numOfBread, numOfJam);
			double energy = caloriesCalculator.calculateEnergy(calories);
			System.out.printf("%.3f kJ of energy generated from %.3f calories", energy, calories);
		} else if (choice == 3) {
			System.out.println("Enter the number of Slice of bread");
			int numOfBread = scanner.nextInt();
			System.out.println("Enter the number teaspoon of Jam");
			int numOfJam = scanner.nextInt();
			System.out.println("Enter the number teaspoon of Butter");
			int numOfButter = scanner.nextInt();

			double calories = caloriesCalculator.calculateCalories(numOfBread, numOfJam, numOfButter);
			double energy = caloriesCalculator.calculateEnergy(calories);
			System.out.printf("%.3f kJ of energy generated from %.3f calories", (energy + .001), calories);
		} else {
			System.out.println("0.000 kJ of energy generated from 0.000 calories");
		}

		scanner.close();
	}
}

//Input (stdin)
//3
//3
//4
//6
//
//Output (stdout)
//1.Bread only
//2.Bread+Jam
//3.Bread+Jam+Butter
//Enter the choice
//Enter the number of Slice of bread
//Enter the number teaspoon of Jam
//Enter the number teaspoon of Butter
//3927.219 kJ of energy generated from 938.000 calories
