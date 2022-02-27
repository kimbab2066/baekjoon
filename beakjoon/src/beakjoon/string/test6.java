package beakjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test6 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();

		int len = str.length();
		int count = 0;

		for (int i = 0; i < len; i++) {

			char ch = str.charAt(i);
			// c
			if (ch == 'c' && i < len - 1) {
				if (str.charAt(i + 1) == '=' || str.charAt(i + 1) == '-') {
					i++;
				}
			}
			// d
			else if (ch == 'd' && i < len - 1) {
				if (str.charAt(i + 1) == '-') {
					i++;
				} else if (str.charAt(i + 1) == 'z' && i < len - 2) {
					if (str.charAt(i + 2) == '=') {
						i += 2;
					}
				}
			}
			// l and n
			else if (ch == 'l' || ch == 'n' && i < len - 1) {
				if (str.charAt(i + 1) == 'j') {
					i++;
				}
			}
			// s and z
			else if (ch == 's' || ch == 'z' && i < len - 1) {
				if (str.charAt(i + 1) == '=') {
					i++;
				}
			}
			count++;
		} // end of for
		System.out.println(count);
	}// end of main
}// end of class
