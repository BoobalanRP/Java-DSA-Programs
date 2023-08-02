package day25_interface;

import java.util.*;

interface Alarm {
	String Name(String name);

	String Tone(String tone);

	int AlarmTime(int time);

	String AccessInternet(String avai);
}

class RigtoneAlarm implements Alarm {
	public String Name(String name) {
		return "Calling " + name;
	}

	public int AlarmTime(int time) {
		return time;
	}

	public String Tone(String tone) {
		return "Ringing " + tone + "....";
	}

	public String AccessInternet(String avai) {
		if (avai.equals("available")) {
			return "You can access the internet";
		} else {
			return "Internet access is not available";
		}
	}
}

class AlarmQuestion {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		String alarm = sc.nextLine();
		int time = sc.nextInt();
		String inter = sc.next();
		RigtoneAlarm ring = new RigtoneAlarm();
		System.out.println(ring.Name(name));
		System.out.println("Alarm ringing at " + ring.AlarmTime(time) + " am");
		System.out.println(ring.Tone(alarm));
		System.out.println(ring.AccessInternet(inter));

		sc.close();
	}
}
