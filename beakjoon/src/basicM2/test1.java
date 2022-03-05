package basicM2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class test1 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();// N은 100이하임

		int cnt = 0;
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		while (st.hasMoreTokens()) {
			boolean isPrime = true;// Prime의 뜻이 소수
			int num = Integer.parseInt(st.nextToken());
			if (num == 1) {
				continue;
			}
			for (int i = 2; i <= Math.sqrt(num); i++) {
				if (num % i == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				cnt++;
			}
		} // end of while
		System.out.println(cnt);
	}// end of main
}// end of class
