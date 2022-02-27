package beakjoon.standardM1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test1 {
	public static void main(String[] args) throws IOException {
		// A = 고정비용 B = 가변비용 C = 노트북가격
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//
		String[] str = br.readLine().split(" ");
		int t_income = Integer.parseInt(str[0] + str[1]);// 총수입
		int t_cost = Integer.parseInt(str[2]);// 총비용

		do {
			if (t_income > t_cost) {

			}
		} while (t_income != t_cost);

	}// end of main
}// end of class
