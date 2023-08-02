package day25_interface;

import java.util.Scanner;

interface Room {
	int calculates(int no_rooms, int days);
}

class NormalRoom implements Room {
	public int calculates(int no_rooms, int days) {
		if (days == 1) {
			return 300 * no_rooms;
		} else if (days > 1 && days <= 5) {
			return 250 * no_rooms * days;
		} else {
			return 200 * no_rooms * days;
		}
	}
}

class AC_Room implements Room {
	public int calculates(int no_rooms, int days) {
		if (days == 1) {
			return 450 * no_rooms;
		} else if (days > 1 && days <= 5) {
			return 300 * no_rooms * days;
		} else {
			return 250 * no_rooms * days;
		}
	}
}

class Suite_Room implements Room {
	public int calculates(int no_rooms, int days) {
		if (days == 1) {
			return 550 * no_rooms;
		} else if (days > 1 && days <= 5) {
			return 500 * no_rooms * days;
		} else {
			return 450 * no_rooms * days;
		}
	}
}

public class RoomRentOfTheHotelUsingMultipleInheritance {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		String address = sc.nextLine();
		String mobile = sc.nextLine();
		int no_rooms = sc.nextInt();
		int days = sc.nextInt();
		int choice = sc.nextInt();
		sc.close();

		Room room;
		if (choice == 1) {
			room = new NormalRoom();
		} else if (choice == 2) {
			room = new AC_Room();
		} else if (choice == 3) {
			room = new Suite_Room();
		} else {
			System.out.println("Invalid Choice");
			return;
		}

		int roomRent = room.calculates(no_rooms, days);
		System.out.println("Name: " + name);
		System.out.println("Address: " + address);
		System.out.println("Mobile: " + mobile);
		System.out.println("Room Rent = " + roomRent);
	}
}

//Input (stdin)
//Dinesh
//xxxxx
//yyyyyy
//2
//2
//1
//
//Output (stdout)
//Name: Dinesh
//Address: xxxxx
//Mobile: yyyyyy
//Room Rent = 1000

//Input (stdin)
//Amir
//Mumbai
//85622356
//5
//5
//3
//
//Output (stdout)
//Name: Amir
//Address: Mumbai
//Mobile: 85622356
//Room Rent = 12500
