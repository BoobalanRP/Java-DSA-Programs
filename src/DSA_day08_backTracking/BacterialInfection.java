package DSA_day08_backTracking;

import java.util.Scanner;

public class BacterialInfection {
	static int MAX_ROW_SIZE = 20;
	static int MAX_COL_SIZE = 20;

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int total_rows, total_col;
		int first_infec_room_row, first_infec_room_col;
		char house_layout[][] = new char[MAX_ROW_SIZE][MAX_COL_SIZE];

		int i, j;
		total_rows = in.nextInt();
		total_col = in.nextInt();
		for (i = 0; i < total_rows; i++) {
			for (j = 0; j < total_col; j++) {
				house_layout[i][j] = in.next().charAt(0);
			}
		}
		first_infec_room_row = in.nextInt();
		first_infec_room_col = in.nextInt();
		int time_taken = compute_infec_time_wrapper(house_layout, first_infec_room_row, first_infec_room_col,
				total_rows, total_col);
		System.out.print(time_taken);
	}

	static void compute_infec_time(char house_layout[][], int current_row, int current_col, int total_rows,
			int total_col, int house_infec_time[][], int current_time) {
		if ((current_row >= total_rows) || (current_row < 0) || (current_col >= total_col) || (current_col < 0)
				|| house_layout[current_row][current_col] == 'c'
				|| current_time >= house_infec_time[current_row][current_col]) {
			return;
		}

		house_infec_time[current_row][current_col] = current_time;

		compute_infec_time(house_layout, current_row, current_col + 1, total_rows, total_col, house_infec_time,
				current_time + 1);

		compute_infec_time(house_layout, current_row - 1, current_col, total_rows, total_col, house_infec_time,
				current_time + 1);

		compute_infec_time(house_layout, current_row, current_col - 1, total_rows, total_col, house_infec_time,
				current_time + 1);

		compute_infec_time(house_layout, current_row + 1, current_col, total_rows, total_col, house_infec_time,
				current_time + 1);

		return;
	}

	static int compute_infec_time_wrapper(char house_layout[][], int first_infec_room_row, int first_infec_room_col,
			int total_rows, int total_col) {
		// Tracking time for each room
		int house_infec_time[][] = new int[MAX_ROW_SIZE][MAX_COL_SIZE];

		int i, j;
		for (i = 0; i < total_rows; i++) {
			for (j = 0; j < total_col; j++) {
				// Init infinite time for each path
				// How -1 is infinite time??
				house_infec_time[i][j] = Integer.MAX_VALUE;
			}
		}

		compute_infec_time(house_layout, first_infec_room_row, first_infec_room_col, total_rows, total_col,
				house_infec_time, 1 /* Current time */);

		int max = 0;
		for (i = 0; i < total_rows; i++) {
			for (j = 0; j < total_col; j++) {
				if ((house_infec_time[i][j] != Integer.MAX_VALUE) && (max < house_infec_time[i][j])) {
					max = house_infec_time[i][j];
				}
			}
		}
		return max;
	}

}
//
//Input (stdin)
//10 10
//o o o o o c c c c c
//c o o c o c o c o c
//o o o o o o o o o o
//c c c c c c c c c c
//o c o c o c o c o c
//c o o o o o o o o c
//o o o o o o o o o o
//c c c c c c c c c c
//o o o o o c c c c c
//o o c c c c c c c c
//2 2
//
//Output (stdout)
//8
//
//Input (stdin)
//3 4
//o c o c
//o o o o 
//c o o c
//1 2
//
//Output (stdout)
//4
