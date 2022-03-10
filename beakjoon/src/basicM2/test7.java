package basicM2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//9020번
public class test7 {
	public static boolean[] prime = new boolean[10001];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		get_prime();
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());

		while (T-- > 0) {//T가 0이 될 때 까지
			int n = Integer.parseInt(br.readLine());
			int first_partition = n / 2;
			int second_partition = n / 2;
			while (true) {
				if (!prime[first_partition] && !prime[second_partition]) {
					sb.append(first_partition).append(" ").append(second_partition).append("\n");
					break;
				}
				first_partition--;
				second_partition++;
			} // end of while
		} // end of while
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
}// end of class
