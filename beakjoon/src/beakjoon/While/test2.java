package beakjoon.While;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());// 0<=N<=99

		int cnt = 0;
		int copy = N;// copy가 N이 되면 끝나니 사용

		do {
			N = ((N % 10) * 10) + (((N / 10) + (N % 10)) % 10);
			cnt++;
		} while (copy != N);
		System.out.println(cnt);
	}// end of main
}// end of class
