package beakjoon.array1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class test8 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int [] arr;
		// 첫째줄 test_case
		int test_case = Integer.parseInt(br.readLine());
		StringTokenizer st;
		// 둘째주부터 loop
		for (int i = 0; i < test_case; i++) {

			st = new StringTokenizer(br.readLine(), " ");// 학생수 및 성적들

			int N = Integer.parseInt(st.nextToken());// 학생수
			arr = new int[N];

			double sum = 0;

			for (int j = 0; j < N; j++) {
				int val = Integer.parseInt(st.nextToken());// 각 점수들
				arr[j] = val;
				sum += val;
			}
			double mean = (sum / N);// 평균
			double count = 0;// 평균이상
			for (int j = 0; j < N; j++) {
				if (arr[j] > mean) {
					count++;
				}
			}
			System.out.printf("%.3f%%\n", (count / N) * 100);
		}

	}// end of main
}// end of class
