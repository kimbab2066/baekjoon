package beakjoon.day1;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		int result = 1;
		for (int i = 1; i <= N; i++) {
			result *= i;
			System.out.println(result);
		}
		System.out.println(result);

	}// end of main
}// end of class