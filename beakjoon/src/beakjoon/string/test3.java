package beakjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test3 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int[] arr = new int[26];
		String s = br.readLine();

		for (int i = 0; i < s.length(); i++) {
			if (65 <= s.charAt(i) && s.charAt(i) <= 90) {// A<= <=Z도 가능
				arr[s.charAt(i) - 65]++;// 해당 인덱스 값 증가 -'A'도 가능
			} else {
				arr[s.charAt(i) - 97]++;// -'a'도 가능
			}
		}
		// logic
		int max = -1;
		char ch = '?';
		for (int i = 0; i < 26; i++) {
			if (arr[i] > max) {
				max = arr[i];
				ch = (char) (i + 65);
			} else if (arr[i] == max) {
				ch = '?';
			}
		}
		// output
		System.out.println(ch);
	}// end of main
}// end of class
