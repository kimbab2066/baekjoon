package beakjoon.Recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 10870번
public class test1 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		System.out.println(fibonacci(N));
	}// end of main
	
	//피보나치 수
	public static int fibonacci(int n) {
		if (n == 0) return 0;
		if (n == 1) return 1;
		return fibonacci(n - 1) + fibonacci(n - 2);
	}//end of fibonacci 
}// end of class
