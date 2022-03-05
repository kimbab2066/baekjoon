package basicM1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class test1 {
	public static void main(String[] args) throws IOException {
		// A = 고정비용 B = 가변비용 C = 상품가격
		// A + Bn = Cn
		// A = Cn - Bn
		// A = n(C-B)
		// n = A/(C-B)
		// n+1 = A/(C-B)+1
		// C-B<0
		// C<B return -1

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		if (C <= B) {
			System.out.println("-1");

		} else {
			System.out.println(A / (C - B) + 1);
		}

	}// end of main
}// end of class
