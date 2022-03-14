package basicM2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//3053번
public class test11 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double r = Double.parseDouble(br.readLine());

		System.out.println(r * r * Math.PI);
		System.out.println(2 * r * r);

	}// end of main
}// end of class
