package beakjoon.array1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test6 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		// 첫째줄
		int N = Integer.parseInt(br.readLine());
		// 테스트 케이스 입력 값:0~80 and O X
		for (int i = 0; i < N; i++) {
			int cnt = 0;
			int sum = 0;
			// 배열을 안쓴 방법
			for (byte value : br.readLine().getBytes()) {
				if (value == 'O') {
					cnt++;
					sum += cnt;
				} else {
					cnt = 0;
				}
			}
			sb.append(sum).append('\n');
		}
		System.out.println(sb);
		//
	}// end of main
}// end of class
