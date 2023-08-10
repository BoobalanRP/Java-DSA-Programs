package day26_polymorphisym;

import java.util.*;

class MomGift {
	int mobile;
	int laptop;
	int bike;

	public MomGift(int mobile, int laptop, int bike) {
		this.mobile = mobile;
		this.laptop = laptop;
		this.bike = bike;
	}

	public int getMomGift() {
		return mobile + laptop;
	}

	public int getDadGift() {
		return mobile + laptop + bike;
	}
}

public class BirthdayGift {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int mobile = sc.nextInt();
		int laptop = sc.nextInt();
		int bike = sc.nextInt();
		MomGift mom = new MomGift(mobile, laptop, bike);

		System.out.println(mom.getMomGift());
		System.out.println(mom.getDadGift());

		sc.close();
	}
}

//
//Input (stdin)
//12500
//3000
//2830
//
//Output (stdout)
//15500
//18330
