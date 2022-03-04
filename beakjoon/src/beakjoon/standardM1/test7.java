package beakjoon.standardM1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test7 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());// (3 ≤ N ≤ 5000)

		if (N == 4 || N == 7) { // 4와 7은 어디에도 포함 X
			System.out.println(-1);
		} else if (N % 5 == 0) {
			System.out.println(N / 5);
		} else if ((N % 5) == 1 || (N % 5) == 3) {// 5의 배수이며 나머지가 1또는 3
			System.out.println((N / 5) + 1);
		} else if ((N % 5) == 2 || (N % 5) == 4) {// 5의 배수이며 나머지가 2또는 4
			System.out.println((N / 5) + 2);
		}
	}// end of main
}// end of class
