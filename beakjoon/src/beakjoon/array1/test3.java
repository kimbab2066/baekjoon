package beakjoon.array1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test3 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int val = (Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine()));
		int[] arr = new int[10];
		String str = String.valueOf(val);
		br.close();
		//
		for (int i = 0; i < str.length(); i++) {
			arr[str.charAt(i) - '0']++;
		}
		for (int v : arr) {
			System.out.println(v);
		}

		//

	}// end of main
}// end of class
