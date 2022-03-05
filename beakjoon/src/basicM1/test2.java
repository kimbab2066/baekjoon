package basicM1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test2 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());// N(1 ≤ N ≤ 1,000,000,000)
		int count = 1;// 겹수(최소루트)
		int range = 2;// 범위(최솟값 기준)

		if (N == 1) {
			System.out.println(N);
		} else {
			while (range <= N) {// N보다 커지기 직전까지
				range = range + (6 * count);// 다음 범위 최솟값으로 초기화
				count++;
			}
		}
		System.out.print(count);
	}// end of main
}// end of class