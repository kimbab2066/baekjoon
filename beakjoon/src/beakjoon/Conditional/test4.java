package beakjoon.Conditional;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class test4 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());

		if (a == b && b == c) {
			sb.append(10000 + (a * 1000));
		} else if (a == b || a == c) {
			sb.append(1000 + (a * 100));
		} else if (b == c) {
			sb.append(1000 + (b * 100));
		} else {
			sb.append((Math.max(a, Math.max(b, c)) * 100));
		}
		System.out.println(sb);

	}// end of main
}// end of class
