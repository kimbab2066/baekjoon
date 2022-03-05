package basicM1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test3 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int X = Integer.parseInt(br.readLine());

		int cross_count = 1, prev_count_sum = 0;// 대각선 칸 개수와 해당 대각선 직전 대각선 까지의 칸의 누적 합

		while (true) {
			// 직전 대각선 누적합 + 해당 대각선 개수 이용한 범위 판별
			if (X <= prev_count_sum + cross_count) {
				if (cross_count % 2 == 1) {// 대각선의 개수가 홀수
					// 분모가 큰수
					// 분모는 대각선의 개수 -(X번째 - 직전 대각선까지의 누적합 -1)
					// 분자는 X - 대각선의 누적합
					System.out.print((cross_count - (X - prev_count_sum - 1)) + "/" + (X - prev_count_sum));
					break;
				} else {// 대각선의 개수가 짝수
					System.out.println((X - prev_count_sum) + "/" + (cross_count - (X - prev_count_sum - 1)));
					break;
				}
			} else {
				prev_count_sum += cross_count;
				cross_count++;
			}

		} // end of while
	}// end of main
}// end of class

//X가 4일 때
//prev = 1
//cross = 2
//prev = 3
//cross =3
//6