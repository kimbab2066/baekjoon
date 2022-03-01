package beakjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test1 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[26];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = -1;// -1로 초기화
		}
		String s = br.readLine();
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (arr[ch - 'a'] == -1) {
				arr[ch - 'a'] = i;
			}
		}
		for (int val : arr) {
			System.out.print(val + " ");
		}
	}// end of main
}// end of class