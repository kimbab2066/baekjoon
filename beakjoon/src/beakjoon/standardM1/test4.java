package beakjoon.standardM1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class test4 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		// A = up B = down V = length
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int V = Integer.parseInt(st.nextToken());
		int day = (V - B) / (A - B);

		if ((V - B) % (A - B) != 0) {
			day++;
		}
		System.out.println(day);

	}// end of main
}// end of class

//3 1 7 7-1 % 3-1 = 6 % 2 = 0	6/2 = 3
//3 1 8 8-1 % 3-1 = 7 % 2 = 1	7/2 = 3
