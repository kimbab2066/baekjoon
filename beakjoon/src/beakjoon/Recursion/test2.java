package beakjoon.Recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//2447
public class test2 {
	static char[][] arr;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		arr = new char[N][N];
		star(0, 0, N, false);

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				sb.append(arr[i][j]);
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}// end of main

	static void star(int x, int y, int N, boolean blank) {
		// 공백칸
		if (blank) {
			for (int i = x; i < x + N; i++) {
				for (int j = y; j < y + N; j++) {
					arr[i][j] = ' ';
				}
			}
			return;
		} // end of if

		// 1의 경우 더 쪼갤 수 없음
		if (N == 1) {
			arr[x][y] = '*';
			return;
		}
		// 3의 거듭제곱 꼴이니 3으로 나눈 몫을 구해야함
		// count 는 별 출력 누적을 의미한다함
		int size = N / 3;
		int count = 0;
		for (int i = x; i < x + N; i += size) {
			for (int j = y; j < y + N; j += size) {
				count++;
				if (count == 5) {// 공백 칸일경우(N=3일 때 중간부분)
					star(i, j, size, true);
				} else {
					star(i, j, size, false);
				}
			}
		}
	}// end of star
}// end of class
