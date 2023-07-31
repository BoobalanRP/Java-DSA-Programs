package day24_abstraction;

import java.util.*;

abstract class Title {
	abstract void BookTitle();
}

class TheTitle extends Title {
	@Override
	void BookTitle() {
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		System.out.println("The title is: " + name);
	}
}

class MovieTitle {
	public static void main(String args[]) {
		TheTitle title = new TheTitle();
		title.BookTitle();
	}
}

//Input (stdin)
//Steve Jobs
//
//Output (stdout)
//The title is: Steve Jobs