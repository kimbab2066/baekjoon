package basicM2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//4153번
public class test10 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		while (true) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			int z = Integer.parseInt(st.nextToken());
			// 0일때 break
			if (x == 0 && y == 0 && z == 0)
				break;
			// 큰 수 비교
			if ((x * x + y * y) == z * z) sb.append("right").append("\n");
			else if (x * x == (y * y + z * z)) sb.append("right").append("\n");
			else if ((x * x + z * z) == y * y) sb.append("right").append("\n");
			else sb.append("wrong").append("\n");
		} // end of while
		System.out.println(sb);
	}// end of main
}// end of class