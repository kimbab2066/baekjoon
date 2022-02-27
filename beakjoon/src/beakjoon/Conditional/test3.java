package beakjoon.Conditional;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class test3 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int H = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int T = Integer.parseInt(br.readLine());
		br.close();
		//
		M = M + T;
		while (M > 59) {
			H++;
			M -= 60;
		}
		if (H > 23) {
			H -= 24;
		}
		//if (H==24) h = 0 도 맞음
		System.out.println(H + " " + M);

	}// end of main
}// end of class
