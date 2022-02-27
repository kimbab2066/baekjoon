package beakjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test5 {
	public static void main(String[] args) throws IOException {
		// 각 숫자에 문자 대응시키기
		// 1은 2초 2는 3초 이런 식으로 초 증가
		// 입력받은 문자를 토대로 시간 출력
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		int count = 0;
		int k = s.length();

		for (int i = 0; i < k; i++) {
			switch (s.charAt(i)) {
			case 'A': case 'B' : case 'C' :
				count +=3;
				break;

			case 'D': case 'E' : case 'F' :
				count +=4;
				break;
				
			case 'G': case 'H' : case 'I' :
				count +=5;
				break;
				
			case 'J': case 'K' : case 'L' :
				count +=6;
				break;
				
			case 'M': case 'N' : case 'O' :
				count +=7;
				break;
				
			case 'P': case 'Q' : case 'R' : case 'S' :
				count +=8;
				break;
				
			case 'T': case 'U' : case 'V' :
				count +=9;
				break;
				
			case 'W': case 'X' : case 'Y' : case 'Z' :
				count +=10;
				break;
			}
		}
		System.out.println(count);
	}// end of main
}// end of class
