package beakjoon.array1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class test5 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 과목갯수 입력
		int N = Integer.parseInt(br.readLine());
		// 현재 점수 입력
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");// 과목점수 받기
		// max값을 -1로 초기화
		int max = -1;
		double sum = 0.0;
		// max값 찾고 double에 총합
		for (int i = 0; i < N; i++) {
			int value = Integer.parseInt(st.nextToken());
			if (max < value) {
				max = value;
			}
			sum += value;
		}
		br.close();
		// 한꺼번에 연산
		System.out.println(((sum / max) * 100.0) / N);
	}
}
