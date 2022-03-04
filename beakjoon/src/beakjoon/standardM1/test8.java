package beakjoon.standardM1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class test8 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// (0 < A,B < 10의10000제곱)
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		String str_A = st.nextToken();
		String str_B = st.nextToken();
		// 둘 중 가장 긴 수의 길이값
		int max_length = Math.max(str_A.length(), str_B.length());
		// 배열 생성
		int[] A = new int[max_length + 1];
		int[] B = new int[max_length + 1];
		// A초기화
		for (int i = str_A.length() - 1, idx = 0; i >= 0; i--, idx++) {
			A[idx] = str_A.charAt(i) - '0';// 이러면 배열은 처음부터 들어가지만 charAt의 값은 높은 자리수부터 가져오게됨
		}
		// B초기화
		for (int i = str_B.length() - 1, idx = 0; i >= 0; i--, idx++) {
			B[idx] = str_B.charAt(i) - '0';// 이러면 배열은 처음부터 들어가지만 charAt의 값은 높은 자리수부터 가져오게됨
		}
		// 덧셈
		for (int i = 0; i < max_length; i++) {
			int value = A[i] + B[i];
			A[i] = value % 10; // 나머지
			A[i + 1] += (value / 10);// 몫
		}
		// 1자리씩 뽑아와서 sb에 넣어줌
		// 가장 높은 자리수가 0일 수도 있기 때문에 0이 아닐 경우에만 출력
		StringBuilder sb = new StringBuilder();
		if (A[max_length] != 0) {
			sb.append(A[max_length]);
		}
		// 윗줄 때문에 -1해주는거
		for (int i = max_length - 1; i >= 0; i--) {
			sb.append(A[i]);
		}
		System.out.println(sb);
	}// end of main
}// end of class
