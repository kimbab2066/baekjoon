package basicM2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//11653번
public class test3 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		// 첫째 줄에 정수 N (1 ≤ N ≤ 10,000,000)이 주어진다.
		int N = Integer.parseInt(br.readLine());
		for (int i = 2; i <= Math.sqrt(N); i++) {
			while (N % i == 0) {
				sb.append(i).append("\n");
				N /= i;
			}
		} // end of for
		if (N != 1) {
			System.out.println(N);
		}
		System.out.println(sb);
	}// end of main
}// end of class
