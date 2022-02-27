package beakjoon.function;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(arithmetic_sequence(Integer.parseInt(br.readLine())));
	}// end of main

	public static int arithmetic_sequence(int num) {
		int cnt = 0;
		if (num < 100) {
			return num;
		} else {
			cnt = 99;// 초기화
			if (num == 1000) {// 예외처리 1000은 등차 x
				num = 999;
			}
			for (int i = 100; i <= num; i++) {
				int hun = i / 100;
				int ten = (i / 10) % 10;
				int one = i % 10;

				if ((hun - ten) == (ten - one)) {
					cnt++;
				}
			}
		}

		return cnt;
	}
}// end of class
