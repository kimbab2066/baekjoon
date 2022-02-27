package beakjoon.loop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());// Test case
		StringBuilder sb = new StringBuilder();

		for (int i = 1; i <= N; i++) {
			String str = br.readLine();
			int A = str.charAt(0) - '0';
			int B = str.charAt(2) - '0';
			sb.append("Case #" + i + ": ").append(A).append(" + ");
			sb.append(B).append(" = ");
			sb.append(A + B).append('\n');
		} // end of for
		br.close();
		System.out.println(sb);
	}
}
