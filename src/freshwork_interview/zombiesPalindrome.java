package freshwork_interview;
//Dinesh is fond of video games. Due to the pandemic, he designs a video game
//called Corona world. In this game, the player enters the game with a certain energy.
//The player should defeat all the corona infected zombies to reach the next level.
//When time increases the zombies will increase double the previous minute. Anyhow
//the player can manage to fight against all the zombies. In this case, definitely the
//player can not achieve the promotion. Hence the player gets a superpower to
//
//destroy all the zombies in the current level when the current game time is a
//palindrome. Anyhow the player can manage only if he knows the time taken to get
//the superpower. Help the player by providing the minimum minutes needed to get
//the superpower by which he can destroy all the zombies. You will be provided with
//the starting time of the game.
//Input:
//05:39
//Output:
//11
//Constraints:
//Input time will be in 24 hours format
import java.util.*;

public class zombiesPalindrome {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.next();
		int hh, mm;
		hh = (str.charAt(0) - 48) * 10 + (str.charAt(1) - 48);
		mm = (str.charAt(3) - 48) * 10 + (str.charAt(4) - 48);
		int requiredTime = 0;
		while (hh % 10 != mm / 10 || hh / 10 != mm % 10) {
			++mm;
			if (mm == 60) {
				mm = 0;
				++hh;
			}
			if (hh == 24)
				hh = 0;

			++requiredTime;
		}
		System.out.print(requiredTime);
	}
}


//
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String inputTime = scanner.next();
//
//        int hours = Integer.parseInt(inputTime.substring(0, 2));
//        int minutes = Integer.parseInt(inputTime.substring(3));
//
//        int totalMinutes = hours * 60 + minutes; 
//
//        int minutesNeeded = 0;
//        while (true) {
//            totalMinutes = totalMinutes + 1; 
//             System.out.println("totalMinutes "+ totalMinutes);
//            minutesNeeded++;
//
//            int hoursNow = totalMinutes / 60;
//              System.out.println("hoursNow "+ hoursNow);
//            int minutesNow = totalMinutes % 60;
//             System.out.println("minutesNow "+ minutesNow);
//            String timeNow = String.format("%02d:%02d", hoursNow, minutesNow);
//             System.out.println("timeNow "+ timeNow);
//            if (isPalindrome(timeNow)) {
//                break;
//            }
//        }
//
//        System.out.println(minutesNeeded);
//    }
//
//  
//    public static boolean isPalindrome(String time) {
//        StringBuilder reverseTime = new StringBuilder(time).reverse();
//        return time.equals(reverseTime.toString());
//    }
//}


//import java.util.*;
//public class StringConvertToChar {
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        String str = "yum feed";
//        String[] splitArr = str.split(" ");
//        char[][] characterArr = new char[splitArr.length][];
//        for (int i = 0; i < splitArr.length; i++) {
//            characterArr[i] = splitArr[i].toCharArray();
//        }
//
//        String result = "";
//
//        for (int i = 0; i < characterArr.length; i++) {
//            StringBuilder temp = new StringBuilder();
//            int k = 0;
//            for (int j = characterArr[i].length - 1; j >= 0; j--) {
//                int val =  characterArr[i][j];
//                System.out.println("val "+ val);
//                val = val + k;
//
//                if (val > 122) {
//                    val -= 26;
//                }
//
//                char charVal = (char) val;
//                temp.append(charVal);
//                k++;
//            }
//            result += temp.reverse().toString() + " ";
//        }
//        System.out.println(result);
//
//        scan.close();
//    }
//}
