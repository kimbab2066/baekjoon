package beakjoon.array1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class test7 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int[] arr;

		int test_case = Integer.parseInt(br.readLine());
		StringTokenizer st;

		for (int i = 0; i < test_case; i++) {
			
			st = new StringTokenizer(br.readLine(), " ");// 학생수 및 점수
			
			int N = Integer.parseInt(st.nextToken());
			arr = new int[N];
			double sum = 0;// 누적 합
			for (int j = 0; j < N; j++) {
				int val = Integer.parseInt(st.nextToken());// 성적 저장
				arr[j] = val;
				sum += val;// 성적 누적 합
			}
			double mean = (sum / N);
			double count = 0;
			for (int j = 0; j < N; j++) {
				if (arr[j] > mean) {
					count++;
				}
			}
			System.out.printf("%.3f%%\n", (count / N) * 100);
		}

	}// end of main
}// end of class
