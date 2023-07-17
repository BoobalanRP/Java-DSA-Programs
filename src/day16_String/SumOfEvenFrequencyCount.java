package day16_String;

public class SumOfEvenFrequencyCount {

	public static void main(String[] args) {
		String val = "aaabbaccccdddd";
		int count = 1;
		int sum = 0;

		for (int i = 1; i < val.length(); i++) {
			if (val.charAt(i) == val.charAt(i - 1)) {
				count++;
			} else {
				if (count % 2 == 0) {
					sum += count;
				}
				count = 1;
			}
		}

		if (count % 2 == 0) {
			sum += count;
		}

		System.out.println(sum);

	}

}
