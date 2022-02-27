package beakjoon.inoutOperations;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class multiplication {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str, " ");// 구분자 " "

		int H = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		// 입력끝
		if (M < 45) {
			M = 60 - (45 - M);
			H--;
			if (H < 0)
				H = 23;
			System.out.println(H + " " + M);
		} else {
			System.out.println(H + " " + (M - 45));
		}

	}// end of main
}// end of class