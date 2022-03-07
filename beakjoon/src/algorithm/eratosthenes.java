package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class eratosthenes {
	public static boolean[] prime;// 소수 체크용 배열

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		make_prime(N);
		for (int i = 0; i < prime.length; i++) {
			if (prime[i] == false) {
				System.out.println(i);
			}
		}
	}// end of main

	// N이하 소수 생성 메소드
	public static void make_prime(int N) {
		prime = new boolean[N + 1];// 0~N
		// 소수면 false 아니면 true
		if (N < 2) {// 2미만의 값이라면 바로 return
			return;
		}
		prime[0] = prime[1] = true;// 0과 1이 소수가 아님을 의미

		for (int i = 2; i <= Math.sqrt(N); i++) { // 제곱근함수 Math.sqrt()
			if (prime[i] == true)
				continue; // 이미 체크된 배열은 검사하지 않고 다음 반복문으로

			// i의 배수들을 걸러주기 위한 반복문
			for (int j = i * i; j < prime.length; j += i) {
				prime[j] = true;
			}
		}
	}// end of make_prime
}// end of class
