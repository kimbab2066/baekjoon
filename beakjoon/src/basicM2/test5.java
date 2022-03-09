package basicM2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//1929번
public class test5 {
	public static boolean[] prime;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int M = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());

		StringBuilder sb = new StringBuilder();
		prime = new boolean[N + 1];

		for (int i = 2; i <= N; i++) {//제곱근까지 x 최댓값인N까지 반복한다는 의미
			if (prime[i]) continue;
			if (i >= M) sb.append(i).append("\n");//M보다 커지면 M<=i<=N의 범위에 포함되니 소수로 판별됨 
			for (int j = i + i; j <= N; j += i) {//나머지 제외
				prime[j] = true;
			}
		} // end of for
		System.out.println(sb);
	}// end of main
}// end of class
