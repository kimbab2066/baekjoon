package basicM2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//4948번
public class test6 {
	public static boolean[] prime = new boolean[246913];
	public static int[] count_arr = new int[246913];// 각 index까지의 소수의 개수를 담을 배열

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		get_prime();
		get_count();
		StringBuilder sb = new StringBuilder();
		while (true) {
			int n = Integer.parseInt(br.readLine());
			if (n == 0) break;
			sb.append(count_arr[2 * n] - count_arr[n]).append("\n");
		}
		System.out.println(sb);
	}// end of main

	// 에라토스테네스의 체
	public static void get_prime() {
		prime[0] = prime[1] = true;
		for (int i = 2; i <= Math.sqrt(prime.length); i++) {
			if (prime[i]) continue;
			for (int j = i * i; j < prime.length; j += i) {
				prime[j] = true;
			}
		}
	}// end of get_prime

	// 소수의 개수를 얻는 메소드
	public static void get_count() {
		int count = 0;
		for (int i = 2; i < prime.length; i++) {
			if (!prime[i]) count++;// 소수일경우 ++
			count_arr[i] = count;
		}
	}// end of get_count
}// end of class
