package beakjoon.string;

import java.io.IOException;

public class test4 {
	public static void main(String[] args) throws IOException {
		int count = 0;
		int pre_str = 32;
		int str;
		while (true) {
			str = System.in.read();

			// 입력값이 공백일 때 32가 space를 의미함
			if (str == 32) {
				if (pre_str != 32) count++;
			}
			// 입력값이 줄바꿈일 때 10이 \n을 의미함
			else if (str == 10) {
				if (pre_str != 32) count++;
				break;
			}
			pre_str = str;//현재 값을 이전 값으로 바꾸고 while문 반복
		}
		System.out.println(count);
	}// end of main
}// end of class
