package basicM2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//1002
public class test12 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());// test_case
		// x1,y1,r1,x2,y2,r2
		// -10,000<=x1,y1,x2,y2<=10,000
		// r1,r2<=10,000
		StringBuilder sb = new StringBuilder();
		while (t-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");

			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());
			int r1 = Integer.parseInt(st.nextToken());

			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());
			int r2 = Integer.parseInt(st.nextToken());
			sb.append(tangent_point(x1, y1, r1, x2, y2, r2)).append("\n");
		}//end of while
		System.out.println(sb);
	}// end of main

	// 접점개수 구하는 함수

	public static int tangent_point(int x1, int y1, int r1, int x2, int y2, int r2) {
		int distance_pow = (int) (Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		// 중점,반지름 같을 때
		if (x1 == x2 && y1 == y2 && r1 == r2) return -1;
		// 중점간 거리가 두 원의 반지름 합보다 더 길 때
		else if (distance_pow > Math.pow(r1 + r2, 2)) return 0;
		// 원안에 있으나 내접하지않을때
		else if (distance_pow < Math.pow(r2 - r1, 2)) return 0;
		// 내접할때
		else if (distance_pow == Math.pow(r2 - r1, 2)) return 1;
		// 외접할때
		else if (distance_pow == Math.pow(r2 + r1, 2)) return 1;
		else return 2;
	}// end of tangent_point
}// end of class
