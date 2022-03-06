package basicM2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//2581
public class test2 {
	public static boolean[] prime;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// M,N<=10,000 M<=N
		// 소수가 없을 경우 -1
		int M = Integer.parseInt(br.readLine());
		int N = Integer.parseInt(br.readLine());

		prime = new boolean[N + 1];
		get_prime();

		// 소수 합 및 최솟값
		int sum = 0;
		int min = Integer.MAX_VALUE;
		for (int i = M; i <= N; i++) {
			if (prime[i] == false) {
				sum += i;
				if (min == Integer.MAX_VALUE) {// 첫소수가 최솟값임
					min = i;
				}
			}
		}
		if (sum == 0) {
			System.out.println(-1);
		} else {
			System.out.println(sum);
			System.out.println(min);
		}

	}// end of main

	// 에라토스테네스 체 알고리즘
	public static void get_prime() {
		prime[0] = true;
		prime[1] = true;
		// 0과 1은 소수가 아님
		for (int i = 2; i <= Math.sqrt(prime.length); i++) {// 제곱근
			if (prime[i])
				continue;
			for (int j = i * i; j < prime.length; j += i) {
				prime[j] = true;
			}
		}
	}// end of get_prime
}// end of class
