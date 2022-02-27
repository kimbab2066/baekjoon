package beakjoon.array1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// N<100
		int max = 0;
		int index = 0;
		for (int i = 0; i < 9; i++) {
			int val = Integer.parseInt(br.readLine());
			if (val > max) {
				max = val;
				index = i + 1;
			}

		} // end of for
		System.out.println(max);
		System.out.println(index);
	}// end of main
}// end of class
