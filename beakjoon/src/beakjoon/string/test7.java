package beakjoon.string;

import java.io.IOException;
import java.util.Scanner;

public class test7 {
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		int count = 0;
		int N = in.nextInt();
		for (int i = 0; i < N; i++) {
			if (check() == true) {
				count++;
			}
		}
		System.out.println(count);
	}// end of main

	//
	public static boolean check() {
		boolean[] check = new boolean[26];
		int prev = 0;
		String str = in.next();
		for (int i = 0; i < str.length(); i++) {
			int now = str.charAt(i);// char형태로 가져오니 아스키코드값으로 가능

			// 앞선 문자와 i가 같지 않을 때
			if (prev != now) {
				if (check[now - 'a'] == false) {// 처음 나오는 경우
					check[now - 'a'] = true;
					prev = now;
				} else {// 나온적이 있는 경우 (그룹단어가 아닌 경우를 의미함)
					return false;
				}
			}
			// 연속된 문자일 경우
			else {
				continue;
			}

		} // end of for
		return true;
	}// end of check
}// end of class
